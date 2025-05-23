package com.example.multipage.Schemes_of_K;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.multipage.R;

public class VDP_s_K extends AppCompatActivity {

    TextView title, description, eligibility, criteria, duration, howToApply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vdp_sk); // Layout file for General Farming scheme

        // Initialize all TextViews
        title = findViewById(R.id.title);
        description = findViewById(R.id.section1);
        eligibility = findViewById(R.id.section2);
        criteria = findViewById(R.id.section3);
        duration = findViewById(R.id.section4);
        howToApply = findViewById(R.id.section5);

        // Set the text with HTML formatting where needed
        title.setText(getString(R.string.page_title_general_farming)); // Set the title from strings.xml
        description.setText(android.text.Html.fromHtml(getString(R.string.page_section1_general_farming))); // Description
        eligibility.setText(android.text.Html.fromHtml(getString(R.string.page_section2_general_farming))); // Eligibility
        criteria.setText(android.text.Html.fromHtml(getString(R.string.page_section3_general_farming))); // Scheme Criteria
        duration.setText(android.text.Html.fromHtml(getString(R.string.page_section4_general_farming))); // Duration
        howToApply.setText(android.text.Html.fromHtml(getString(R.string.page_section5_general_farming))); // How to apply
    }
}
