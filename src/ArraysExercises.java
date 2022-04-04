import java.util.Arrays;

public class ArraysExercises {


    public static Person[] addPerson(Person[] people, Person newPerson) {
        Person[] totalPeople = new Person[people.length +1];

        for (int i = 0; i < people.length; i++) {
            totalPeople[i] = people[i];
        }
        totalPeople[totalPeople.length - 1] = newPerson;
        return totalPeople;
    }



    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];

        people[0] = new Person("Oscar");
        people[1] = new Person("Leo");
        people[2] = new Person("Diego");

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());

        }

        Person[] newPersonsArray = ArraysExercises.addPerson(people, new Person("Alex"));

        for (int i = 0; i < newPersonsArray.length; i++) {
            System.out.println(newPersonsArray[i].getName());

        }
    }
}
