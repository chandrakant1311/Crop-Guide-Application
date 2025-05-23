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

public class Rice_g_Mh extends AppCompatActivity {

    private EditText areaInput;
    private Button calculateButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_rice_gmh);

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
                    Toast.makeText(Rice_g_Mh.this, "Please enter area in acres", Toast.LENGTH_SHORT).show();
                    return;
                }

                try {
                    double area = Double.parseDouble(areaStr);
                    double plantsRequired = area * 25000; // 25,000 plants per acre

                    String result = "Herbs Required: " + String.format("%.0f", plantsRequired);
                    resultTextView.setText(result);

                } catch (NumberFormatException e) {
                    Toast.makeText(Rice_g_Mh.this, "Invalid input. Please enter a valid number.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
