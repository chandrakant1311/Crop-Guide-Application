package com.example.multipage.fruits;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.multipage.Fruit_of_O.Banana_f_O;
import com.example.multipage.Fruit_of_O.Coconut_f_O;
import com.example.multipage.Fruit_of_O.Guava_f_O;
import com.example.multipage.Fruit_of_O.Jackfruit_f_O;
import com.example.multipage.Fruit_of_O.Mango_f_O;
import com.example.multipage.Fruit_of_O.Pineapple_f_O;
import com.example.multipage.R;

public class FruitsO extends AppCompatActivity {

    TextView  Mango, Gauva, Banana,Jackfruit, Coconut, Pineapple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fruit_o);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize TextViews

        Mango = findViewById(R.id.textView16);
        Gauva = findViewById(R.id.textView17);
        Banana = findViewById(R.id.textView18);
        Jackfruit = findViewById(R.id.textView19);
        Coconut = findViewById(R.id.textView20);
        Pineapple = findViewById(R.id.textView21);

        // Set Click Listeners
        Mango.setOnClickListener(v -> startActivity(new Intent(FruitsO.this, Mango_f_O.class)));
        Gauva.setOnClickListener(v -> startActivity(new Intent(FruitsO.this, Guava_f_O.class)));
        Banana.setOnClickListener(v -> startActivity(new Intent(FruitsO.this, Banana_f_O.class)));
        Jackfruit.setOnClickListener(v -> startActivity(new Intent(FruitsO.this, Jackfruit_f_O.class)));
        Coconut.setOnClickListener(v -> startActivity(new Intent(FruitsO.this, Coconut_f_O.class)));
        Pineapple.setOnClickListener(v -> startActivity(new Intent(FruitsO.this, Pineapple_f_O.class)));
    }
}
