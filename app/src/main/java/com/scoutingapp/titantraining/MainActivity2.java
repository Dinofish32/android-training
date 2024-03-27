package com.scoutingapp.titantraining;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.scoutingapp.titantraining.databinding.ActivityMain2Binding;


public class MainActivity2 extends AppCompatActivity {
    TextView name;
    TextView age;
    TextView email;
    TextView birthday;
    String nameo;
    String ageo;
    String emailo;
    String birthdayo;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        email = findViewById(R.id.email);
        birthday = findViewById(R.id.birthday);
        Bundle extras = getIntent().getExtras();
        nameo = extras.getString("name");
        ageo = extras.getString("age");
        emailo = extras.getString("email");
        birthdayo = extras.getString("birthday");
        name.setText(nameo);
        age.setText(ageo);
        email.setText(emailo);
        birthday.setText(birthdayo);
    }
    }
    public void back(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }


}