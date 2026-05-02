package com.example.skynie_java;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MyTicketsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_tickets);

        findViewById(R.id.btn_back_tickets).setOnClickListener(v -> finish());

        findViewById(R.id.ticket_item_1).setOnClickListener(v -> {
            Intent intent = new Intent(MyTicketsActivity.this, TicketDetailsActivity.class);
            startActivity(intent);
        });

        BottomNavigationView bottomNav = findViewById(R.id.bottom_nav_tickets);
        bottomNav.setSelectedItemId(R.id.nav_tickets);
        
        bottomNav.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.nav_home) {
                startActivity(new Intent(this, HomeActivity.class));
                return true;
            } else if (itemId == R.id.nav_search) {
                startActivity(new Intent(this, SearchActivity.class));
                return true;
            } else if (itemId == R.id.nav_profile) {
                // startActivity(new Intent(this, ProfileActivity.class));
                return true;
            }
            return false;
        });
    }
}
