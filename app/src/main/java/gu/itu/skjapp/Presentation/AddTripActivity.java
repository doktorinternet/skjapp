/**
 * TODO beräkna sluttid från googlemaps
 * TODO initiera och fixa spinners alternativt gör om, gillar inte idén med spinners, de är långsamma
 */
package gu.itu.skjapp.presentation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.github.jjobes.slidedatetimepicker.SlideDateTimeListener;
import com.github.jjobes.slidedatetimepicker.SlideDateTimePicker;

import java.util.Date;

import gu.itu.skjapp.MainActivity;
import gu.itu.skjapp.R;


public class AddTripActivity extends AppCompatActivity {

    public  static Button setTimeButton; // TODO fixa detta på nge vis
    private Button saveTripButton;
    private EditText startTextField, stopTextField;
    private Spinner passengerSpinner, carSpinner;

    public static void setTimeButtonText(String text){
        setTimeButton.setText(text);
    }

    void initSpinners(){

    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(getBaseContext(), MainActivity.class);
        startActivity(i);
    }

    View.OnClickListener setTimeButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            new SlideDateTimePicker.Builder(getSupportFragmentManager())
                    .setListener(listener)
                    .setInitialDate(new Date())
                    .setIs24HourTime(true)
                    .build()
                    .show();
        }
    };

    View.OnClickListener saveTripButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v)
        {
            // Save the time, date and addresses to database. Also whatever happens in the spinners
        }
    };

    View.OnClickListener selectStartAddressField = new View.OnClickListener() {
        @Override
        public void onClick(View v)
        { //TODO skriv om denna så att defaulttext försvinner på klick. Omvandla från editable
            /*String temp = startTextField.getText();
            if (startTextField.getText().equals(label_start_edittext)) {
                startTextField.setText("", EDITABLE);
            }*/
        }
    };

    public void setupElementProperties(){
        setTimeButton = (Button) findViewById(R.id.start_timepicker_btn);
        assert setTimeButton != null;
        setTimeButton.setOnClickListener(setTimeButtonListener);

        saveTripButton = (Button) findViewById(R.id.save_trip_btn);
        assert saveTripButton  != null;
        saveTripButton.setOnClickListener(saveTripButtonListener);

        startTextField = (EditText) findViewById(R.id.start_address_edittext);
        assert startTextField != null;
        startTextField.setOnClickListener(selectStartAddressField);
    }

    private SlideDateTimeListener listener = new SlideDateTimeListener() {

        @Override
        public void onDateTimeSet(Date date)
        {
            // Do something with the date. This Date object contains
            // the date and time that the user has selected.

            setTimeButton.setText(toString());
        }

        @Override
        public void onDateTimeCancel()
        {
            // Overriding onDateTimeCancel() is optional.
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_trip);
        setupElementProperties();
    }
}


