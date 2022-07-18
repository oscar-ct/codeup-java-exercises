import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GroceryListApp {

    private Scanner sc = new Scanner(System.in);
    public Path groceryCategoryTextFilePath = Paths.get("data/grocery_txt_files/grocery_categories.txt");
    public List<String> existingGroceryCategoryList = new ArrayList<>();
    public List<String> existingGroceryList = new ArrayList<>();

    public List<String> placeholderGroceryCategoryList = new ArrayList<>();

    public String getString() {
        return sc.nextLine();
    }


    public List <String> groceryCategoryList () {
        List <String> groceryCategories = new ArrayList<>();
        groceryCategories.add("beverages");
        groceryCategories.add("bread_bakery");
        groceryCategories.add("canned_goods");
        groceryCategories.add("dairy");
        groceryCategories.add("dry_baking_goods");
        groceryCategories.add("frozen_foods");
        groceryCategories.add("meats");
        groceryCategories.add("produce");
        return groceryCategories;
    }


    public void createAndWriteToGroceryCategoryListTxtFile () {
        try {
            Path file = Paths.get("data/grocery_txt_files/grocery_categories.txt");
//            if (Files.exists(file)) {
//                Files.write(file, Collections.singleton(""), StandardCharsets.UTF_8);
                Files.write(groceryCategoryTextFilePath, groceryCategoryList(), StandardCharsets.UTF_8);
//                Files.write(groceryCategoryTextFilePath, groceryCategoryList(), StandardOpenOption.APPEND);
//            }

        } catch(IOException e) {
            System.out.println("Something went wrong creating and adding grocery category list" + e);
        }
    }

    public void readGroceryCategoryListTxtFile () {
        try {
            existingGroceryCategoryList = Files.readAllLines(groceryCategoryTextFilePath);
            Collections.sort(existingGroceryCategoryList);
            existingGroceryCategoryList.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Error reading files " + groceryCategoryTextFilePath.getFileName());
            e.printStackTrace();
        }
    }

    public void createGroceryListByCategory () {
        for (String category : groceryCategoryList()) {
            try {
                Path file = Paths.get("data/grocery_txt_files/" + category + ".txt");
//                if (Files.exists(file)) {
                    Files.write(file, Collections.singleton(""), StandardCharsets.UTF_8);
//                }
            } catch (IOException e) {
                System.out.println("Something went wrong creating grocery lists by category" + e);
            }
        }


    }

    public void readGroceriesByCategoryTxtFile (String category) {
        Path file = Paths.get("data/grocery_txt_files/" + category + ".txt");
        try {
            existingGroceryList = Files.readAllLines(file);
            Collections.sort(existingGroceryList);
            existingGroceryList.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Error reading grocery list by category " + groceryCategoryTextFilePath.getFileName());
            e.printStackTrace();
        }
    }




    public static void main(String[] args) {
        GroceryListApp groceryListApp = new GroceryListApp();
//        groceryListApp.createAndWriteToGroceryCategoryListTxtFile();
//        groceryListApp.readGroceryCategoryListTxtFile();
//        groceryListApp.createGroceryListByCategory();
        groceryListApp.readGroceriesByCategoryTxtFile("beverages");

    }


}


