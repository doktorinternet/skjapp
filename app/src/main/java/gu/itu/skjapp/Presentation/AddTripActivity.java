package gu.itu.skjapp.Presentation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Date;

import gu.itu.skjapp.MainActivity;
import gu.itu.skjapp.Presentation.slideDateTimePicker.SlideDateTimeListener;
import gu.itu.skjapp.Presentation.slideDateTimePicker.SlideDateTimePicker;
import gu.itu.skjapp.R;

import static android.widget.TextView.BufferType.EDITABLE;
import static gu.itu.skjapp.R.string.label_start_edittext;

// TODO Ändra så enbart en knapp krävs för att välja starttid, beräkna sluttid från googlemaps
// TODO
public class AddTripActivity extends AppCompatActivity {

    private Button setTimeButton, saveTripButton;
    private EditText startTextField, stopTextField;

    @Override
    public void onBackPressed() {
        Intent i = new Intent(getBaseContext(), MainActivity.class);
        startActivity(i);
    }

    View.OnClickListener setTimeButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) { // TODO byt plats på tid och datum i dialogen s tid visas först kram
            new SlideDateTimePicker.Builder(getSupportFragmentManager())
                    .setListener(listener)
                    .setInitialDate(new Date())
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


