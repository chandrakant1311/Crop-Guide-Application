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

public class Rice_g_K extends AppCompatActivity {

    private EditText areaInput;
    private Button calculateButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_rice_gk);  // Set the corresponding XML layout

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Link XML elements to Java variables
        areaInput = findViewById(R.id.areaInput);  // Input for area in acres
        calculateButton = findViewById(R.id.calculateButton);  // Button to calculate seed required
        resultTextView = findViewById(R.id.resultTextView);  // TextView to display the result

        // Set up button click listener for calculation
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String areaStr = areaInput.getText().toString().trim();  // Get input text
                if (areaStr.isEmpty()) {
                    // Show Toast if no area is entered
                    Toast.makeText(Rice_g_K.this, "Please enter area in acres", Toast.LENGTH_SHORT).show();
                    return;
                }

                try {
                    // Convert input text to double (area in acres)
                    double area = Double.parseDouble(areaStr);
                    // Example calculation: 50 kg of rice per acre
                    double riceRequired = area * 50;  // Calculation for rice required (in kg)

                    // Display result in TextView with formatted text
                    String result = "Rice Required: " + String.format("%.0f", riceRequired) + " kg";
                    resultTextView.setText(result);

                } catch (NumberFormatException e) {
                    // Handle invalid number input
                    Toast.makeText(Rice_g_K.this, "Invalid input. Please enter a valid number.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
