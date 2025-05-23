package com.example.multipage.fruits;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.multipage.Fruits_of_K.Banana_f_K;
import com.example.multipage.Fruits_of_K.Coconut_f_K;
import com.example.multipage.Fruits_of_K.Jackfruit_f_K;
import com.example.multipage.Fruits_of_K.Mango_f_K;
import com.example.multipage.Fruits_of_K.Papaya_f_K;
import com.example.multipage.Fruits_of_K.Pineapple_f_K;
import com.example.multipage.R;

public class FruitsK extends AppCompatActivity {

    TextView  Banana, Jackfruit, Coconut, Pineapple, Mango, Papaya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fruits_k);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize TextViews
        Banana = findViewById(R.id.textView16);
        Jackfruit = findViewById(R.id.textView17);
        Coconut = findViewById(R.id.textView18);
        Pineapple = findViewById(R.id.textView19);
        Mango = findViewById(R.id.textView20);
        Papaya = findViewById(R.id.textView21);

        // Set Click Listeners for each fruit
        Banana.setOnClickListener(v -> startActivity(new Intent(FruitsK.this, Banana_f_K.class)));
        Jackfruit.setOnClickListener(v -> startActivity(new Intent(FruitsK.this, Jackfruit_f_K.class)));
        Coconut.setOnClickListener(v -> startActivity(new Intent(FruitsK.this, Coconut_f_K.class)));
        Pineapple.setOnClickListener(v -> startActivity(new Intent(FruitsK.this, Pineapple_f_K.class)));
        Mango.setOnClickListener(v -> startActivity(new Intent(FruitsK.this, Mango_f_K.class)));
        Papaya.setOnClickListener(v -> startActivity(new Intent(FruitsK.this, Papaya_f_K.class)));
    }
}
