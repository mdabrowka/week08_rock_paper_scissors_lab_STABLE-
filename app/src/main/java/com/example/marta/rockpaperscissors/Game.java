package com.example.marta.rockpaperscissors;

import java.util.Random;

/**
 * Created by marta on 15/11/2017.
 */

public class Game {
    private Choices choices;

    public Enum getRandomChoice() {
        Choices[] choices = Choices.values();
        Random random = new Random();

        return choices[random.nextInt(choices.length)];
    }

    public String play(Enum human, Enum computer) {

        if (human == computer) {
            String drawStatement = "You play "+human.toString() + "\nComputer plays "+ computer +"\nIt's a Draw";
            return drawStatement;
        }
        else if (human == choices.ROCK && computer == choices.SCISSORS) {
            return "You play ROCK \n Computer plays SCISSORS \n You win the game";
        }
        else if (computer == choices.ROCK && human == choices.SCISSORS) {
            return "Computer plays ROCK \n You play SCISSORS \n Computer wins game";
        }
        else if (human == choices.SCISSORS && computer == choices.PAPER) {
            return "You play SCISSORS \n Computer plays PAPER \n You win the game";
        }
        else if (computer == choices.SCISSORS && human == choices.PAPER) {
            return "Computer plays SCISSORS \n You play paper \n You win the game";
        }
        else if (human == choices.PAPER && computer == choices.ROCK) {
            return "You play PAPER \n Computer plays ROCK \n You win the game";
        }
        else if (computer == choices.PAPER && human == choices.ROCK) {
            return "Computer plays PAPER \n You play ROCK \n Computer wins game";
        }

        return "Whatevs";
    }



}







//    // get an array of all the cards
//    private Card[]cards=Cards.values();
//    // this generates random numbers
//    private Random random = new Random();
//    // choose a card at random
//    final Card random(){
//        return cards[random.nextInt(cards.length)];
//    }