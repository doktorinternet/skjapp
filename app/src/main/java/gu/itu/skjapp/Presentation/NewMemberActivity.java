/**
 * TODO Persistens i fälten så att användaren inte tvingas skriva info igen
 * TODO Fler fält, för car och för member
 * TODO Gömma "onödiga" fält och låta användaren hitta dem ifall denne vill
 * TODO Dialog/alert om vad för "fel" som hänt vid input
 * TODO säkerställa att input är korrekt
 */
package gu.itu.skjapp.Presentation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;


import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

import gu.itu.skjapp.Classes.*;
import gu.itu.skjapp.Classes.Error;
import gu.itu.skjapp.MainActivity;
import gu.itu.skjapp.R;


/**
 * A login screen that offers login via email/password.
 */
public class NewMemberActivity extends AppCompatActivity {

    private static final String LOG_TAG = "NewMember";


    /**
     * Id to identity READ_CONTACTS permission request.
     */
    private static final int REQUEST_READ_CONTACTS = 0;

    /**
     * A dummy authentication store containing known user names and passwords.
     * TODO: remove after connecting to a real authentication system.
     */
    private static final String[] DUMMY_CREDENTIALS = new String[]{
            "foo@example.com:hello", "bar@example.com:world"
    };
    /**
     * Keep track of the login task to ensure we can cancel it if requested.
     */
    private Button registerMemberButton;

    // UI references.
    private EditText mFirstNameView,
            mSurNameView,
            mStreetView,
            mStreetNrView,
            mCityView,
            mZipCodeView,
            mEmailView,
            mPhoneView,
            mPasswordView,
            mPasswordRepeatView;

    private View mProgressView;
    private View mRegisterFormView;

    @Override
    public void onBackPressed() {
        Intent i = new Intent(getBaseContext(), MainActivity.class);
        startActivity(i);
        finish();
    }

    int initEditTexts() {
        mFirstNameView = (EditText) findViewById(R.id.firstname);
        mSurNameView = (EditText) findViewById(R.id.surname);
        mStreetView = (EditText) findViewById(R.id.street);
        mStreetNrView = (EditText) findViewById(R.id.streetnr);
        mCityView = (EditText) findViewById(R.id.city);
        mZipCodeView = (EditText) findViewById(R.id.zipcode);
        mEmailView = (EditText) findViewById(R.id.email);
        mPhoneView = (EditText) findViewById(R.id.phone);
        mPasswordView = (EditText) findViewById(R.id.password);
        mPasswordRepeatView = (EditText) findViewById(R.id.password_again);
        return 0;
    }

