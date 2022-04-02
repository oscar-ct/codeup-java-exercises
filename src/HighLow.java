import java.util.Scanner;

public class HighLow {
    public static void guessingGame() {
        System.out.println("Let's play a guessing game. . .");
        System.out.println("I'm thinking of a number between 1 and 100, try and guess my number: ");
        Scanner sc = new Scanner(System.in);
        int computerValue = (int) (Math.random() * 100 + 1);
        int numberOfTries = 0;
        while (true) {
            numberOfTries++;
            int guessedNum = sc.nextInt();

            if (guessedNum < computerValue) {
                System.out.println("HIGHER");
            } else if (guessedNum > computerValue) {
                System.out.println("LOWER");
            } else {
                System.out.println("GOOD GUESS, it took you " + numberOfTries + " tries.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        guessingGame();
    }
}
