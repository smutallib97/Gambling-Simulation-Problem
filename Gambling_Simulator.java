package com.bridgelabz;

import java.util.Random;

public class Gambling_Simulator {

    // UC1 - As a Gambler, would start with a stake of $100 every day and bet $1 every game.

    public static final int STAKE = 100;
    public static final int BET_VALUE = 1;

    // UC2 - As a Gambler make $1 bet so either win or loose $1

    public static void winLoose(int r, int BET_VALUE){

        if (r == BET_VALUE){
            System.out.println("Gambler Wins!");
        }

        else{
            System.out.println("Gambler Loose!");

        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Gambling Simulation Program.");

        Random rand = new Random();
        int r = rand.nextInt(2);
        winLoose(r,BET_VALUE);
    }
}
}
