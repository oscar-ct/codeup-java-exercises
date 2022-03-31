import org.w3c.dom.ls.LSOutput;

import java.util.Objects;
import java.util.Scanner;

public class MethodsExercises {


//    public static int addition(int x, int y){
//        return x + y;
//    }
//    public static int subtraction(int x, int y){
//        return x - y;
//    }
//    public static int multiplication(int x, int y){
////        int total = 0;
////        while (x > 0) {
////            total += y;
////            x--;
////        }
//        int total = 0;
//        for (int i = 0; i < y; i++) {
//           total += x;
//        }
//        return total;
//    }
//    public static int division(int x, int y){
//        return x / y;
//    }
//    public static int modulus(int x, int y){
//        return x % y;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(addition(10, 10));
//        System.out.println(subtraction(10, 10));
//        System.out.println(multiplication(50, 10));
//        System.out.println(division(10,10));
//        System.out.println(modulus(10, 2));
//    }


//    public static int getInteger(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = sc.nextInt();
//
//        if (userInput > max || userInput < min) {
//            System.out.println("Input is invalid");
//            return getInteger(min, max);
//        } else {
//            System.out.println("You know how to follow rules, thank you.");
//            return userInput;
//        }
//    }

//    public static void main(String[] args) {
//        getInteger(1, 10);
//    }


//    public static int calcFactorial(int num) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = sc.nextInt();
//    }


//    public static int numberOfSides() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Lets roll some dice. . . ");
//        System.out.println("Enter a number of sides for a pair of dice: ");
//        int userInput = sc.nextInt();
//        if (userInput == 0) {
//            System.out.println("Dice need at least 1 side, try again!");
//            return numberOfSides();
//        } else {
//            return userInput;
//        }
//    }
//
//    public static int randomNumber(int num) {
//        return (int) (Math.random() * num + 1);
//    }
//
//    public static void rollingDice (int e) {
//        Scanner sc = new Scanner(System.in);
//        String answer;
//        do {
//            System.out.println("Your first die rolled: " + randomNumber(e));
//            System.out.println("Your second die rolled: " + randomNumber(e));
//            System.out.println("Roll again? y or n");
//            System.out.println("Or type 'change' to restart");
//
//            answer = sc.next();
//            if (answer.equals("change")) {
//                rollingDice(numberOfSides());
//            }
//        } while (answer.equals("y"));
//    }
//
//
//    public static void main(String[] args) {
//        rollingDice(numberOfSides());
//        System.out.println("Thank you, come again!");
//    }


}
