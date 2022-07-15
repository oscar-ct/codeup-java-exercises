import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
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
    public Path groceryCategoryTextFilePath = Paths.get("data/groceryCategories.txt");
    public List<String> existingGroceryCategoryList = new ArrayList<>();
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


    public void addGroceryCategoryListTxtFile () {
        try {
            Files.write(groceryCategoryTextFilePath, groceryCategoryList(), StandardOpenOption.APPEND);
        } catch(IOException e) {
            System.out.println("Something went wrong adding grocery category list" + e);
        }
    }

    public void readGroceryCategoryListTxtFile () {
        try {
            existingGroceryCategoryList = Files.readAllLines(groceryCategoryTextFilePath);
            Collections.sort(existingGroceryCategoryList);
        } catch (IOException e) {
            System.out.println("Error reading files " + groceryCategoryTextFilePath.getFileName());
            e.printStackTrace();
        }
        existingGroceryCategoryList.forEach(System.out::println);
    }


    public static void main(String[] args) {
        GroceryListApp groceryListApp = new GroceryListApp();
//        groceryListApp.addGroceryCategoryListTxtFile();
        groceryListApp.readGroceryCategoryListTxtFile();
    }


}