    /**
     * Listener for saving member data
     */
    View.OnClickListener registerMemberButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.d(LOG_TAG, "Here we click \"registrera\"");
            attemptSaveMemberData();
        }
    };


    void initButtons(){
        registerMemberButton = (Button) findViewById(R.id.register_member_btn);
        assert registerMemberButton != null;
        registerMemberButton.setOnClickListener(registerMemberButtonListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "GENESIS");
        setContentView(R.layout.activity_add_new_member);
        // Set up the register form.
        initEditTexts();
        initButtons();
        // Initiate button


        mRegisterFormView = findViewById(R.id.register_form);
        mProgressView = findViewById(R.id.login_progress);

        /** Some autogenerated listener for Editviews
         mPasswordView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
        @Override public boolean onEditorAction(TextView textView, int id, KeyEvent keyEvent) {
        if (id == R.id.login || id == EditorInfo.IME_NULL) {
        attemptLogin();
        return true;
        }
        return false;
        }
        });*/


    }

    /**
     * TODO kanske dessa två följande skall finnas i en annan klass som pratar med DB?
     *
     * @return
     */

    private ArrayList<String> editTextToString() {
        ArrayList<EditText> textViews = new ArrayList<>();
        ArrayList<String> indata = new ArrayList<>();
        textViews.add(mFirstNameView);
        textViews.add(mSurNameView);
        textViews.add(mStreetView);
        textViews.add(mStreetNrView);
        textViews.add(mZipCodeView);
        textViews.add(mCityView);
        textViews.add(mEmailView);
        textViews.add(mPhoneView);
        textViews.add(mPasswordView);
        for (EditText et : textViews) {
            if (et.getText().toString() != null || et.getText().toString().equals("")) {
                indata.add(et.getText().toString());
            } else {
                indata.add(Error.getInstance(1).status);
            }
        }
        return indata;
    }

    /**
     * @param indata
     * @return
     */
    private int populateAndSaveMember(ArrayList<String> indata) {

        /*Address address = new Address(indata.get(2),
                indata.get(3),
                indata.get(4),
                indata.get(5));
        Member member = new Member(indata.get(0),
                indata.get(1),
                address,
                indata.get(6),
                indata.get(6),
                indata.get(7),
                indata.get(8));*/

        if (saveMemberInDB(
                new Member(indata.get(0),
                        indata.get(1),
                        new Address(indata.get(2),
                                indata.get(3),
                                indata.get(4),
                                indata.get(5)),
                        indata.get(6),
                        indata.get(6),
                        indata.get(7),
                        indata.get(8)))) {
            return 0;
        } else {
            return 1;
        }
    }

    /**
     * STUB
     * TODO this method should be in some DB handler but have not created it yet
     *
     * @param member
     * @return
     */
    private boolean saveMemberInDB(Member member) {
        System.out.println(member.toString());
        return true;
    }

    public void attemptSaveMemberData() {

        String em, pw;
        em = mEmailView.getText().toString();
        pw = mPasswordView.getText().toString();

        if (isEmailValid(em) && isPasswordValid(pw)) {
            int i = populateAndSaveMember(editTextToString());
            if (i == 0) {

            } else {
                System.out.println(Error.getInstance(i).status);
            }
        }
    }


    /**
     * Attempts to sign in or register the account specified by the login form.
     * If there are form errors (invalid email, missing fields, etc.), the
     * errors are presented and no actual login attempt is made.
     */
    private void attemptLogin() {

        // Reset errors.
        mEmailView.setError(null);
        mPasswordView.setError(null);

        // Store values at the time of the login attempt.
        String email = mEmailView.getText().toString();
        String password = mPasswordView.getText().toString();

        boolean cancel = false;
        View focusView = null;

        // Check for a valid password, if the user entered one.
        if (!TextUtils.isEmpty(password) && !isPasswordValid(password)) {
            mPasswordView.setError(getString(R.string.error_invalid_password));
            focusView = mPasswordView;
            cancel = true;
        }

        // Check for a valid email address.
        if (TextUtils.isEmpty(email)) {
            mEmailView.setError(getString(R.string.error_field_required));
            focusView = mEmailView;
            cancel = true;
        } else if (!isEmailValid(email)) {
            mEmailView.setError(getString(R.string.error_invalid_email));
            focusView = mEmailView;
            cancel = true;
        }

        if (cancel) {
            // There was an error; don't attempt login and focus the first
            // form field with an error.
            focusView.requestFocus();
        } else {
            // Show a progress spinner, and kick off a background task to
            // perform the user login attempt.
            showProgress(true);
        }
    }

    private boolean isEmailValid(String email) {
        //TODO: Replace this with your own logic
        return email.contains("@");
    }

    private boolean isPasswordValid(String password) {
        //TODO: Replace this with your own logic
        return password.length() > 4;
    }

    /**
     * Shows the progress UI and hides the login form.
     */
    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR2)
    private void showProgress(final boolean show) {
        // On Honeycomb MR2 we have the ViewPropertyAnimator APIs, which allow
        // for very easy animations. If available, use these APIs to fade-in
        // the progress spinner.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2) {
            int shortAnimTime = getResources().getInteger(android.R.integer.config_shortAnimTime);

            mRegisterFormView.setVisibility(show ? View.GONE : View.VISIBLE);
            mRegisterFormView.animate().setDuration(shortAnimTime).alpha(
                    show ? 0 : 1).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    mRegisterFormView.setVisibility(show ? View.GONE : View.VISIBLE);
                }
            });

            mProgressView.setVisibility(show ? View.VISIBLE : View.GONE);
            mProgressView.animate().setDuration(shortAnimTime).alpha(
                    show ? 1 : 0).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    mProgressView.setVisibility(show ? View.VISIBLE : View.GONE);
                }
            });
        } else {
            // The ViewPropertyAnimator APIs are not available, so simply show
            // and hide the relevant UI components.
            mProgressView.setVisibility(show ? View.VISIBLE : View.GONE);
            mRegisterFormView.setVisibility(show ? View.GONE : View.VISIBLE);
        }
    }
}


