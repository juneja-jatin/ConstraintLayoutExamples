package com.example.constraintlayoutexamples;

import android.os.Bundle;
import android.os.Handler;
import android.transition.TransitionManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;

public class MotionHomeActivity extends AppCompatActivity {

    MotionLayout motionContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motion_home);

        motionContainer = findViewById(R.id.motionContainer);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                motionContainer.transitionToEnd();
            }
        }, 5000);
    }
}
