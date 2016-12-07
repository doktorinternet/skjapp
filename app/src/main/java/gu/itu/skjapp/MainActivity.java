package gu.itu.skjapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import gu.itu.skjapp.Presentation.AddTripActivity;

public class MainActivity extends AppCompatActivity {

    private Button startAddTripActivityBtn;

    View.OnClickListener startAddTripActButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(getBaseContext(), AddTripActivity.class);
            startActivity(i);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
