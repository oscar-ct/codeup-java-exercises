

public class GroceriesCategory {

    public String beverages;
    public String bread_bakery;
    public String canned_goods;
    public String dairy;
    public String dry_baking_goods;
    public String frozen_foods;
    public String meats;
    public String produce;

    public GroceriesCategory(){}

    public GroceriesCategory(String beverages, String bread_bakery, String canned_goods, String dairy, String dry_baking_goods, String frozen_foods, String meats, String produce) {
        this.beverages = beverages;
        this.bread_bakery = bread_bakery;
        this.canned_goods = canned_goods;
        this.dairy = dairy;
        this.dry_baking_goods = dry_baking_goods;
        this.frozen_foods = frozen_foods;
        this.meats = meats;
        this.produce = produce;
    }

    public String getBeverages() {
        return beverages;
    }

    public void setBeverages(String beverages) {
        this.beverages = beverages;
    }

    public String getBread_bakery() {
        return bread_bakery;
    }

    public void setBread_bakery(String bread_bakery) {
        this.bread_bakery = bread_bakery;
    }

    public String getCanned_goods() {
        return canned_goods;
    }

    public void setCanned_goods(String canned_goods) {
        this.canned_goods = canned_goods;
    }

    public String getDairy() {
        return dairy;
    }

    public void setDairy(String dairy) {
        this.dairy = dairy;
    }

    public String getDry_baking_goods() {
        return dry_baking_goods;
    }

    public void setDry_baking_goods(String dry_baking_goods) {
        this.dry_baking_goods = dry_baking_goods;
    }

    public String getFrozen_foods() {
        return frozen_foods;
    }

    public void setFrozen_foods(String frozen_foods) {
        this.frozen_foods = frozen_foods;
    }

    public String getMeats() {
        return meats;
    }

    public void setMeats(String meats) {
        this.meats = meats;
    }

    public String getProduce() {
        return produce;
    }

    public void setProduce(String produce) {
        this.produce = produce;
    }
}
