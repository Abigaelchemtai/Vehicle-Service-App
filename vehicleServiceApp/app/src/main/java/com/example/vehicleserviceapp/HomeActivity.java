package com.example.vehicleserviceapp;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button btnCurrentLocation = findViewById(R.id.btnCurrentLocation);

        btnCurrentLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCurrentLocationActivity();
            }
        });
    }

    private void openCurrentLocationActivity() {
        startActivity(new Intent(HomeActivity.this, CurrentLocationActivity.class));
    }
}

