package com.example.multipage.Grains_of_MH;

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

public class Bajra_g_mh extends AppCompatActivity {

    private EditText areaInput;
    private Button calculateButton;
    private TextView resultTextView;

    // Assuming seed requirement for Bajra is 2 kg per acre (adjust if needed)
    private static final double SEED_RATE_KG_PER_ACRE = 2.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bajra_gmh);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Linking XML views
        areaInput = findViewById(R.id.areaInput);
        calculateButton = findViewById(R.id.calculateButton);
        resultTextView = findViewById(R.id.resultTextView);

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
            double area = Double.parseDouble(areaText);
            double seedRequired = area * SEED_RATE_KG_PER_ACRE;
            resultTextView.setText("Seed Required: " + seedRequired + " kg");
        } else {
            resultTextView.setText("Please enter a valid area.");
        }
    }
}
