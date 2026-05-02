package com.example.skynie_java;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        findViewById(R.id.btn_back_search).setOnClickListener(v -> finish());

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation_search);
        bottomNav.setSelectedItemId(R.id.nav_search);

        bottomNav.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.nav_home) {
                finish(); // Go back to Home
                return true;
            }
            return itemId == R.id.nav_search;
        });

        // Click on a theater (mock) to go to details or search results
        findViewById(R.id.tv_theater_name1).setOnClickListener(v -> {
            startActivity(new Intent(SearchActivity.this, FilmDetailsActivity.class));
        });
    }
}
