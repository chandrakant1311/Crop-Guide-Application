package com.example.multipage.Vegetables;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.multipage.R;
import com.example.multipage.veg_of_O.Brinjal_v_O;
import com.example.multipage.veg_of_O.Cauliflower_v_O;
import com.example.multipage.veg_of_O.Chilli_v_O;
import com.example.multipage.veg_of_O.Okra_v_O;
import com.example.multipage.veg_of_O.Onion_v_O;
import com.example.multipage.veg_of_O.Tomato_v_O;

public class VegetableO extends AppCompatActivity {

    TextView Brinjal, Tomato, Cauliflower, Chilli, Okra, Onion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_vegetable_o);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize TextViews
        Brinjal = findViewById(R.id.textView16);
        Tomato = findViewById(R.id.textView17);
        Cauliflower = findViewById(R.id.textView18);
        Chilli = findViewById(R.id.textView19);
        Okra = findViewById(R.id.textView20);
        Onion = findViewById(R.id.textView21);

        // Set Click Listeners
        Brinjal.setOnClickListener(v -> startActivity(new Intent(VegetableO.this, Brinjal_v_O.class)));
        Tomato.setOnClickListener(v -> startActivity(new Intent(VegetableO.this, Tomato_v_O.class)));
        Cauliflower.setOnClickListener(v -> startActivity(new Intent(VegetableO.this, Cauliflower_v_O.class)));
        Chilli.setOnClickListener(v -> startActivity(new Intent(VegetableO.this, Chilli_v_O.class)));
        Okra.setOnClickListener(v -> startActivity(new Intent(VegetableO.this, Okra_v_O.class)));
        Onion.setOnClickListener(v -> startActivity(new Intent(VegetableO.this, Onion_v_O.class)));
    }
}
