package gu.itu.skjapp.Presentation;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;

import java.util.Calendar;

import gu.itu.skjapp.MainActivity;
import gu.itu.skjapp.R;

public class AddTripActivity extends AppCompatActivity {

    private Button startTPButton, startDPButton, destinationTPButton, destinationDPButton;

    @Override
    public void onBackPressed(){
        Intent i = new Intent(getBaseContext(), MainActivity.class);
        startActivity(i);
    }

    View.OnClickListener startTPButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            showTimePickerDialog(v);
        }
    };

    View.OnClickListener startDPButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            showDatePickerDialog(v);
        }
    };

    View.OnClickListener destinationTPButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            showTimePickerDialog(v);
        }
    };

    View.OnClickListener destinationDPButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            showDatePickerDialog(v);
        }
    };


    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }

    public void showTimePickerDialog(View v) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), "timePicker");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_trip);

        startTPButton = (Button) findViewById(R.id.start_tp_button);
        assert startTPButton != null;
        startTPButton.setOnClickListener(startTPButtonListener);

        startDPButton = (Button) findViewById(R.id.start_dp_button);
        assert startDPButton != null;
        startDPButton.setOnClickListener(startDPButtonListener);

        destinationTPButton = (Button) findViewById(R.id.destination_tp_button);
        assert destinationTPButton != null;
        destinationTPButton.setOnClickListener(destinationDPButtonListener);

        destinationDPButton = (Button) findViewById(R.id.destination_dp_button);
        assert destinationDPButton != null;
        destinationDPButton.setOnClickListener(destinationDPButtonListener);

    }

    public static class DatePickerFragment extends DialogFragment
            implements DatePickerDialog.OnDateSetListener {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Use the current date as the default date in the picker
            final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            // Create a new instance of DatePickerDialog and return it
            return new DatePickerDialog(getActivity(), this, year, month, day);
        }

        public void onDateSet(DatePicker view, int year, int month, int day) {
            // Do something with the date chosen by the user
        }
    }

    public static class TimePickerFragment extends DialogFragment
            implements TimePickerDialog.OnTimeSetListener {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Use the current time as the default values for the picker
            final Calendar c = Calendar.getInstance();
            int hour = c.get(Calendar.HOUR_OF_DAY);
            int minute = c.get(Calendar.MINUTE);

            // Create a new instance of TimePickerDialog and return it
            return new TimePickerDialog(getActivity(), this, hour, minute,
                    DateFormat.is24HourFormat(getActivity()));
        }

        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            // Do something with the time chosen by the user
        }
    }

}

