package util;
import java.util.Scanner;

public class Input {

    private Scanner sc = new Scanner(System.in);

    public String getString() {
        System.out.println("Type some words:");
        return sc.nextLine();
    }

    public boolean yesNo() {
        System.out.println("yes or no?");
        String userInput = sc.next();
        return userInput.equals("y") || userInput.equals("yes");
    }

    public int getInt(int min, int max) {
        System.out.println("Enter a number between " + min + " - " + max + ": ");
        int userInput = sc.nextInt();
        if (userInput > max || userInput < min) {
            return getInt(min, max);
        } else {
            return userInput;
        }
    }

    public int getInt() {
        System.out.println("Enter a number: ");
        return sc.nextInt();
    }

    public double getDouble(double min, double max) {
        System.out.println("Enter a decimal number between " + min + " - " + max + ": ");
        double userInput = sc.nextDouble();
        if (userInput > max || userInput < min) {
            return getDouble(min, max);
        } else {
            return userInput;
        }
    }

    public double getDouble() {
        System.out.println("Enter a decimal number: ");
        return sc.nextDouble();
    }


}
