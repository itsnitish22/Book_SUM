package com.example.book_sum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Business extends AppCompatActivity {

    Button hardthings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business);

        hardthings = findViewById(R.id.hardthings);
        hardthings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hardthingsintent = new Intent(Business.this, TheHardThings.class);
                startActivity(hardthingsintent);
            }
        });
    }
}