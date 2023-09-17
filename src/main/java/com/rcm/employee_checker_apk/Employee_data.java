package com.rcm.employee_checker_apk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Employee_data extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_data);
        ImageView report = findViewById(R.id.report);
        ImageView leave_duration = findViewById(R.id.leave);
        // start
        report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Report.class);
                startActivity(i);
            }
        }); // end

        // start
        leave_duration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Leave_duration.class);
                startActivity(i);
            }
        }); // end
    }
}