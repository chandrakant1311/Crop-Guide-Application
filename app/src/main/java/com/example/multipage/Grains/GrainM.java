

package com.example.multipage.Grains;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.multipage.Grains_of_MH.Bajra_g_mh;
import com.example.multipage.Grains_of_MH.Chickpea_g_Mh;
import com.example.multipage.Grains_of_MH.Jowar_g_mh;
import com.example.multipage.Grains_of_MH.Rice_g_Mh;
import com.example.multipage.Grains_of_MH.Soyabin_g_mh;
import com.example.multipage.Grains_of_MH.wheat_g_Mh;
import com.example.multipage.R;

public class GrainM extends AppCompatActivity {

    TextView wheat, rice, bajra, Soyabin,Chickpea,Jowar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_grain_m);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        wheat = findViewById(R.id.textView16);
        Jowar = findViewById(R.id.textView17);
        bajra = findViewById(R.id.textView18);
        Soyabin = findViewById(R.id.textView19);
        rice = findViewById(R.id.textView20);
        Chickpea = findViewById(R.id.textView21);


        wheat.setOnClickListener(v -> startActivity(new Intent(GrainM.this, wheat_g_Mh.class)));
        rice.setOnClickListener(v -> startActivity(new Intent(GrainM.this, Rice_g_Mh.class)));
        bajra.setOnClickListener(v -> startActivity(new Intent(GrainM.this, Bajra_g_mh.class)));
        Soyabin.setOnClickListener(v -> startActivity(new Intent(GrainM.this, Soyabin_g_mh.class)));
        Jowar.setOnClickListener(v -> startActivity(new Intent(GrainM.this, Jowar_g_mh.class)));
        Chickpea.setOnClickListener(v -> startActivity(new Intent(GrainM.this, Chickpea_g_Mh.class)));
    }
}
