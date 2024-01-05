package com.example.spotmyacneapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

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
        });
*/
        Button map = findViewById(R.id.map);
        Button calendar = findViewById(R.id.calendar);
        Button profile = findViewById(R.id.profile);

        map.setOnClickListener(view -> {
            Intent intent = new Intent(HomeActivity.this, MapActivity.class);
            startActivity(intent);
        });

        calendar.setOnClickListener(view -> {
            Intent intent = new Intent(HomeActivity.this, CalendarActivity.class);
            startActivity(intent);
        });

        profile.setOnClickListener(view -> {
            Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
            startActivity(intent);
        });
    }
}

