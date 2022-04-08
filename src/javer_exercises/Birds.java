package javer_exercises;

public class Birds {
    // can it fly?
    private boolean canFly;

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean isCanFly() {
        return canFly;
    }

    // what kind of bird is it?
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise(){
        System.out.println("Tweet tweet");
    }

    public void move(){
        System.out.println("Flap flap");
    }

}
