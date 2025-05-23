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

public class Maize_G_P extends AppCompatActivity {

    private EditText areaInput;
    private Button calculateButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_maize_gp);

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
            public void onClick(View v) {
                calculateSeed();
            }
        });
    }

    private void calculateSeed() {
        String areaText = areaInput.getText().toString().trim();
        if (areaText.isEmpty()) {
            Toast.makeText(this, "Please enter an area.", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double area = Double.parseDouble(areaText);
            // Assuming maize seed rate: 20 kg per acre (example rate, adjust if needed)
            double seedRequired = area * 20;

            resultTextView.setText(String.format("Seed Required: %.2f kg", seedRequired));
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Invalid input. Please enter a valid number.", Toast.LENGTH_SHORT).show();
        }
    }
}
