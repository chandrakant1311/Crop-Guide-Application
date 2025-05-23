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

public class Maize_g_K extends AppCompatActivity {

    private EditText areaInput;
    private Button calculateButton;
    private TextView resultTextView;

    private static final double SEED_RATE_PER_ACRE = 8.0; // Example seed rate (in kg/acre) - update if needed

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_maize_gk);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize views
        areaInput = findViewById(R.id.areaInput);
        calculateButton = findViewById(R.id.calculateButton);
        resultTextView = findViewById(R.id.resultTextView);

        // Set button click listener
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateSeedRequired();
            }
        });
    }

    private void calculateSeedRequired() {
        String areaText = areaInput.getText().toString().trim();

        if (areaText.isEmpty()) {
            Toast.makeText(this, "Please enter area", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double area = Double.parseDouble(areaText);
            double seedRequired = area * SEED_RATE_PER_ACRE;
            resultTextView.setText(String.format("Seed Required: %.2f kg", seedRequired));
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
        }
    }
}
