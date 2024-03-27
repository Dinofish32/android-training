package com.scoutingapp.titantraining;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class mainactivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity2);

        TextView textViewName = findViewById(R.id.Name2);
        TextView textViewAge = findViewById(R.id.age2);
        TextView textViewEmail = findViewById(R.id.email2);
        TextView textViewBirthdate = findViewById(R.id.birthday2);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int age = intent.getIntExtra("age", 0);
        String email = intent.getStringExtra("email");
        String birthday = intent.getStringExtra("birthday");

        textViewName.setText("Name: " + name);
        textViewAge.setText("Age: " + age);
        textViewEmail.setText("Email: " + email);
        textViewBirthdate.setText("Birthday: " + birthday);
    }
}