package com.example.marta.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView textView = findViewById(R.id.result);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String result = extras.getString("bothHands");

        textView.setText(result);
    }

    public void onPlayAgainButtonClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

}
