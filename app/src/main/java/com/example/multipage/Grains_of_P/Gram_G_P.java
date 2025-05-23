package com.example.multipage.Grains_of_P;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.multipage.R;

public class Gram_G_P extends AppCompatActivity {

    private EditText areaInput;
    private Button calculateButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_gram_gp);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize views
        areaInput = findViewById(R.id.areaInput);
        calculateButton = findViewById(R.id.calculateButton);
        resultTextView = findViewById(R.id.resultTextView);

        // Set up button click listener
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateSeedRequired();
            }
        });
    }

    private void calculateSeedRequired() {
        String areaText = areaInput.getText().toString().trim();
        if (!areaText.isEmpty()) {
            try {
                double area = Double.parseDouble(areaText);
                double seedRate = 75; // Example: Gram seed rate = 75 kg per acre
                double seedRequired = area * seedRate;
                resultTextView.setText("Seed Required: " + seedRequired + " kg");
            } catch (NumberFormatException e) {
                resultTextView.setText("Please enter a valid number.");
            }
        } else {
            resultTextView.setText("Please enter the area.");
        }
    }
}
