package com.scoutingapp.titantraining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button nextbutton;
    TextView textView;
    EditText inputText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextbutton=(Button) findViewById(R.id.next_button);
        EditText editTextName = findViewById(R.id.Name2);
        EditText editTextAge = findViewById(R.id.age2);
        EditText editTextEmail = findViewById(R.id.email2);
        EditText editTextBirthdate = findViewById(R.id.birthday2);

        String name = editTextName.getText().toString();
        int age = Integer.parseInt(editTextAge.getText().toString());
        String email = editTextEmail.getText().toString();
        String birthdate = editTextBirthdate.getText().toString();

        Intent intent2 = new Intent(this, mainactivity2.class);
        intent2.putExtra("NAME", name);
        intent2.putExtra("AGE", age);
        intent2.putExtra("EMAIL", email);
        intent2.putExtra("BIRTHDATE", birthdate);
        startActivity(intent2);
        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, mainactivity2.class);
                startActivity(intent);
                finish();



            }

        });

    }




}