package com.example.multipage.Grains_of_P;

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

public class Barley_G_P extends AppCompatActivity {

    private EditText areaInput;
    private Button calculateButton;
    private TextView resultTextView;

    private final double SEED_RATE = 4.5; // Example: 4.5 kg per acre for Barley/Bajra

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_barley_gp);

        // Setup window insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize Views
        areaInput = findViewById(R.id.areaInput);
        calculateButton = findViewById(R.id.calculateButton);
        resultTextView = findViewById(R.id.resultTextView);

        // Set click listener for Calculate button
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = areaInput.getText().toString().trim();
                if (input.isEmpty()) {
                    Toast.makeText(Barley_G_P.this, "Please enter area in acres", Toast.LENGTH_SHORT).show();
                } else {
                    try {
                        double area = Double.parseDouble(input);
                        double seedRequired = area * SEED_RATE;
                        resultTextView.setText(String.format("Seed Required: %.2f kg", seedRequired));
                    } catch (NumberFormatException e) {
                        Toast.makeText(Barley_G_P.this, "Invalid input. Please enter a number.", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
