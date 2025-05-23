package com.example.multipage.fruits;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.multipage.Fruits_of_MH.Banana_f_M;
import com.example.multipage.Fruits_of_MH.CustardApple_f_M;
import com.example.multipage.Fruits_of_MH.Mango_f_M;
import com.example.multipage.Fruits_of_MH.Papaya_f_M;
import com.example.multipage.Fruits_of_MH.Pomgranet_f_M;
import com.example.multipage.Fruits_of_MH.Watermelon_f_M;
import com.example.multipage.R;

public class FruitsM extends AppCompatActivity {

    TextView mango, Custard_Apple, banana, Pomegranate, Watermelon, Papaya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fruits_m);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        mango = findViewById(R.id.textView16);
        banana = findViewById(R.id.textView17);
        Pomegranate = findViewById(R.id.textView18);
        Watermelon = findViewById(R.id.textView19);
        Papaya = findViewById(R.id.textView20);
        Custard_Apple= findViewById(R.id.textView21);


        mango.setOnClickListener(v -> startActivity(new Intent(FruitsM.this, Mango_f_M.class)));
        Pomegranate.setOnClickListener(v -> startActivity(new Intent(FruitsM.this, Pomgranet_f_M.class)));
        banana.setOnClickListener(v -> startActivity(new Intent(FruitsM.this, Banana_f_M.class)));
        Papaya.setOnClickListener(v -> startActivity(new Intent(FruitsM.this, Papaya_f_M.class)));
        Watermelon.setOnClickListener(v -> startActivity(new Intent(FruitsM.this, Watermelon_f_M.class)));
        Custard_Apple.setOnClickListener(v -> startActivity(new Intent(FruitsM.this, CustardApple_f_M.class)));
    }
}
