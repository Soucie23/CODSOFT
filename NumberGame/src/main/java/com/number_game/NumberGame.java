package com.number_game;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        // Variable to store the player's name
        String name;

        // Scanner to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Display a welcome message
        System.out.println("===========================================");
        System.out.println("          Welcome to Number Game !!!       ");
        System.out.println("===========================================");

        // Main game loop
        while (true) {
            // Display menu options
            System.out.println("1. Play the game !!");
            System.out.println("2. Exit");
            System.out.println("Please enter your choice:");

            // Read user's choice
            int choice = scanner.nextInt();

            // Switch based on user's choice
            switch (choice) {
                case 1:
                    // Welcome the player and prompt for their name
                    System.out.println("Welcome !!");
                    System.out.print("Enter your name: ");
                    name = scanner.next();

                    // Generate a random number for the player to guess
                    Random random = new Random();
                    int myNumber = random.nextInt(100) + 1;

                    // Initialize variables for game
                    int attempts = 0;
                    boolean guessedCorrectly = false;
                    System.out.println(name + " " + "Guess the number between 1 to 100 !!");
                    // Guessing loop
                    while (attempts < 5) {
                        // Prompt the player to guess the number
                        int yourNumber = scanner.nextInt();
                        attempts++;

                        // Check if the guess is correct
                        if (yourNumber == myNumber) {
                            System.out.println("Correct !! You guessed the number in " + attempts + " attempts!");
                            guessedCorrectly = true;
                            break;
                        } else if (yourNumber < myNumber) {
                            System.out.println("Your guess is too low !!");
                        } else {
                            System.out.println("Your guess is too high !!");
                        }
                    }

                    // Display message if the player didn't guess correctly within the allowed attempts
                    if (!guessedCorrectly) {
                        System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + myNumber);
                    }

                    // Calculate and display the player's score
                    int score = 100 - attempts * 20; // Deduct 20 points for each attempt
                    System.out.println("Your score: " + score);

                    // Ask if the player wants to play again
                    System.out.println("Do you want to play again?");
                    System.out.println("Enter 'yes' to PLAY AGAIN and 'no' to EXIT");

                    // Read user's choice for playing again or exiting
                    String playAgainChoice = scanner.next();

                    // Check if the player wants to play again
                    if (!playAgainChoice.equals("yes")) {
                        System.out.println("Exit");
                        return;
                    }
                    break;

                case 2:
                    // Exit the game
                    System.out.println("Exit");
                    return;

                default:
                    // Display message for an invalid choice
                    System.out.println("Please enter a valid choice !!");
            }
        }
    }
}
