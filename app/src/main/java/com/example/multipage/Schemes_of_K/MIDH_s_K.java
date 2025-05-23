package com.example.multipage.Schemes_of_K;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.multipage.R;

public class MIDH_s_K extends AppCompatActivity {

    TextView title, description, eligibility, criteria, duration, howToApply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midh_sk); // Make sure this is your layout XML file name

        // Initialize all TextViews
        title = findViewById(R.id.title);
        description = findViewById(R.id.description);
        eligibility = findViewById(R.id.eligibility);
        criteria = findViewById(R.id.criteria);
        duration = findViewById(R.id.duration);
        howToApply = findViewById(R.id.how_to_apply);

        // Set the text with HTML formatting if needed
        description.setText(android.text.Html.fromHtml(getString(R.string.mission_description)));
        eligibility.setText(android.text.Html.fromHtml(getString(R.string.mission_eligibility)));
        criteria.setText(android.text.Html.fromHtml(getString(R.string.mission_criteria)));
        duration.setText(android.text.Html.fromHtml(getString(R.string.mission_duration)));
        howToApply.setText(android.text.Html.fromHtml(getString(R.string.mission_apply)));
        title.setText(getString(R.string.mission_title)); // No HTML needed for title
    }
}
