package com.scoutingapp.titantraining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inputName;
    EditText inputEmail;
    EditText inputAge;
    EditText inputBirthday;
    String name;
    String email;
    String age;
    String birthday;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nexted(View view){
        Intent i = new Intent(this, MainActivity2.class);
        inputName = findViewById(R.id.nameinput);
        String name = inputName.getText().toString();
        inputAge = findViewById(R.id.ageinput);
        String age = inputAge.getText().toString();
        inputEmail = findViewById(R.id.emailinput);
        String email = inputEmail.getText().toString();
        inputBirthday = findViewById(R.id.birthdayinput);
        String birthday = inputBirthday.getText().toString();
        i.putExtra("name", name);
        i.putExtra("age", age);
        i.putExtra("email", email);
        i.putExtra("birthday", birthday);

        startActivity(i);
    }

}