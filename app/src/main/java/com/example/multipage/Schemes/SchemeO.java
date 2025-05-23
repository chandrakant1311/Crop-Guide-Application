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
import com.example.multipage.Schemes_of_O.BALRAM_s_O;
import com.example.multipage.Schemes_of_O.CIFM_s_O;
import com.example.multipage.Schemes_of_O.MKUY_s_O;
import com.example.multipage.Schemes_of_O.PCBA_s_O;

public class SchemeO extends AppCompatActivity {

    // Declare TextViews for each scheme
    TextView MKUY, CIFM, PCBA, BALRAM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_scheme_o); // Set the layout file for the activity

        // Apply window insets (this part is for edge-to-edge layout handling)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize the TextViews
        MKUY = findViewById(R.id.textView16);
        CIFM = findViewById(R.id.textView17);
        PCBA = findViewById(R.id.textView18);
        BALRAM = findViewById(R.id.textView19);

        // Set OnClickListeners for each scheme TextView
        MKUY.setOnClickListener(v -> startActivity(new Intent(SchemeO.this, MKUY_s_O.class)));
        CIFM.setOnClickListener(v -> startActivity(new Intent(SchemeO.this, CIFM_s_O.class)));
        PCBA.setOnClickListener(v -> startActivity(new Intent(SchemeO.this, PCBA_s_O.class)));
        BALRAM.setOnClickListener(v -> startActivity(new Intent(SchemeO.this, BALRAM_s_O.class)));
    }
}
