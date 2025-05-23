package com.example.multipage.Grains;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.multipage.Grains_of_K.BlackGram_g_K;
import com.example.multipage.Grains_of_K.HorseGram_g_K;
import com.example.multipage.Grains_of_K.Maize_g_K;
import com.example.multipage.Grains_of_K.Ragi_g_K;
import com.example.multipage.Grains_of_K.Rice_g_K;
import com.example.multipage.Grains_of_K.Sesame_g_K;
import com.example.multipage.Grains_of_O.Sesame_g_O;
import com.example.multipage.R;

public class GrainK extends AppCompatActivity {

    TextView  Ragi, Rice, Maize, BlackGram, Sesame, HorseGram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_grain_k);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize TextViews

        Ragi = findViewById(R.id.textView16);
        Rice = findViewById(R.id.textView17);
        Maize = findViewById(R.id.textView18);
        BlackGram = findViewById(R.id.textView19);
        Sesame = findViewById(R.id.textView20);
        HorseGram = findViewById(R.id.textView21);

        // Set Click Listeners
        Ragi.setOnClickListener(v -> startActivity(new Intent(GrainK.this, Ragi_g_K.class)));
        Rice.setOnClickListener(v -> startActivity(new Intent(GrainK.this, Rice_g_K.class)));
        Maize.setOnClickListener(v -> startActivity(new Intent(GrainK.this, Maize_g_K.class)));
        BlackGram.setOnClickListener(v -> startActivity(new Intent(GrainK.this, BlackGram_g_K.class)));
        Sesame.setOnClickListener(v -> startActivity(new Intent(GrainK.this, Sesame_g_K.class)));
        HorseGram.setOnClickListener(v -> startActivity(new Intent(GrainK.this, HorseGram_g_K.class)));
    }
}
