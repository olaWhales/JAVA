package SmartKitchen;

public class Smartkitchen {
    private CoffeeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishWasher;

public Smartkitchen() {
    brewMaster =   new CoffeeMaker();
    iceBox = new Refrigerator();
    dishWasher = new DishWasher();
}

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }
}
//public void setKitchenState(boolean coffeeFlag , boolean fridgeFlat , boolean dishWasherFlag){
//    brewMaster.setHasWorkToDo(coffeeFlag);
//    iceBox.setHasWorkToDo(coffeeFlag);
//    dishWasher.setHasWorkToDo(coffeeFlag);
//}


class DishWasher {

    public boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void doDishes() {

        if (hasWorkToDo) {
            System.out.println("Ordering Food");
            hasWorkToDo = false;
        }
    }
}
class Refrigerator {

    public boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Ordering Food");
            hasWorkToDo = false;
        }
    }
}