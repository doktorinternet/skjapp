package gu.itu.skjapp.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import gu.itu.skjapp.MainActivity;
import gu.itu.skjapp.R;

/**
 * Created by Anton on 2017-05-25.
 */

public class ProfileActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.initial_menu);
    }

    public void onBackPressed() {
        Intent i = new Intent(getBaseContext(), MainActivity.class);
        startActivity(i);
    }
}
