import java.util.Arrays;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        String output = String.format("The value of pi is approximately %.2f", pi);
//        System.out.println(output);

        Scanner sc = new Scanner(System.in);

//        System.out.print("Please enter an integer and store that value in an int variable using the nextInt method:");
//        int number = sc.nextInt();
//        System.out.printf("Your number is: %d",number);





//        System.out.print("Please enter your first, middle, and last name:");
//            String firstName = sc.next();
//            String middleName = sc.next();
//            String lastName = sc.next();
//        System.out.printf("Your first name is: %s, your middle name is %s, and your last name is %s", firstName, middleName, lastName);
//            System.out.println(firstName);
//            System.out.println(lastName);
//            System.out.println(what);




//        System.out.print("Please enter a sentence:");
//
//        String userSentence = sc.nextLine();
//        System.out.println(userSentence);





//        System.out.print("Please enter the length and width of the classroom at Codeup:");

//        String userInput = sc.nextLine();
//        String[] userNumbers = userInput.split(" ");
//
//        float length = Float.parseFloat(userNumbers[0]);
//        float width = Float.parseFloat(userNumbers[1]);
//        float area = length * width;
//        float perimeter = length * width * 2;
//
//        System.out.printf("The area of your classroom is: %.2f, and the perimeter is %.2f.", area, perimeter);






        System.out.print("Please enter the length:");
        String length = sc.nextLine();
        System.out.print("Please enter the width:");
        String width = sc.nextLine();

        float len = Float.parseFloat(length);
        float wid = Float.parseFloat(width);
        float ar = len * wid;
        float peri = len * wid * 2;

        System.out.printf("The area of your classroom is: %.2f, and the perimeter is %.2f.", ar, peri);

    }
}
