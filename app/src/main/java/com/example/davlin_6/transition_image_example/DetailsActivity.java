package com.example.davlin_6.transition_image_example;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by davlin-6 on 17/3/17.
 */

public class DetailsActivity extends AppCompatActivity {

    public static String EXTRA_CONTACT="key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailactivity);

    }

}
