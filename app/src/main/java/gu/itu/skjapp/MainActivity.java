package gu.itu.skjapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import gu.itu.skjapp.presentation.AddTripActivity;
import gu.itu.skjapp.presentation.NewMemberActivity;
import gu.itu.skjapp.presentation.ProfileActivity;

public class MainActivity extends AppCompatActivity {

    private Button startAddTripActivityBtn;
    private Button startMapActivityBtn;
    private Button addNewMemberBtn;
    private Button loginBtn;

    View.OnClickListener startMapActButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(getBaseContext(), MapsActivity.class);
            startActivity(i);
            finish();
        }
    };

    View.OnClickListener startAddTripActButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(getBaseContext(), AddTripActivity.class);
            startActivity(i);
            finish();
        }
    };

    View.OnClickListener addNewMemberButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(getBaseContext(), NewMemberActivity.class);
            startActivity(i);
            finish();
        }
    };

    View.OnClickListener loginButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            /**
             *  Add calls to code verifying if member exists
             */

            Intent i = new Intent(getBaseContext(), ProfileActivity.class);
            startActivity(i);
            finish();
        }
    };

    void initButtons(){

        startMapActivityBtn = (Button) findViewById(R.id.start_map_activity_btn);
        assert startMapActivityBtn != null;
        startMapActivityBtn.setOnClickListener(startMapActButtonListener);

        loginBtn = (Button) findViewById(R.id.login_btn);
        assert loginBtn != null;
        loginBtn.setOnClickListener(loginButtonListener);

        startAddTripActivityBtn = (Button) findViewById(R.id.start_add_trip_activity_btn);
        assert startAddTripActivityBtn != null;
        startAddTripActivityBtn.setOnClickListener(startAddTripActButtonListener);

        addNewMemberBtn = (Button) findViewById(R.id.add_new_member_btn);
        assert addNewMemberBtn != null;
        addNewMemberBtn.setOnClickListener(addNewMemberButtonListener);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButtons();
    }
}
