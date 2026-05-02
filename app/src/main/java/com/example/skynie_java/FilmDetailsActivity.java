package com.example.skynie_java;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class FilmDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film_details);

        findViewById(R.id.btn_back_details).setOnClickListener(v -> finish());

        findViewById(R.id.btn_book_now).setOnClickListener(v -> {
            startActivity(new android.content.Intent(this, TicketSelectionActivity.class));
        });

        findViewById(R.id.btn_play_trailer).setOnClickListener(v -> {
            startActivity(new android.content.Intent(this, TrailerActivity.class));
        });


    }
}
