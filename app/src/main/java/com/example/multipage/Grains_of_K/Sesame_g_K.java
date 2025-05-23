package com.example.multipage.Grains_of_K;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.multipage.R;

public class Sesame_g_K extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);  // Ensures edge-to-edge layout
        setContentView(R.layout.activity_sesame_gk);  // Set the XML layout

        // Apply window insets for proper padding with system bars (e.g., status bar)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize UI components
        EditText areaInput = findViewById(R.id.areaInput);  // Input for area in acres
        Button calculateButton = findViewById(R.id.calculateButton);  // Button to trigger calculation
        TextView resultTextView = findViewById(R.id.resultTextView);  // TextView to display result

        // Set up calculate button click listener
        calculateButton.setOnClickListener(v -> {
            String areaText = areaInput.getText().toString();

            if (areaText.isEmpty()) {
                // Show a Toast if no area is entered
                Toast.makeText(Sesame_g_K.this, "Please enter an area", Toast.LENGTH_SHORT).show();
            } else {
                // Convert the area to a double and calculate the seed required
                double area = Double.parseDouble(areaText);
                double seedRequired = area * 5;  // Example formula for seed required (5 kg per acre)

                // Display the result
                resultTextView.setText("Seed Required: " + seedRequired + " kg");
            }
        });
    }
}
