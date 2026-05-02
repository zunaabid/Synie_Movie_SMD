package com.example.skynie_java;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView ringInner = findViewById(R.id.logo_ring_inner);
        ImageView ringOuter = findViewById(R.id.logo_ring_outer);

        // Animate Inner Ring (Clockwise)
        ObjectAnimator innerAnim = ObjectAnimator.ofFloat(ringInner, "rotation", 0f, 360f);
        innerAnim.setDuration(3000);
        innerAnim.setRepeatCount(ValueAnimator.INFINITE);
        innerAnim.setInterpolator(new LinearInterpolator());
        innerAnim.start();

        // Animate Outer Ring (Counter-Clockwise)
        ObjectAnimator outerAnim = ObjectAnimator.ofFloat(ringOuter, "rotation", 0f, -360f);
        outerAnim.setDuration(4000);
        outerAnim.setRepeatCount(ValueAnimator.INFINITE);
        outerAnim.setInterpolator(new LinearInterpolator());
        outerAnim.start();

        // Transition to Onboarding after 3 seconds
        new Handler().postDelayed(() -> {
            startActivity(new Intent(SplashActivity.this, OnboardingActivity.class));
            finish();
        }, 3000);
    }
}
