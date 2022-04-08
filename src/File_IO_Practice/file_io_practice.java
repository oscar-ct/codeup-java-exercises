package File_IO_Practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class file_io_practice {

    public static void main(String[] args) throws IOException {

//        Path fakePath = Paths.get("hey", "hey", "hey", "sup.text");
//        System.out.println(fakePath.toAbsolutePath());
//        Path fakePath2 = Paths.get("/hello");
//        System.out.println(fakePath2.isAbsolute());

        Path dishesPath = Paths.get("data", "dishes.txt");
        Path dishesDirectory = Paths.get("data");


        List<String> fileData = null;


        try {
            if (Files.notExists(dishesDirectory)) Files.createDirectories(dishesDirectory);
            if (Files.notExists(dishesPath)) Files.createFile(dishesPath);
            fileData = Files.readAllLines(dishesPath);

        } catch (IOException e) {
            System.out.println("Trash");
        }



        try {
            fileData.add("Whats up");
            Files.write(dishesPath, fileData);
        } catch (IOException e) {
            System.out.println("Trash");
        }


        List<String> moreDishes = Arrays.asList("hello", "fellas");
        Files.write(
                Paths.get("data", "dishes.txt"),
                moreDishes,
                StandardOpenOption.APPEND
        );


        try {
            fileData = Files.readAllLines(dishesPath);

        } catch (IOException e) {
            System.out.println("Trashhhh");
        }

        for (String line : fileData) {
            System.out.println(line);
        }


    }

}
