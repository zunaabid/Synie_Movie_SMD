package com.example.skynie_java;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class TicketSelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_selection);

        findViewById(R.id.btn_back).setOnClickListener(v -> finish());

        // Simple navigation to Seat Selection when a slot is clicked
        findViewById(R.id.slot_1).setOnClickListener(v -> {
            Intent intent = new Intent(TicketSelectionActivity.this, SeatSelectionActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.btn_trailer).setOnClickListener(v -> {
            startActivity(new Intent(TicketSelectionActivity.this, TrailerActivity.class));
        });

    }
}
