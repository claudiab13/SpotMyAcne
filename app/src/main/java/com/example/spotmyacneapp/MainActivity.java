package com.example.spotmyacneapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button register = findViewById(R.id.registermain);
        Button login  = findViewById(R.id.login);

        register.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(intent);
        }) ;

        login.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(intent);
        }) ;
    }
}