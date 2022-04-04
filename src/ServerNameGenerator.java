import java.util.Random;

public class ServerNameGenerator {

    private String[] adjectives = {"colorful", "slimy", "quite", "loud", "sticky", "light", "fast", "hairy", "smelly", "calm", "noisy"};
    private String[] nouns = {"Fish", "Dog", "Cat", "Bug", "Bird", "Lizard", "Whale", "Pig", "Cow", "Goat"};


    public static String getRandom(String[] array) {
        int random = new Random().nextInt(array.length);
        return array[random];
    }


    public static void main(String[] args) {
        ServerNameGenerator serverNameGenerator = new ServerNameGenerator();
        System.out.println(getRandom(serverNameGenerator.nouns) + "-" + getRandom(serverNameGenerator.adjectives));
    }

}
