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

public class HorseGram_g_K extends AppCompatActivity {

    private EditText areaInput;
    private Button calculateButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_horse_gram_gk);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize views
        areaInput = findViewById(R.id.areaInput);
        calculateButton = findViewById(R.id.calculateButton);
        resultTextView = findViewById(R.id.resultTextView);

        // Set click listener on the button
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateSeedRequired();
            }
        });
    }

    private void calculateSeedRequired() {
        String areaText = areaInput.getText().toString().trim();

        if (areaText.isEmpty()) {
            Toast.makeText(this, "Please enter the area.", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double areaInAcres = Double.parseDouble(areaText);

            // Example calculation: Horse Gram seed rate (kg per acre)
            double seedRatePerAcre = 10.0; // Assume 10 kg per acre

            double totalSeedRequired = areaInAcres * seedRatePerAcre;

            String result = "Seed Required: " + String.format("%.2f", totalSeedRequired) + " kg";
            resultTextView.setText(result);

        } catch (NumberFormatException e) {
            Toast.makeText(this, "Invalid input. Please enter a valid number.", Toast.LENGTH_SHORT).show();
        }
    }
}
