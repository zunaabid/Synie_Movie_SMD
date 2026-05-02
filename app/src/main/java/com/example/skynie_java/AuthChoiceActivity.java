package com.example.skynie_java;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class AuthChoiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth_choice);

        findViewById(R.id.btn_login).setOnClickListener(v -> {
            startActivity(new Intent(AuthChoiceActivity.this, LoginActivity.class));
        });

        findViewById(R.id.btn_signup).setOnClickListener(v -> {
            startActivity(new Intent(AuthChoiceActivity.this, SignUpActivity.class));
        });
    }
}
