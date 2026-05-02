package com.example.skynie_java;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class TicketDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_details);

        findViewById(R.id.btn_back_ticket_details).setOnClickListener(v -> finish());
    }
}
