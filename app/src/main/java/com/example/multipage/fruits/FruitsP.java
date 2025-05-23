package com.example.multipage.fruits;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.multipage.Fruits_of_P.Amla_F_P;
import com.example.multipage.Fruits_of_P.Ber_F_P;
import com.example.multipage.Fruits_of_P.Guava_F_P;
import com.example.multipage.Fruits_of_P.Kinnow_F_P;
import com.example.multipage.Fruits_of_P.Pear_F_P;
import com.example.multipage.Fruits_of_P.Pomegranate_F_P;
import com.example.multipage.R;

public class FruitsP extends AppCompatActivity {

    TextView  Kinnow, Guava, Amla, Pear, Pomegranate, Ber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fruits_p);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize TextViews
        Kinnow = findViewById(R.id.textView16);
        Guava = findViewById(R.id.textView17);
        Amla = findViewById(R.id.textView18);
        Pear = findViewById(R.id.textView19);
        Pomegranate = findViewById(R.id.textView20);
        Ber = findViewById(R.id.textView21);

        // Set Click Listeners
        Kinnow.setOnClickListener(v -> startActivity(new Intent(FruitsP.this, Kinnow_F_P.class)));
        Guava.setOnClickListener(v -> startActivity(new Intent(FruitsP.this, Guava_F_P.class)));
        Amla.setOnClickListener(v -> startActivity(new Intent(FruitsP.this, Amla_F_P.class)));
        Pear.setOnClickListener(v -> startActivity(new Intent(FruitsP.this, Pear_F_P.class)));
        Pomegranate.setOnClickListener(v -> startActivity(new Intent(FruitsP.this, Pomegranate_F_P.class)));
        Ber.setOnClickListener(v -> startActivity(new Intent(FruitsP.this, Ber_F_P.class)));
    }
}
