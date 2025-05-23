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

public class Rice_G_P extends AppCompatActivity {

    private EditText areaInput;
    private Button calculateButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_rice_gp);

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
                if (areaStr.isEmpty()) {
                    Toast.makeText(Rice_G_P.this, "Please enter area in acres", Toast.LENGTH_SHORT).show();
                    return;
                }

                try {
                    double area = Double.parseDouble(areaStr);

                    // Updated Calculation for Rice Plantation
                    double seedPerAcre = 25; // Assuming 25 kg of seed required per acre for plantation
                    double seedRequired = area * seedPerAcre;

                    String result = "🌾 Seed Required for Planting Rice:\n" + String.format("%.2f", seedRequired) + " kg";
                    resultTextView.setText(result);

                } catch (NumberFormatException e) {
                    Toast.makeText(Rice_G_P.this, "Invalid input. Please enter a valid number.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
