package com.example.skynie_java;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        findViewById(R.id.btn_back_signup).setOnClickListener(v -> finish());

        findViewById(R.id.btn_signup_submit).setOnClickListener(v -> {
            startActivity(new Intent(SignUpActivity.this, HomeActivity.class));
            finish();
        });
    }
}
