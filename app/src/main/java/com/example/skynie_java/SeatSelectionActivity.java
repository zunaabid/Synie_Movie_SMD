package com.example.skynie_java;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class SeatSelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat_selection);

        findViewById(R.id.btn_back_seat).setOnClickListener(v -> finish());

        findViewById(R.id.btn_proceed_cashout).setOnClickListener(v -> {
            Intent intent = new Intent(SeatSelectionActivity.this, OrderDetailsActivity.class);
            startActivity(intent);
        });
    }
}
