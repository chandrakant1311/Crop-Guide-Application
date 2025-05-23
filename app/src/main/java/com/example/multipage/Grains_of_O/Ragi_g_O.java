package com.example.multipage.Grains_of_O;

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

public class Ragi_g_O extends AppCompatActivity {

    private EditText areaInput;
    private Button calculateButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ragi_go);

        // Set system bar insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Link views with IDs
        areaInput = findViewById(R.id.areaInput);
        calculateButton = findViewById(R.id.calculateButton);
        resultTextView = findViewById(R.id.resultTextView);

        // Set button click action
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateSeeds();
            }
        });
    }

    private void calculateSeeds() {
        String areaStr = areaInput.getText().toString().trim();
        if (areaStr.isEmpty()) {
            Toast.makeText(this, "Please enter the area in acres", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double area = Double.parseDouble(areaStr);

            if (area <= 0) {
                Toast.makeText(this, "Enter a valid positive area!", Toast.LENGTH_SHORT).show();
                return;
            }

            // 1 acre needs approximately 6-8 kg seeds for Ragi.
            double seedPerAcre = 7.0; // Taking average value
            double totalSeedRequired = area * seedPerAcre;

            // Show result
            resultTextView.setText(String.format("Seed Required: %.2f kg", totalSeedRequired));

        } catch (NumberFormatException e) {
            Toast.makeText(this, "Invalid input. Please enter numbers only.", Toast.LENGTH_SHORT).show();
        }
    }
}
