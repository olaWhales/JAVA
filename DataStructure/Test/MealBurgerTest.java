import MealBurger.Burgers;
import MealBurger.Item;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MealBurgerTest {
    @Test
    public void testToCreateMealBurgerClass() {
        Item burger = new Item("Olawale" , "fries" , 500);
    }

    @Test
    public void testToCheckIfBurgerClassCanGetBaseprice() {
        Item burger = new Item("Olawale" , "fries" , 500);
        burger.setBasePrice();
        burger.getBasePrice();
        assertEquals(500.0 , burger.getBasePrice());
    }
    @Test
    public void testToCheckIfBurgerClassCanGetPrice() {
        Item burger = new Item("Olawale" , "fries" , 500);
        burger.setAdjustedPrice();
        burger.getAdjustedPrice();
        assertEquals(600.0 , burger.getAdjustedPrice());
    }
    @Test
    public void testToPrintItemsBought() {
        Item burger = new Item("Olawale" , "fries" , 500);
        burger.setBasePrice();
        burger.getBasePrice();
        burger.printItem();
        System.out.println(burger.printItem());
        assertEquals(burger.toString(),burger.printItem());
    }
    @Test
    public void testThatBurgerCanBeCreated() {
        Burgers burgers = new Burgers("ola", "fries" ,500);
        assertTrue(burgers instanceof Burgers);
    }

    @Test
    public void test_To_Add_Extras_Item_With_Burger() {
        Burgers burgers = new Burgers("ola", "fries" ,500);
        burgers.addTopping("ola", "fri", 400);
        burgers.addTopping("Tolu", "fri", 500);
        burgers.addTopping("Friday", "fri", 400);

        Item item1  = burgers.getExtra1();
        Item item2  = burgers.getExtra2();
        Item item3  = burgers.getExtra3();

        System.out.println(item1.toString());
        System.out.println(item2.toString());
        System.out.println(item3.toString());

    }
}
