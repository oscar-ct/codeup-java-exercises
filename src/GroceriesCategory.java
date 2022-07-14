import java.util.List;

public class GroceriesCategory {

    public List<String> beverages;
    public List<String> bread_bakery;
    public List<String> canned_goods;
    public List<String> dairy;
    public List<String> dry_baking_goods;
    public List<String> frozen_foods;
    public List<String> meats;
    public List<String> produce;

    public GroceriesCategory() {}

    public GroceriesCategory(List<String> beverages, List<String> bread_bakery, List<String> canned_goods, List<String> dairy, List<String> dry_baking_goods, List<String> frozen_foods, List<String> meats, List<String> produce) {
        this.beverages = beverages;
        this.bread_bakery = bread_bakery;
        this.canned_goods = canned_goods;
        this.dairy = dairy;
        this.dry_baking_goods = dry_baking_goods;
        this.frozen_foods = frozen_foods;
        this.meats = meats;
        this.produce = produce;
    }


    public List<String> getBeverages() {
        return beverages;
    }

    public void setBeverages(List<String> beverages) {
        this.beverages = beverages;
    }

    public List<String> getBread_bakery() {
        return bread_bakery;
    }

    public void setBread_bakery(List<String> bread_bakery) {
        this.bread_bakery = bread_bakery;
    }

    public List<String> getCanned_goods() {
        return canned_goods;
    }

    public void setCanned_goods(List<String> canned_goods) {
        this.canned_goods = canned_goods;
    }

    public List<String> getDairy() {
        return dairy;
    }

    public void setDairy(List<String> dairy) {
        this.dairy = dairy;
    }

    public List<String> getDry_baking_goods() {
        return dry_baking_goods;
    }

    public void setDry_baking_goods(List<String> dry_baking_goods) {
        this.dry_baking_goods = dry_baking_goods;
    }

    public List<String> getFrozen_foods() {
        return frozen_foods;
    }

    public void setFrozen_foods(List<String> frozen_foods) {
        this.frozen_foods = frozen_foods;
    }

    public List<String> getMeats() {
        return meats;
    }

    public void setMeats(List<String> meats) {
        this.meats = meats;
    }

    public List<String> getProduce() {
        return produce;
    }

    public void setProduce(List<String> produce) {
        this.produce = produce;
    }
}