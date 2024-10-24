package MealBurger;

public class Burgers extends Item{
    private Item extra1;
    private Item extra2;
    private Item extra3;



    public Burgers(String name, String type, double price) {
        super(name, type, price);
    }

    public void addTopping(String name, String type, double price) {
        if(extra1 == null) {
            extra1 = new Item(name, type, price);
        }else if(extra2 == null) {
            extra2 = new Item(name, type, price);
        }else if(extra3 == null) {
            extra3 = new Item(name, type, price);
        }
    }

    public  Item getExtra1() {
        if (extra1 != null) {
            return extra1;
        }
        return null;
    }

    public  Item getExtra2() {
        if (extra2 != null) {
            return extra2;
        }
        return null;
    }

    public  Item getExtra3() {
        if (extra3 != null) {
            return extra3;
        }
        return null;
    }


}
