package com.example.davlin_6.transition_image_example;

import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import static com.example.davlin_6.transition_image_example.R.id.ivProfile;

public class MainActivity extends AppCompatActivity {

    ImageView ivProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ivProfile=(ImageView) findViewById(R.id.ivProfile);



        ivProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

          trans();

            }
        });

    }

    public void trans()
    {
        final Intent intent = new Intent(this, DetailsActivity.class);
// Pass data object in the bundle and populate details activity.
        intent.putExtra(DetailsActivity.EXTRA_CONTACT,"contact");
        ActivityOptionsCompat options = ActivityOptionsCompat.
                makeSceneTransitionAnimation(this,ivProfile, "profile");
        startActivity(intent, options.toBundle());
    }
}
