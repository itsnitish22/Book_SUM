package com.example.book_sum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class category extends AppCompatActivity {

    Button personality;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        personality = findViewById(R.id.hardthings);
        personality.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categories_intent = new Intent(category.this, Business.class);
                startActivity(categories_intent);
            }
        });
    }
}