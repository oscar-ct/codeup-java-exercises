import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Bob would like to talk with you . . ." + "go ahead and say something to Bob.\n");

        while (true) {
            String input = sc.nextLine();

            if (input.endsWith("?")) {
                System.out.println("Bob says: " + "Sure");
            } else if (input.endsWith("!")) {
                System.out.println("Bob says: " + "Whoa, chill out!");
            } else if (input.isBlank()) {
                System.out.println("Bob says: " + "Fine. Be that way!");
            } else if (input.equals("shut up bob")) {
                System.out.println("Bob says: " + "You're mean, i'm leaving!");
                break;
            } else {
                System.out.println("Bob says: " + "Whatever");
            }
        }
    }
}
