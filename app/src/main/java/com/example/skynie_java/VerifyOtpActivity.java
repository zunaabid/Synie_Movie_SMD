package com.example.skynie_java;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class VerifyOtpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_otp);

        findViewById(R.id.btn_back_otp).setOnClickListener(v -> finish());

        findViewById(R.id.btn_confirm_otp).setOnClickListener(v -> {
            // After verification, usually go to reset password or login
            startActivity(new Intent(VerifyOtpActivity.this, LoginActivity.class));
            finish();
        });
    }
}
