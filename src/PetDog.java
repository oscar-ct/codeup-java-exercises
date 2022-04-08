public class PetDog extends Pet {

    private boolean trained;

    public PetDog(String name, String type) {
        super(name, type);
    }

    boolean isTrained () {
        return trained;
    }


}
