import org.w3c.dom.ls.LSOutput;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroceryListApp {

    private Scanner sc = new Scanner(System.in);
    public Path groceryCategoryTextFilePath = Paths.get("data/groceryCategory.txt");
    public List<String> existingGroceryCategoryList = new ArrayList<>();
    public List<String> placeholderGroceryCategoryList = new ArrayList<>();

    public String getString() {
        return sc.nextLine();
    }


    public void createGroceryCategoryListTxt () {
        List <String> groceryCategories = new ArrayList<>();
        groceryCategories.add("beverages");
        groceryCategories.add("bread_bakery");
        groceryCategories.add("canned_goods");
        groceryCategories.add("dairy");
        groceryCategories.add("dry_baking_goods");
        groceryCategories.add("frozen_foods");
        groceryCategories.add("meats");
        groceryCategories.add("produce");

    }






}
