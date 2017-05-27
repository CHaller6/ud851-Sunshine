/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO (1) Create a field to store the weather display TextView
    // Holds the weather information
    TextView weather_display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // TODO (2) Use findViewById to get a reference to the weather display TextView
        weather_display = (TextView) findViewById(R.id.tv_weather_data);

        // TODO (3) Create an array of Strings that contain fake weather data
        String[] weather_data = {
                "May 27 - Sunny and Clear - 86°F / 54°F",
                "May 28 - Sunny and Clear - 84°F / 53°F",
                "May 29 - Sunny and Clear - 80°F / 54°F",
                "May 30 - Sunny and Clear - 70°F / 54°F",
                "May 31 - Sunny and Clear - 69°F / 51°F",
                "June 01 - Sunny and Clear - 72°F / 52°F",
                "June 02 - Sunny and Clear - 71°F / 50°F",
                "June 03 - Sunny and Clear - 72°F / 49°F",
                "June 04 - Sunny and Clear - 72°F / 50°F",
                "June 05 - Sunny and Clear - 77°F / 50°F"
        };

        // TODO (4) Append each String from the fake weather data array to the TextView
        for (String ind_data: weather_data) {
            weather_display.append(ind_data +"\n\n\n");
        }
    }
}