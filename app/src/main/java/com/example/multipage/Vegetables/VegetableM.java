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
import com.example.multipage.Veg_of_MH.Brinjal_v_M;
import com.example.multipage.Veg_of_MH.Cauliflower_v_M;
import com.example.multipage.Veg_of_MH.Chilli_v_M;
import com.example.multipage.Veg_of_MH.Okara_v_M;
import com.example.multipage.Veg_of_MH.Onion_v_M;
import com.example.multipage.Veg_of_MH.Sponge_gourd_v_M;

public class VegetableM extends AppCompatActivity {

    TextView  Sponge_guard, Onion, Chilli, Okra, Brinjal, Cauliflower;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_vegetable_m);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize TextViews
         Sponge_guard= findViewById(R.id.textView16);
        Onion = findViewById(R.id.textView17);
        Chilli = findViewById(R.id.textView18);
        Okra = findViewById(R.id.textView19);
        Brinjal = findViewById(R.id.textView20);
        Cauliflower = findViewById(R.id.textView21);

        // Set Click Listeners for each vegetable
        Sponge_guard.setOnClickListener(v -> startActivity(new Intent(VegetableM.this, Sponge_gourd_v_M.class)));
        Onion.setOnClickListener(v -> startActivity(new Intent(VegetableM.this, Onion_v_M.class)));
        Chilli.setOnClickListener(v -> startActivity(new Intent(VegetableM.this, Chilli_v_M.class)));
        Okra.setOnClickListener(v -> startActivity(new Intent(VegetableM.this, Okara_v_M.class)));
        Brinjal.setOnClickListener(v -> startActivity(new Intent(VegetableM.this, Brinjal_v_M.class)));
        Cauliflower.setOnClickListener(v -> startActivity(new Intent(VegetableM.this, Cauliflower_v_M.class)));
    }
}
