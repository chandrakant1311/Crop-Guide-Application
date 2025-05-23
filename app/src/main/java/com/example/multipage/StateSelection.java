package com.example.multipage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.multipage.MenuAll.MenuKerala;
import com.example.multipage.MenuAll.MenuMaharashtra;
import com.example.multipage.MenuAll.MenuOdisha;
import com.example.multipage.MenuAll.MenuPunjab;

public class StateSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_state_selection);

        // Find the Spinner (Dropdown)
        Spinner locationSpinner = findViewById(R.id.spinner);

        // Find the Back Button
        ImageButton backButton = findViewById(R.id.backButton); // <-- Added

        // Set click listener for back button
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirect to LoginPage
                Intent intent = new Intent(StateSelection.this, Login.class);
                startActivity(intent);
                finish(); // Optional: finish this activity so user can't come back with back button
            }
        });

        // Array of locations
        String[] locations = {"Select a State", "Maharashtra", "Punjab", "Kerala", "Odisha"};

        // Set up the adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, locations);
        locationSpinner.setAdapter(adapter);

        // Handle location selection
        locationSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position > 0) { // Ignore the default "Select a State"
                    String selectedLocation = locations[position];
                    Toast.makeText(StateSelection.this, "Selected: " + selectedLocation, Toast.LENGTH_SHORT).show();

                    if (selectedLocation.equals("Maharashtra")) {
                        startActivity(new Intent(StateSelection.this, MenuMaharashtra.class));
                    }
                    if (selectedLocation.equals("Kerala")) {
                        startActivity(new Intent(StateSelection.this, MenuKerala.class));
                    }
                    if (selectedLocation.equals("Punjab")) {
                        startActivity(new Intent(StateSelection.this, MenuPunjab.class));
                    }
                    if (selectedLocation.equals("Odisha")) {
                        startActivity(new Intent(StateSelection.this, MenuOdisha.class));
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Do nothing if nothing is selected
            }
        });
    }
}
