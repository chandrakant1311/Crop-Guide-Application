package com.example.multipage.Grains_of_K;

import android.os.Bundle;
import android.view.View;
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

public class Ragi_g_K extends AppCompatActivity {

    private EditText areaInput;
    private Button calculateButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ragi_gk);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize views
        areaInput = findViewById(R.id.areaInput);
        calculateButton = findViewById(R.id.calculateButton);
        resultTextView = findViewById(R.id.resultTextView);

        // Set click listener
        calculateButton.setOnClickListener(v -> {
            String input = areaInput.getText().toString().trim();
            if (input.isEmpty()) {
                Toast.makeText(Ragi_g_K.this, "Please enter area in acres", Toast.LENGTH_SHORT).show();
                return;
            }

            try {
                double area = Double.parseDouble(input);
                // Replace with actual Ragi seed requirement per acre if different
                double seedPerAcre = 3.0; // Example: 3kg per acre
                double totalSeed = area * seedPerAcre;
                resultTextView.setText("Seed Required: " + totalSeed + " kg");
            } catch (NumberFormatException e) {
                Toast.makeText(Ragi_g_K.this, "Invalid input", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
