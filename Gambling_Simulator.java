package com.bridgelabz;

import java.util.Random;

public class Gambling_Simulator {

    // UC1 - As a Gambler, would start with a stake of $100 every day and bet $1 every game.

    public static final int STAKE = 100;
    public static final int BET_VALUE = 1;

    static int newStake = STAKE;

    // UC2 - As a Gambler make $1 bet so either win or loose $1

    public static void winLoose(int r){

        while (true) {
            if (r == BET_VALUE) {

                System.out.println("Gambler Wins!");
                newStake++;
                System.out.println("New Amount Inhand: "+newStake);
                //UC3 - As a Calculative Gambler if won or lost 50% of the stake, would resign for the day.

                if (newStake == 150){
                    System.out.println("Gambler resigns as he wins 50% more of his stake");
                    return;
                }
            }

            else {

                System.out.println("Gambler Loose!");
                newStake--;
                System.out.println("New Amount Inhand: "+newStake);

                //UC3 - As a Calculative Gambler if won or lost 50% of the stake, would resign for the day.

                if (newStake == 50){
                    System.out.println("Gambler resigns as he looses 50%  of his stake");
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Gambling Simulation Problem.");

        Random rand = new Random();
        int r = rand.nextInt(2);
        winLoose(r);
    }
}
