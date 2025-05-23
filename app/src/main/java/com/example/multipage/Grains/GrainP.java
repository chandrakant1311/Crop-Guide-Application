package com.example.multipage.Grains;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.multipage.Grains_of_P.Bajra_G_P;
import com.example.multipage.Grains_of_P.Barley_G_P;
import com.example.multipage.Grains_of_P.Gram_G_P;
import com.example.multipage.Grains_of_P.Maize_G_P;
import com.example.multipage.Grains_of_P.Rice_G_P;
import com.example.multipage.Grains_of_P.Wheat_G_P;
import com.example.multipage.R;

public class GrainP extends AppCompatActivity {

    TextView  Wheat, Rice, Maize, Barley, Bajra, Gram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grain_p);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize TextViews
        Wheat = findViewById(R.id.textView16);
        Rice = findViewById(R.id.textView17);
        Maize = findViewById(R.id.textView18);
        Barley = findViewById(R.id.textView19);
        Bajra = findViewById(R.id.textView20);
        Gram = findViewById(R.id.textView21);

        // Set Click Listeners

        Wheat.setOnClickListener(v -> startActivity(new Intent(GrainP.this, Wheat_G_P.class)));
        Rice.setOnClickListener(v -> startActivity(new Intent(GrainP.this, Rice_G_P.class)));
        Maize.setOnClickListener(v -> startActivity(new Intent(GrainP.this, Maize_G_P.class)));
        Barley.setOnClickListener(v -> startActivity(new Intent(GrainP.this, Barley_G_P.class)));
        Bajra.setOnClickListener(v -> startActivity(new Intent(GrainP.this, Bajra_G_P.class)));
        Gram.setOnClickListener(v -> startActivity(new Intent(GrainP.this, Gram_G_P.class)));
    }
}
