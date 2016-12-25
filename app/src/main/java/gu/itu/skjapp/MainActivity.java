package gu.itu.skjapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import gu.itu.skjapp.Presentation.AddTripActivity;
import gu.itu.skjapp.Presentation.NewMemberActivity;

public class MainActivity extends AppCompatActivity {

    private Button startAddTripActivityBtn;
    private Button startMapActivityBtn;
    private Button addNewMemberButton;

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

    void initButtons(){

        startMapActivityBtn = (Button) findViewById(R.id.start_map_activity_btn);
        assert startMapActivityBtn != null;
        startMapActivityBtn.setOnClickListener(startMapActButtonListener);

        startAddTripActivityBtn = (Button) findViewById(R.id.start_add_trip_activity_btn);
        assert startAddTripActivityBtn != null;
        startAddTripActivityBtn.setOnClickListener(startAddTripActButtonListener);

        addNewMemberButton = (Button) findViewById(R.id.add_new_member_activity_btn);
        assert addNewMemberButton != null;
        addNewMemberButton.setOnClickListener(addNewMemberButtonListener);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButtons();
    }
}
