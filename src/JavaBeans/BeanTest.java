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


        Quotes quoteOne = new Quotes(1, authorOne, "Books are a uniquely portable magic");
        Quotes quoteTwo = new Quotes(2, authorTwo, "Always obey your parents when they are present");


        ArrayList<Quotes> quoteArray = new ArrayList<>();

        quoteArray.add(quoteOne);
        quoteArray.add(quoteTwo);

        for (int i = 0; i < quoteArray.size(); i++) {
            System.out.print(quoteArray.get(i).getAuthor().getFirstName() + " ");
            System.out.print(quoteArray.get(i).getAuthor().getLastName() + ": ");
            System.out.println("'" + quoteArray.get(i).getContent() + "'");
        }


    }

}
