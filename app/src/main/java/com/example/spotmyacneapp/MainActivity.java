package com.example.spotmyacneapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity /*implements OnMapReadyCallback*/ {
    /*private GoogleMap myMap;
    private final int FINE_PERMISSION_CODE = 1;
    Location currentLocation;
    FusedLocationProviderClient fusedLocationProviderClient;
*/
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


        //fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
        //getLastLocation();



    }
/*
    private void getLastLocation() {
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION}, FINE_PERMISSION_CODE);
            return;
        }
        Task<Location> task = fusedLocationProviderClient.getLastLocation();
        task.addOnSuccessListener(new OnSuccessListener<Location>() {
            @Override
            public void onSuccess(Location location) {
                if(location != null){
                    currentLocation = location;

                    SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
                    mapFragment.getMapAsync((OnMapReadyCallback) MainActivity.this);

                }
            }
        });
    }

    public void onMapReady(@NonNull GoogleMap googleMap) {

        myMap = googleMap;

        LatLng sydney = new LatLng(-34, 151);
        myMap.addMarker(new MarkerOptions().position(sydney).title("Sydney"));
        CameraUpdateFactory CameraUpdateFactory = null;
        myMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

    }

*/
}