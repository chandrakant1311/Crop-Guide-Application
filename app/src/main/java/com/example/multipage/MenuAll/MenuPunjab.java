package com.example.multipage.MenuAll;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.multipage.Grains.GrainP;
import com.example.multipage.R;
import com.example.multipage.Schemes.SchemeP;
import com.example.multipage.StateSelection;
import com.example.multipage.Vegetables.VegetableP;
import com.example.multipage.fruits.FruitsP;

public class MenuPunjab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu_punjab);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageButton backButton = findViewById(R.id.backButton); // <-- Added

        // Set click listener for back button
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirect to LoginPage
                Intent intent = new Intent(MenuPunjab.this, StateSelection.class);
                startActivity(intent);
                finish(); // Optional: finish this activity so user can't come back with back button
            }
        });
        ImageView grainImage = findViewById(R.id.imageView);
        grainImage.setOnClickListener(v -> {
            Intent intent = new Intent(MenuPunjab.this, GrainP.class);
            startActivity(intent);
        });
        ImageView fruitImage = findViewById(R.id.imageView2);
        fruitImage.setOnClickListener(v -> {
            Intent intent = new Intent(MenuPunjab.this, FruitsP.class);
            startActivity(intent);
        });
        ImageView VegetableImage = findViewById(R.id.imageView3);
        VegetableImage.setOnClickListener(v -> {
            Intent intent = new Intent(MenuPunjab.this, VegetableP.class);
            startActivity(intent);
        });
        ImageView SchemeImage = findViewById(R.id.imageView4);
        SchemeImage.setOnClickListener(v -> {
            Intent intent = new Intent(MenuPunjab.this, SchemeP.class);
            startActivity(intent);
        });
    }
}