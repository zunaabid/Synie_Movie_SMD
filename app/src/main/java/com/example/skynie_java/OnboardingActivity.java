package com.example.skynie_java;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class OnboardingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

        LinearLayout row1 = findViewById(R.id.row1);
        LinearLayout row2 = findViewById(R.id.row2);
        LinearLayout row3 = findViewById(R.id.row3);

        setupRow(row1, 10);
        setupRow(row2, 10);
        setupRow(row3, 10);

        // Animate Row 1 (Right to Left)
        animateRow(row1, -500f, 20000);
        // Animate Row 2 (Left to Right)
        animateRow(row2, 500f, 25000);
        // Animate Row 3 (Right to Left)
        animateRow(row3, -500f, 22000);

        findViewById(R.id.btn_get_started).setOnClickListener(v -> {
            startActivity(new Intent(OnboardingActivity.this, AuthChoiceActivity.class));
        });
    }

    private void setupRow(LinearLayout row, int count) {
        for (int i = 0; i < count; i++) {
            View view = new View(this);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(120, 180);
            params.setMargins(16, 0, 16, 0);
            view.setLayoutParams(params);
            view.setBackgroundResource(R.drawable.bg_movie_placeholder);
            row.addView(view);
        }
    }

    private void animateRow(LinearLayout row, float translation, int duration) {
        ObjectAnimator anim = ObjectAnimator.ofFloat(row, "translationX", 0f, translation);
        anim.setDuration(duration);
        anim.setRepeatCount(ValueAnimator.INFINITE);
        anim.setRepeatMode(ValueAnimator.REVERSE);
        anim.setInterpolator(new LinearInterpolator());
        anim.start();
    }
}
