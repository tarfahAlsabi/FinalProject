package com.example.androiddisplayjokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayJoke extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_display_joke);
        Intent intent = getIntent();
        if(intent.hasExtra("joke")){
            String joke = intent.getStringExtra("joke");
            Toast.makeText(this, joke, Toast.LENGTH_SHORT).show();
        }
    }
}
