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

public class Rice_g_O extends AppCompatActivity {

    private EditText areaInput;
    private Button calculateButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_rice_go);

        // Handle system bars to set padding for edge-to-edge
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Link XML elements
        areaInput = findViewById(R.id.areaInput);
        calculateButton = findViewById(R.id.calculateButton);
        resultTextView = findViewById(R.id.resultTextView);

        // Button click listener
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String areaStr = areaInput.getText().toString().trim();

                // Check if input is empty
                if (areaStr.isEmpty()) {
                    Toast.makeText(Rice_g_O.this, "Please enter area in acres", Toast.LENGTH_SHORT).show();
                    return;
                }

                try {
                    // Parse the input value to double
                    double area = Double.parseDouble(areaStr);

                    // Calculate the number of plants required
                    double plantsRequired = area * 25000; // Assuming 25,000 plants per acre

                    // Display the result
                    String result = "Herbs Required: " + String.format("%.0f", plantsRequired);
                    resultTextView.setText(result);

                } catch (NumberFormatException e) {
                    // Show error if input is invalid
                    Toast.makeText(Rice_g_O.this, "Invalid input. Please enter a valid number.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
