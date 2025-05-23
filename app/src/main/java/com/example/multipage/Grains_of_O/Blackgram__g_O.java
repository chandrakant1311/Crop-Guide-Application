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

public class Blackgram__g_O extends AppCompatActivity {

    private EditText areaInput;
    private Button calculateButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_blackgram_go);

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
                    Toast.makeText(Blackgram__g_O.this, "Please enter area in acres", Toast.LENGTH_SHORT).show();
                    return;
                }

                try {
                    double area = Double.parseDouble(areaStr);
                    double seedsRequired = area * 18; // 80,000 seeds per acre (example)

                    String result = "Seeds Required: " + String.format("Seed Required: %.2f kg", seedsRequired);
                    resultTextView.setText(result);

                } catch (NumberFormatException e) {
                    Toast.makeText(Blackgram__g_O.this, "Invalid input. Please enter a valid number.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
