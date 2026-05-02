package com.example.skynie_java;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.btn_back).setOnClickListener(v -> finish());

        findViewById(R.id.tv_register).setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this, SignUpActivity.class));
            finish();
        });

        findViewById(R.id.tv_forgot_password).setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this, ForgotPasswordActivity.class));
        });

        findViewById(R.id.btn_login_submit).setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this, HomeActivity.class));
            finish();
        });
    }
}
