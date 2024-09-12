package EnumProject;
import java.util.Scanner;

public class main {
    public static void main(String... args) {
        Product product = new Product();
        product.
        Customer customer = new Customer();
        ShoppingCart cart = new ShoppingCart();
        CardType cardType = new CardType();
        Estore estore = new Estore();
        Item item = new Item();
        BillingInfo billingInfo = new BillingInfo();


      //  ProductCategory category = ProductCategory.GROCERIES;
      //  System.out.println(category);
        for(ProductCategory category : ProductCategory.values()){
            System.out.println(category);
            System.out.println(category.describeConstable());
        }



    }
}
