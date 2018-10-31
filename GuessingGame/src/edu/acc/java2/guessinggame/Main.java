package edu.acc.java2.guessinggame;

public class Main {

    public static void main(String[] args) {
        final int theNumber = 1 + (int)(Math.random() * 100);
        int guesses = 0, guess = 0;
        System.out.println("Guess my number between 1 and 100!");
        while (true) {
            String input = System.console().readLine("Enter guess: ");
            guesses++;
            try {
                guess = Integer.parseInt(input);
            } catch (NumberFormatException nfe) {
                System.out.println("Only numbers between 1 and 100, please!");
                continue;
            }
            if (guess < theNumber)
                System.out.println("Guess higher!");
            else if (guess > theNumber)
                System.out.println("Guess lower!");
            else break;
        }
        String plural = guesses == 1 ? "y" : "ies";
        System.out.printf("You guessed my number in %d tr%s", guesses, plural);
    }

}
