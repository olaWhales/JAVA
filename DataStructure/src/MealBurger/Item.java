package MealBurger;

public class Item {
    private String name ;
    private final String type ;
    private double price ;
    private String size = "Midium";

    public Item(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public void setBasePrice() {
        if(this.equals("midium")) {
            this.price = 1.5;
        }
    }
    public void setType(String type) {
    }

    public double getBasePrice() {
        return price;
    }


    public void setAdjustedPrice() {
        price = price * 1.2;
    }

    public double getAdjustedPrice() {
        return price;
    }

    public String toString() {
        return " Customer name: " + name + "\n " +
                "Goods bougth: " + type + "\n " +
                "Amount: " + price + "\n " +
                "The size of the goods bought: " + size;
    }

    public String printItem() {
        return toString();
    }

}
