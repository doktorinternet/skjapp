package gu.itu.skjapp.Presentation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import gu.itu.skjapp.MainActivity;
import gu.itu.skjapp.R;

public class AddTripActivity extends AppCompatActivity {

    private Button startTPButton;
    private Button startDPButton;
    private Button destinationTPButton;
    private Button destinationDPButton;

    @Override
    public void onBackPressed(){
        Intent i = new Intent(getBaseContext(), MainActivity.class);
        startActivity(i);
    }

    View.OnClickListener startTPButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

    View.OnClickListener startDPButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

    View.OnClickListener destinationTPButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

    View.OnClickListener destinationDPButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_trip);

        startTPButton = (Button) findViewById(R.id.);
        assert startTPButton != null;
        startTPButton.setOnClickListener(startTPButtonListener);

        startDPButton = (Button) findViewById(R.id.check_out_btn);
        assert startDPButton != null;
        startDPButton.setOnClickListener(startDPButtonListener);

        destinationTPButton = (Button) findViewById(R.id.view_log_btn);
        assert destinationTPButton != null;
        destinationTPButton.setOnClickListener(startTPButtonListener);

        destinationDPButton = (Button) findViewById(R.id.view_log_btn);
        assert destinationDPButton != null;
        destinationDPButton.setOnClickListener(startDPButtonListener);

    }



}
