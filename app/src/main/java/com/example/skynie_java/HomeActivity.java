package com.example.skynie_java;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setSelectedItemId(R.id.nav_home);

        bottomNav.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.nav_search) {
                startActivity(new Intent(HomeActivity.this, SearchActivity.class));
                return true;
            } else if (itemId == R.id.nav_tickets) {
                startActivity(new Intent(HomeActivity.this, MyTicketsActivity.class));
                return true;
            }
            // Other navigation items...
            return itemId == R.id.nav_home;

        });

        findViewById(R.id.btn_search_header).setOnClickListener(v -> {
            startActivity(new Intent(HomeActivity.this, SearchActivity.class));
        });

        findViewById(R.id.featured_movie).setOnClickListener(v -> {
            startActivity(new Intent(HomeActivity.this, FilmDetailsActivity.class));
        });

        findViewById(R.id.btn_featured_trailer).setOnClickListener(v -> {
            startActivity(new Intent(HomeActivity.this, TrailerActivity.class));
        });

    }
}
