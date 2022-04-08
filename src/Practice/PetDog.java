public class PetDog extends Pet implements Companion{

    private boolean trained;

    public PetDog(String name, String type) {
        super(name, type);
    }


    boolean isTrained () {
        return trained;
    }


    @Override
    public String snuggle() {
        return this.name;
    }
}
