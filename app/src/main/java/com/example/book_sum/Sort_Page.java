package com.example.book_sum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.book_sum.Authors.Author;
import com.example.book_sum.R;

public class Sort_Page extends AppCompatActivity {
    Button categories, authors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort_page);

        categories = findViewById(R.id.categories_btn);
        authors = findViewById(R.id.authors_btn);

        categories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categories_intent = new Intent(Sort_Page.this, category.class );
                startActivity(categories_intent);
            }
        });
    }
}