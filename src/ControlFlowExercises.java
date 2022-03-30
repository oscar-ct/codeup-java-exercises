import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            System.out.print((i++) + " ");
//        }

//        int i = 0;
//        do {
//            System.out.println(i);
//            i = i + 2;
//        } while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i = i - 5;
//        } while (i >= -10);

//        long i = 2;
//        do {
//            System.out.println(i);
//            i = i * i;
//        } while (i < 1000000);



//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }

//        for (int i = 100; i >= -10; i = i -5) {
//            System.out.println(i);
//        }

//        for (long i = 2; i < 1000000; i = i * i) {
//            System.out.println(i);
//        }


//        for (int i = 1; i <= 100; i++) {
//            boolean fb = false;
//
//            if (i % 3 == 0) {
//                System.out.print("Fizz");
//                fb = true;
//            }
//            if (i % 5 == 0) {
//                System.out.print("Buzz");
//                fb = true;
//            }
//            if (fb) {
//                System.out.println();
//            } else {
//                System.out.println(i);
//            }
//        }


//        for (int i = 1; i <= 100; i++) {
//            if ((i % 5 == 0) && (i % 3 == 0))
//                System.out.println("FizzBuzz");
//            else if (i % 5 == 0)
//                System.out.println("Buzz");
//            else if (i % 3 == 0)
//                System.out.println("Fizz");
//            else
//                System.out.println(i);
//        }

        Scanner sc = new Scanner(System.in);





//        String answer;
//       do {
//           System.out.print("Please enter a number 1-10:");
//
//           int input = sc.nextInt();
//
//           System.out.println("Here is your table! \n");
//           System.out.println("number | squared | cubed");
//           System.out.println("------ | ------- | -----");
//           for (int i = 1; i <= input; i++) {
//               int squared = i * i;
//               int cubed = i * i * i;
//               System.out.println(i + "\t   | " + squared + "\t\t | " + cubed);
//           }
//           System.out.println("Do you wish to continue? y or n");
//            answer = sc.next();
//       } while (answer.equals("y"));











//        while(true) {
//            System.out.print("Enter your grade number from 0-100:");
//
//            int input = sc.nextInt();
//
//            if (input >= 88) {
//                System.out.println("You received an A");
//            } else if (input >= 80) {
//                System.out.println("You received an B");
//            } else if (input >= 67) {
//                System.out.println("You received an C");
//            } else if (input >= 60) {
//                System.out.println("You received an D");
//            } else {
//                System.out.println("You received an F");
//            }
//
//            System.out.println("Do you wish to continue? y or n");
//            String answer = sc.next();
//
//            if (answer.equals("y")) {
//                continue;
//            } else {
//                break;
//            }
//        }


        String answer;
        do {
            System.out.print("Enter your grade number from 0-100:");

            int input = sc.nextInt();

            if (input >= 88) {
                System.out.println("You received an A");
            } else if (input >= 80) {
                System.out.println("You received an B");
            } else if (input >= 67) {
                System.out.println("You received an C");
            } else if (input >= 60) {
                System.out.println("You received an D");
            } else {
                System.out.println("You received an F");
            }

            System.out.println("Do you wish to continue? y or n");
            answer = sc.next();

        } while (answer.equals("y"));


    }
}
