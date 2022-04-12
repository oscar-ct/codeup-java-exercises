package Practice;

import java.util.ArrayList;

public class Pet {

    String name;
    String type;

    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void allSnuggle(ArrayList<PetDog> list) {
        for (PetDog dog : list) {
            System.out.println(dog.snuggle());
        }
    }

}
