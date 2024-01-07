package com.example.spotmyacneapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button register = findViewById(R.id.registermain);
        Button login = findViewById(R.id.loginmain);

        register.setOnClickListener(view -> {
            Log.d("RegisterButton", "Butonul de register a fost apăsat."); // Mesaj de log pentru a confirma apăsarea butonului

            Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(intent);

            Log.d("RegisterButton", "Redirecționare către RegisterActivity."); // Mesaj de log pentru a confirma redirecționarea

        });

        login.setOnClickListener(view -> {

            Log.d("LoginButton", "Butonul de login a fost apăsat."); // Mesaj de log pentru a confirma apăsarea butonului

            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(intent);

            Log.d("LoginButton", "Redirecționare către HomeActivity."); // Mesaj de log pentru a confirma redirecționarea


        });

        /*
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomnavigationview);
        bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.home){
                    return true;
                } else if (item.getItemId() == R.id.map) {
                    startActivity(new Intent(getApplicationContext(),MapActivity.class));
                    overridePendingTransition(0,0);
                    return true;
                } else if (item.getItemId() == R.id.calendar) {
                    startActivity(new Intent(getApplicationContext(),CalendarActivity.class));
                    overridePendingTransition(0,0);
                    return true;
                } else if (item.getItemId() == R.id.profile) {
                    startActivity(new Intent(getApplicationContext(),ProfileActivity.class));
                    overridePendingTransition(0,0);
                    return true;
                }
                return false;
            }
        });*/
    }



}