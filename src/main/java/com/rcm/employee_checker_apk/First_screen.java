package com.rcm.employee_checker_apk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class First_screen extends AppCompatActivity {

    TextView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);

    view = findViewById(R.id.view1);

        Intent i = new Intent(getApplicationContext(),Voice_assistance.class);
        startActivity(i);

    }
}