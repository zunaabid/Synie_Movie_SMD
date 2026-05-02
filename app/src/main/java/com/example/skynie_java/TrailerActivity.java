package com.example.skynie_java;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class TrailerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trailer);

        findViewById(R.id.btn_back_trailer).setOnClickListener(v -> finish());
    }
}
