package com.example.multipage.Grains_of_MH;

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

public class Jowar_g_mh extends AppCompatActivity {

    private EditText areaInput;
    private Button calculateButton;
    private TextView resultTextView;

    // Assume for Jowar: around 2 kg seed required per acre (you can change it based on actual info)
    private static final double SEED_RATE_PER_ACRE = 2.0; // kg per acre

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_jowar_gmh);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Linking the views
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
        String areaStr = areaInput.getText().toString().trim();
        if (areaStr.isEmpty()) {
            Toast.makeText(this, "Please enter the area in acres", Toast.LENGTH_SHORT).show();
            return;
        }

        double area = Double.parseDouble(areaStr);
        double seedRequired = area * SEED_RATE_PER_ACRE;

        resultTextView.setText(String.format("Seed Required: %.2f kg", seedRequired));
    }
}
