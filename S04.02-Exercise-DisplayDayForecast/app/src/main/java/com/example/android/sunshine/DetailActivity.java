package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // COMPLETE (3): Retrieve the TextView to which the name of the item clicked should be displayed.
        TextView detailNameTV = (TextView) findViewById(R.id.detail_name);

        // COMPLETE (2) Display the weather forecast that was passed from MainActivity
        // COMPLETE (4) Retrieve the intent that started this activity.
        Intent intentThatStartedThis = getIntent();

        // COMPLETE (5) Check to see if the Intent that started this activity exists
        if (intentThatStartedThis != null) {
            // COMPLETE (6) Check to see if Intent had any extra data attached to it using hasExtra() and Intent.EXTRA_TEXT
            if (intentThatStartedThis.hasExtra(Intent.EXTRA_TEXT) == true) {
                // COMPLETE (7) If the intent has some extra data, retrieve it and place it in a String variable.
                String detailName = intentThatStartedThis.getStringExtra(Intent.EXTRA_TEXT);
                // COMPLETE (8) If the intent has some extra data, set the TextView to display it.
                detailNameTV.setText(detailName);
            }

        }
    }
}