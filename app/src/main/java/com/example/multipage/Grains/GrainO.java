package com.example.multipage.Grains;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.multipage.Grains_of_O.Blackgram__g_O;
import com.example.multipage.Grains_of_O.Greengram_g_O;
import com.example.multipage.Grains_of_O.Maize_g_O;
import com.example.multipage.Grains_of_O.Ragi_g_O;
import com.example.multipage.Grains_of_O.Rice_g_O;
import com.example.multipage.Grains_of_O.Sesame_g_O;
import com.example.multipage.R;

public class GrainO extends AppCompatActivity {

    TextView  Rice, Maize, Ragi, GreenGram, BlackGram,Sesame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_grain_o);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize TextViews
        Rice = findViewById(R.id.textView16);
        Maize = findViewById(R.id.textView17);
        Ragi = findViewById(R.id.textView18);
        GreenGram = findViewById(R.id.textView19);
        BlackGram = findViewById(R.id.textView20);
        Sesame = findViewById(R.id.textView21);

        // Set Click Listeners
        Rice.setOnClickListener(v -> startActivity(new Intent(GrainO.this, Rice_g_O.class)));
        Maize.setOnClickListener(v -> startActivity(new Intent(GrainO.this, Maize_g_O.class)));
        Ragi.setOnClickListener(v -> startActivity(new Intent(GrainO.this, Ragi_g_O.class)));
        GreenGram.setOnClickListener(v -> startActivity(new Intent(GrainO.this, Greengram_g_O.class)));
        BlackGram.setOnClickListener(v -> startActivity(new Intent(GrainO.this, Blackgram__g_O.class)));
        Sesame.setOnClickListener(v -> startActivity(new Intent(GrainO.this, Sesame_g_O.class)));

    }
}
