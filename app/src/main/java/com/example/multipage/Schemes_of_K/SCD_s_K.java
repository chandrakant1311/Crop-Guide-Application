package com.example.multipage.Schemes_of_K;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.multipage.R;

public class SCD_s_K extends AppCompatActivity {

    TextView title, description, eligibility, criteria, duration, howToApply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scd_sk); // ✅ correct layout file

        // Initialize all TextViews
        title = findViewById(R.id.title);
        description = findViewById(R.id.section1);
        eligibility = findViewById(R.id.section2);
        criteria = findViewById(R.id.section3);
        duration = findViewById(R.id.section4);
        howToApply = findViewById(R.id.section5);

        // Set the text with HTML formatting where needed
        title.setText(getString(R.string.page_title_coconut)); // Title usually does not need HTML
        description.setText(android.text.Html.fromHtml(getString(R.string.page_section1_coconut)));
        eligibility.setText(android.text.Html.fromHtml(getString(R.string.page_section2_coconut)));
        criteria.setText(android.text.Html.fromHtml(getString(R.string.page_section3_coconut)));
        duration.setText(android.text.Html.fromHtml(getString(R.string.page_section4_coconut)));
        howToApply.setText(android.text.Html.fromHtml(getString(R.string.page_section5_coconut)));
    }
}
