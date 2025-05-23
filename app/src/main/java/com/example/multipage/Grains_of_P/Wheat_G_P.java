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

public class Wheat_G_P extends AppCompatActivity {

    private EditText areaInput;
    private Button calculateButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_wheat_gp);

        // Handling window insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Finding views
        areaInput = findViewById(R.id.areaInput);
        calculateButton = findViewById(R.id.calculateButton);
        resultTextView = findViewById(R.id.resultTextView);

        // Setting click listener
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
            Toast.makeText(this, "Please enter area in acres", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double areaInAcres = Double.parseDouble(areaText);

            // Assuming: Wheat requires around 50 kg seed per acre (standard value)
            double seedRequiredKg = areaInAcres * 100;

            resultTextView.setText("Seed Required: " + seedRequiredKg + " kg");
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Invalid input. Enter a valid number.", Toast.LENGTH_SHORT).show();
        }
    }
}
