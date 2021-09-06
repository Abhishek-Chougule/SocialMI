package com.developermrabhi.socialmi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class splash_screen extends Activity
{
    //Declaring variables
    TextView built_by, for_grip;
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        logo = findViewById(R.id.profile_image);
        built_by = findViewById(R.id.built_by);
        for_grip = findViewById(R.id.for_grip);

        //To display splash screen 500ms after app opens
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startEnterAnimation();
            }
        }, 500);

        //To open Main Activity 3500ms after splash screen loads
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }, 3500);
    }

    //Code for Animation
    private void startEnterAnimation()
    {
        logo.setVisibility(View.VISIBLE);
        built_by.setVisibility(View.VISIBLE);
        for_grip.setVisibility(View.VISIBLE);
    }
}