package com.example.spotmyacneapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class CalendarActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        ImageButton back = findViewById(R.id.backCalendar);

        back.setOnClickListener(view -> {
            Log.d("BackCalendar", "Butonul backCalendar a fost apăsat."); // Mesaj de log pentru a confirma apăsarea butonului

            Intent intent = new Intent(CalendarActivity.this, HomeActivity.class);
            startActivity(intent);


        });
/*
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomnavigationview);
        bottomNavigationView.setSelectedItemId(R.id.calendar);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.home){
                    startActivity(new Intent(getApplicationContext(),HomeActivity.class));
                    overridePendingTransition(0,0);
                    return true;
                } else if (item.getItemId() == R.id.map) {
                    startActivity(new Intent(getApplicationContext(),MapActivity.class));
                    overridePendingTransition(0,0);
                    return true;
                } else if (item.getItemId() == R.id.calendar) {
                    return true;
                }
                return false;
            }
        });*/

    }
}
