package com.example.multipage.Schemes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.multipage.R;
import com.example.multipage.Schemes_of_MH.AIF_S_MH;
import com.example.multipage.Schemes_of_MH.PMFBY_S_MH;
import com.example.multipage.Schemes_of_MH.PMKISAN_S_MH;
import com.example.multipage.Schemes_of_MH.PMKMY_S_MH;

public class SchemeM extends AppCompatActivity {

    TextView AIF, PMFBY, PMKISAN, PMKMY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_scheme_m);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize TextViews
        PMFBY = findViewById(R.id.textView16);
        PMKISAN = findViewById(R.id.textView17);
        PMKMY = findViewById(R.id.textView18);
        AIF = findViewById(R.id.textView19);


        // Set Click Listeners
        AIF.setOnClickListener(v -> startActivity(new Intent(SchemeM.this, AIF_S_MH.class)));
        PMKMY.setOnClickListener(v -> startActivity(new Intent(SchemeM.this, PMKMY_S_MH.class)));
        PMKISAN.setOnClickListener(v -> startActivity(new Intent(SchemeM.this, PMKISAN_S_MH.class)));
        PMFBY.setOnClickListener(v -> startActivity(new Intent(SchemeM.this, PMFBY_S_MH.class)));
    }
}
