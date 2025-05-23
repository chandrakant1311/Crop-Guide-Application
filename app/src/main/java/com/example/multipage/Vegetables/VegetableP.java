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
import com.example.multipage.Veg_of_MH.Cauliflower_v_M;
import com.example.multipage.Veg_of_P.Carrot_V_P;
import com.example.multipage.Veg_of_P.Peas_V_P;
import com.example.multipage.Veg_of_P.Potato_V_P;
import com.example.multipage.Veg_of_P.Radish_V_P;
import com.example.multipage.Veg_of_P.Spinach_V_P;

public class VegetableP extends AppCompatActivity {

    TextView Potato, Cauliflower, Carrot, Peas, Spinach, Radish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_vegetable_p);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize TextViews
        Potato = findViewById(R.id.textView16);
        Cauliflower = findViewById(R.id.textView17);
        Carrot = findViewById(R.id.textView18);
        Peas = findViewById(R.id.textView19);
        Spinach = findViewById(R.id.textView20);
        Radish = findViewById(R.id.textView21);

        // Set Click Listeners
        Potato.setOnClickListener(v -> startActivity(new Intent(VegetableP.this, Potato_V_P.class)));
        Cauliflower.setOnClickListener(v -> startActivity(new Intent(VegetableP.this, Cauliflower_v_M.class)));
        Carrot.setOnClickListener(v -> startActivity(new Intent(VegetableP.this, Carrot_V_P.class)));
        Peas.setOnClickListener(v -> startActivity(new Intent(VegetableP.this, Peas_V_P.class)));
        Spinach.setOnClickListener(v -> startActivity(new Intent(VegetableP.this, Spinach_V_P.class)));
        Radish.setOnClickListener(v -> startActivity(new Intent(VegetableP.this, Radish_V_P.class)));
    }
}
