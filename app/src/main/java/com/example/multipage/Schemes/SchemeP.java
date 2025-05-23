package com.example.multipage.Schemes;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.multipage.R;
import com.example.multipage.Schemes_of_MH.PMKISAN_S_MH;
import com.example.multipage.Schemes_of_P.AGLC_S_P;
import com.example.multipage.Schemes_of_P.KCC_S_P;
import com.example.multipage.Schemes_of_P.PCKCS_S_P;
import com.example.multipage.Schemes_of_P.PMKISAN_S_P;

public class SchemeP extends AppCompatActivity {

    TextView  PMKISAN, PCKCS, KCC, AGLC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_scheme_p);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize TextViews
        PMKISAN = findViewById(R.id.textView16);
        PCKCS = findViewById(R.id.textView17);
        KCC = findViewById(R.id.textView18);
        AGLC = findViewById(R.id.textView19);

        // Set Click Listeners
        PMKISAN.setOnClickListener(v -> startActivity(new Intent(SchemeP.this, PMKISAN_S_P.class)));
        PCKCS.setOnClickListener(v -> startActivity(new Intent(SchemeP.this, PCKCS_S_P.class)));
        KCC.setOnClickListener(v -> startActivity(new Intent(SchemeP.this, KCC_S_P.class)));
        AGLC.setOnClickListener(v -> startActivity(new Intent(SchemeP.this, AGLC_S_P.class)));
    }
}
