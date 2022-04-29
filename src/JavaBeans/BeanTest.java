package JavaBeans;
import JavaBeans.Author;
import JavaBeans.Quotes;

import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args) {

        System.out.println();


        System.out.println();

        Author authorOne = new Author(1, "Stephen", "King");
        Author authorTwo = new Author(2, "Mark", "Twain");
        Author authorThree = new Author(2, "Albert", "Einstein");
        Author authorFour = new Author(2, "Nikola", "Tesla");

        Quotes quoteOne = new Quotes(1, authorOne, "Books are a uniquely portable magic");
        Quotes quoteTwo = new Quotes(2, authorTwo, "Always obey your parents when they are present");
        Quotes quoteThree = new Quotes(3, authorThree, "We cannot solve our problems with the same thinking we used when we created them");
        Quotes quoteFour = new Quotes(3, authorThree, "You want to find the secrets of the universe, think in terms of energy, frequency and vibration");





        ArrayList<Quotes> quoteArray = new ArrayList<>();

        quoteArray.add(quoteOne);
        quoteArray.add(quoteTwo);
        quoteArray.add(quoteThree);
        quoteArray.add(quoteFour);

        for (int i = 0; i < quoteArray.size(); i++) {
            System.out.print(quoteArray.get(i).getAuthor().getFirstName() + " ");
            System.out.print(quoteArray.get(i).getAuthor().getLastName() + ": ");
            System.out.println("'" + quoteArray.get(i).getContent() + "'");
        }


    }

}
