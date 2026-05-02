package com.example.skynie_java;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class ForgotPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        findViewById(R.id.btn_back_forgot).setOnClickListener(v -> finish());

        findViewById(R.id.btn_confirm_forgot).setOnClickListener(v -> {
            startActivity(new Intent(ForgotPasswordActivity.this, VerifyOtpActivity.class));
        });
    }
}
