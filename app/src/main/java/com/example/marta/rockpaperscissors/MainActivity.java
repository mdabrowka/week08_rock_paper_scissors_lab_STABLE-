package com.example.marta.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView pickAMove;
    private Button buttonRock, buttonPaper, buttonScissors;

    private Game game;
    private Choices choices;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.pickAMove = (TextView) findViewById(R.id.pick_a_move);
        this.buttonRock = (Button) findViewById(R.id.button_rock);
        this.buttonPaper = (Button) findViewById(R.id.button_paper);
        this.buttonScissors = (Button) findViewById(R.id.button_scissors);

        game = new Game();

        Log.d("MainActivity", "OnCreate called");

    }

        public void onRockButtonClick(View view) {
        String rockInput = game.play(choices.ROCK, game.getRandomChoice());
        Intent intent = new Intent(this, ResultActivity.class);

        intent.putExtra("bothHands", rockInput);

        startActivity(intent);

        }

        public void onPaperButtonClick(View view) {
        String paperInput = game.play(choices.PAPER, game.getRandomChoice());
        Intent intent = new Intent(this, ResultActivity.class);

        intent.putExtra("bothHands", paperInput);

        startActivity(intent);

    }



        public void onScissorsButtonClick(View view) {
        String scissorsInput = game.play(choices.SCISSORS, game.getRandomChoice());
        Intent intent = new Intent(this, ResultActivity.class);

        intent.putExtra("bothHands", scissorsInput);

        startActivity(intent);

    }

}
