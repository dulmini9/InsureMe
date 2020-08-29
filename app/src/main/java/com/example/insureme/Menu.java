package com.example.insureme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Menu extends AppCompatActivity {

    TextView savedcalc = findViewById(R.id.savecalbtn);
    ImageView carimg = findViewById(R.id.vehicleimg);
    ImageView bikeimg = findViewById(R.id.bikeimg);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        savedcalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this,SavedCalculations.class));
            }
        });

        carimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this,Vehicles.class));
            }
        });
        bikeimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this,TwoWheelers.class));
            }
        });
    }
}