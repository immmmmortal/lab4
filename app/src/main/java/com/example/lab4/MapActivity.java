package com.example.lab4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MapActivity extends AppCompatActivity {
    EditText coordinatesInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        coordinatesInput = findViewById(R.id.et_coordinates);

        Button showOnMapButton = findViewById(R.id.btn_open_map);
        showOnMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String coordinates = coordinatesInput.getText().toString();

                // URL to open Google Maps with the given coordinates
                String url = "https://www.google.com/maps/search/?api=1&query=" + coordinates;

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}
