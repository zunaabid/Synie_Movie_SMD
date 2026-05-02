package com.example.skynie_java;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class OrderDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);

        findViewById(R.id.btn_back_order).setOnClickListener(v -> finish());

        findViewById(R.id.btn_pay).setOnClickListener(v -> {
            Intent intent = new Intent(OrderDetailsActivity.this, MyTicketsActivity.class);
            startActivity(intent);
        });
    }
}
