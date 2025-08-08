package com.codsoft;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    private static final int MAX_ATTEMPTS = 6;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        int rounds = 0;

        while (true) {
            rounds++;
            int numberToGuess = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
            int attempts = 0;
            boolean guessed = false;

            System.out.println("\nRound " + rounds);
            System.out.println("I'm thinking of a number between " + MIN_NUMBER + " and " + MAX_NUMBER + ".");

            while (attempts < MAX_ATTEMPTS) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();

                if (guess < MIN_NUMBER || guess > MAX_NUMBER) {
                    System.out.println("Invalid guess. Please enter a number between " + MIN_NUMBER + " and " + MAX_NUMBER + ".");
                    continue;
                }

                attempts++;

                if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    guessed = true;
                    score++;
                    break;
                }

                System.out.println("Attempts remaining: " + (MAX_ATTEMPTS - attempts));
            }

            if (!guessed) {
                System.out.println("Sorry, you didn't guess the number. The number was " + numberToGuess + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            scanner.nextLine();
            String playAgain = scanner.nextLine().toLowerCase();

            if (!playAgain.equals("yes")) {
                break;
            }
        }

        System.out.println("\nGame over! Your final score is " + score + " out of " + rounds + " rounds.");
    }
}
