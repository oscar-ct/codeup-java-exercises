package Practice;

import java.util.ArrayList;

public class PetDogTest {
    public static void main(String[] args) {


    PetDog petdog = new PetDog("Spot", "Mut", true);
    PetDog petdog1 = new PetDog("Spark", "Mut", false);
    PetDog petdog2 = new PetDog("Blue", "Mut", true);

        System.out.println(petdog.snuggle());
        System.out.println(petdog.isTrained());

        ArrayList<PetDog> pets = new ArrayList<>();
        pets.add(petdog);
        pets.add(petdog1);
        pets.add(petdog2);
        PetDog.allSnuggle(pets);



    }
}
