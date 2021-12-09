package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final int ROCK = 0;
    private static final int PAPER = 1;
    private static final int SCISSORS = 2;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Random randomGenerator = new Random();

        String playerChoice;
        int playerValue = -1;

        do {

        int computerValue = randomGenerator.nextInt(3);
        String computerChoice;

        if (computerValue == ROCK) {
            computerChoice = "rock";
        } else if (computerValue == PAPER) {
            computerChoice = "papper";
        } else {
            computerChoice = "scissors";
        }

        System.out.println("Please enter rock, paper or scissors ");
        playerChoice = scanner.nextLine().toLowerCase();

        if (playerChoice.equals("rock")) {
            playerValue = ROCK;
        } else if (playerChoice.equals("papper")) {
            playerValue = PAPER;
        } else if (playerChoice.equals("scissors")) {
            playerValue = SCISSORS;
        } else {
            System.out.printf("%s is not a valid choice.%n", playerChoice);
        }

        System.out.printf("Computer cose %s, player chose %s. %n", computerChoice, playerChoice);

        if (playerValue == computerValue) {
            System.out.println("Its a draw!!! - (I don't know why they didn't call it a picture?");
        } else if ((playerValue - 1 == computerValue)
                || (playerValue == ROCK && computerValue == SCISSORS)) {
            System.out.println("Player wins!!!");
        } else {
            System.out.println("The computer wins!!!");
        }
     } while (getYesOrNo("Would you like to play again?"));

        scanner.close();
    }
    /**
     * Returns a boolean response to a yes/no question.
     *
     * @param question The question to be asked.
     * @return True if the answer was yes, False if no.
     */
    public static boolean getYesOrNo(String question) {
        String answer;

        while (true) {  // infinite loop.  return will exit the method, thus terminating the loop
            System.out.printf("%s%n", question);
            answer = scanner.nextLine();
            answer = answer.toLowerCase();

            if (answer.equals("y")) {
                return true;
            }

            if (answer.equals("n")) {
                return false;
            }
        }
    }
}



