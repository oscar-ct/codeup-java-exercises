import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exceptions_lecture {

    public String maybeAnInteger = "42";
    public String certainlyNotAnInteger = "I am NOT an integer";

    public String iAmAString = "Hello World";

//    public void askForAnInteger(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter an integer");
//        String userInput = scanner.nextLine();
//        try {
//            int userInputInteger = Integer.parseInt(userInput);
//            System.out.println("The integer in your string is " + userInputInteger);
//        } catch (NumberFormatException nfx){
//            System.out.println("Uh oh, " + nfx.getMessage() + " there is no integer!");
//        } finally {
//            System.out.println("Thank you for using this complex and useful application.");
//            System.out.println("Please come back and visit.");
//        }
//    }


    public void subListMaker(String sentence){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer");
        int firstInt = scanner.nextInt();

        System.out.println("Please enter another integer");
        int secondInt = scanner.nextInt();

        System.out.println(sentence);

        ArrayList<String> wordArrayList = new ArrayList<String>();

        try {
            String[] stringArray = sentence.split(" ");
            for (String word : stringArray){
                wordArrayList.add(word);
            }
        } catch (NullPointerException npe) {
            System.out.println("NULLLLLLLL");
        }


        try {
            List<String> shorterList =  wordArrayList.subList(firstInt, secondInt);
            String newSentence = String.join(" ", shorterList);
            System.out.println(newSentence);
        } catch (IndexOutOfBoundsException iob) {
            System.out.println("Index out of bounds!!!");
        } catch (IllegalArgumentException iae) {
            System.out.println("Seriously? Your endpoint is wack!");
        }

    }


}
