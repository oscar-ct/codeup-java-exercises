class DishTools {
    public static final int AVG_COST_OF_DISH_IN_CENTS = 12000;

    public static void shoutDishName(Dish dish) {
        System.out.println(dish.getNameOfDish().toUpperCase());
    }
    public static void analyzeDishCost(Dish dish) {
        if (dish.getCostInCents() < AVG_COST_OF_DISH_IN_CENTS){
            System.out.println("Less expensive than average");
        } else {
            System.out.println("More expensive than average");
        }
    }
    public static void flipRecommendation(Dish dish) {
        boolean reverse = dish.isWouldRecommend();
        dish.setWouldRecommend(!reverse);
    }
}



class Dish {
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

//    public String getDish() {
//        return "\nCost: " + costInCents + "\n" +
//                "Dish: " + nameOfDish + "\n" +
//                "Would recommend: " + wouldRecommend + "\n";
//    }
//
//    public void updateDish(int costInCents, String nameOfDish, boolean wouldRecommend) {
//        this.costInCents = costInCents;
//        this.nameOfDish = nameOfDish;
//        this.wouldRecommend = wouldRecommend;
//
//    }

/////////////////////  constructor  #1  ///////////////////////////////////////////////////////////////
    public Dish(int costInCents, String nameOfDish, boolean wouldRecommend) {
        this();
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }
/////////////////////  constructor  #2  ///////////////////////////////////////////////////////////////
    public Dish() {
    }
/////////////////////  getters  /////////////////////////////////////////////////////////////////////
    public int getCostInCents() {
        return costInCents;
    }
    public String getNameOfDish() {
        return nameOfDish;
    }
    public boolean isWouldRecommend() {
        return wouldRecommend;
    }
//////////////////////  setters  ///////////////////////////////////////////////////////////////////
    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }
    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }
    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

    public void printSummary() {
        System.out.printf("Cost: %d %nName: %s %nWould recommend: %b %n", costInCents, nameOfDish, wouldRecommend);
    }
}




public class DishTest {
    public static void main(String[] args) {
////////////// created an instance, used constructor #1 to set data  ///////////////////////////////
        Dish dish1 = new Dish(100 , "Pizza", true);


////////////// THIS ONLY WORKS FOR PUBLIC //////////////////////////////////////////////////////////
//        dish1.costInCents = 25;
//        dish1.nameOfDish = "Cheeseburger";
//        dish1.wouldRecommend = true;
//        System.out.println(dish1.getDish());

////////////// created an instance, used constructor #2, used setters to set data //////////////////
        Dish dish2 = new Dish();
        dish2.setCostInCents(2000000);
        dish2.setNameOfDish("Steak");
        dish2.setWouldRecommend(true);
//
//        dish2.updateDish(100, "Sandwich", true);
//
//        System.out.println(dish2.getDish());

        DishTools.shoutDishName(dish2);

        DishTools.analyzeDishCost(dish1);
        DishTools.analyzeDishCost(dish2);

        DishTools.flipRecommendation(dish1);
        DishTools.flipRecommendation(dish2);

        dish1.printSummary();
        dish2.printSummary();

    }
}