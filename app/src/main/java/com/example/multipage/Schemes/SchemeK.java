package com.example.multipage.Schemes;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.multipage.R;
import com.example.multipage.Schemes_of_K.MIDH_s_K;
import com.example.multipage.Schemes_of_K.SCD_s_K;
import com.example.multipage.Schemes_of_K.VDP_s_K;
import com.example.multipage.Schemes_of_K.SDR_s_K; // Ensure this import matches your actual class name

public class SchemeK extends AppCompatActivity {

    TextView MIDH, SCD, VDP, SDR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scheme_k);

        // Initialize TextViews
        MIDH = findViewById(R.id.textView16);
        SCD = findViewById(R.id.textView17);
        VDP = findViewById(R.id.textView18);
        SDR = findViewById(R.id.textView19);

        // Set Click Listeners for each scheme
        MIDH.setOnClickListener(v -> startActivity(new Intent(SchemeK.this, MIDH_s_K.class)));
        SCD.setOnClickListener(v -> startActivity(new Intent(SchemeK.this, SCD_s_K.class)));
        VDP.setOnClickListener(v -> startActivity(new Intent(SchemeK.this, VDP_s_K.class)));
        SDR.setOnClickListener(v -> startActivity(new Intent(SchemeK.this, SDR_s_K.class))); // Ensure SDR_s_K is the correct class
    }
}
