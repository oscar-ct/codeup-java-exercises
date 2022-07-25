
import jdk.swing.interop.SwingInterOpUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

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

    public String capitalizeString (String string) {
        String[] words = string.split("\\s");
        String newString = "";
        for (String word : words) {
            String firstLetter = word.substring(0,1);
            String restOfWord = word.substring(1);
            newString += firstLetter.toUpperCase() + restOfWord + " ";
        }
        return newString.trim();
    }



    public void categoryMenu () {

            for (int i = 1; i < groceryCategoryList().size(); i++) {
                String category = groceryCategoryList().get(i).replaceAll("_", " ");
                System.out.println(i + ". " + capitalizeString(category));
            }
        System.out.println("X. Exit");
        System.out.println("-----  Select a category  -----");

    }


    public void mainMenu () {
        System.out.println("~~~~~~~~  Welcome to the Grocery App!  ~~~~~~~~");
        System.out.println("1. View Grocery List ");
        System.out.println("2. Create Grocery List ");
        System.out.println("X. Exit");
        System.out.println("-----  Select an option  -----");

        int selectedNumber = getInteger();
        if (selectedNumber == 1) {
            categoryMenu();
        } else if (selectedNumber == 2) {
            System.out.println("test 2 complete");
        } else {
            System.out.println("Fail t3st complete");
        }
    }

    public int getInteger() {
        try {
            return sc.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter a number");
            sc.nextLine();
            return getInteger();
        }
    }


    public HashMap<String, ArrayList<String>> groceryCategoriesHashMap () {
        HashMap<String, ArrayList<String>> groceriesByCategoryHM = new HashMap<>();
        for (String category : groceryCategoryList()) {
            groceriesByCategoryHM.put(category, new ArrayList<>());
        }
        return groceriesByCategoryHM;
    }

    public void groceryId () {
        HashMap<String, HashMap<String, ArrayList<String>>>  groceryIds = new HashMap<>();

        HashMap<String, ArrayList<String>> updatedGroceryList = groceryCategoriesHashMap();
        String groceryListName = sc.nextLine();
        groceryIds.put(groceryListName, updatedGroceryList);

        ArrayList<String> groceries = groceries("beverages");
        groceries.add(sc.nextLine());
        updatedGroceryList.put("beverages", groceries);

        System.out.println(groceryIds.get(groceryListName).get("beverages"));
    }

    public ArrayList<String> groceries (String category) {
        ArrayList<String> groceries = new ArrayList<>();
        return groceries;
    }

    public static void testingApplication () {
        System.out.println("This project is going to continue to in a separate spring boot application, Oscar out!");
    }







    public static void main(String[] args) {
        GroceryListApp groceryListApp = new GroceryListApp();
//        groceryListApp.createAndWriteToGroceryCategoryListTxtFile();
//        groceryListApp.readGroceryCategoryListTxtFile();
//        groceryListApp.createGroceryListByCategory();
//        groceryListApp.readGroceriesByCategoryTxtFile("beverages");
groceryListApp.groceryId();
//        groceryListApp.mainMenu();

//        System.out.println(groceryListApp.groceryCategoriesHashmap());


    }


}


