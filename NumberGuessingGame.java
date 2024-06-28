import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have randomly chosen a number between " + minRange + " and " + maxRange + ".");
        System.out.println("Can you guess what it is within " + maxAttempts + " attempts?");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            }

            if (attempts == maxAttempts) {
                System.out.println(
                        "Sorry, you've used all " + maxAttempts + " attempts. The number was " + randomNumber + ".");
            }
        }

        System.out.println("Thank you for playing the Number Guessing Game. Goodbye!");
    }
}
