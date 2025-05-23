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
import com.example.multipage.Veg_of_K.Ashgourd_v_K;
import com.example.multipage.Veg_of_K.Bittergourd_v_K;
import com.example.multipage.Veg_of_K.Colocasia_v_K;
import com.example.multipage.Veg_of_K.Elephantfoot_v_K;
import com.example.multipage.Veg_of_K.Snakegourd_v_K;
import com.example.multipage.Veg_of_K.Yardlongbean_v_K;

public class VegetableK extends AppCompatActivity {

    TextView Elephantfoot, Snakegourd, Bittergourd, Ashgourd, Colocasia, Yardlongbean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_vegetable_k);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize TextViews
        Elephantfoot = findViewById(R.id.textView16);
        Snakegourd = findViewById(R.id.textView17);
        Bittergourd = findViewById(R.id.textView18);
        Ashgourd = findViewById(R.id.textView19);
        Colocasia = findViewById(R.id.textView20);
        Yardlongbean = findViewById(R.id.textView21);

        // Set Click Listeners for each vegetable
        Elephantfoot.setOnClickListener(v -> startActivity(new Intent(VegetableK.this, Elephantfoot_v_K.class)));
        Snakegourd.setOnClickListener(v -> startActivity(new Intent(VegetableK.this, Snakegourd_v_K.class)));
        Bittergourd.setOnClickListener(v -> startActivity(new Intent(VegetableK.this, Bittergourd_v_K.class)));
        Ashgourd.setOnClickListener(v -> startActivity(new Intent(VegetableK.this, Ashgourd_v_K.class)));
        Colocasia.setOnClickListener(v -> startActivity(new Intent(VegetableK.this, Colocasia_v_K.class)));
        Yardlongbean.setOnClickListener(v -> startActivity(new Intent(VegetableK.this, Yardlongbean_v_K.class)));
    }
}
