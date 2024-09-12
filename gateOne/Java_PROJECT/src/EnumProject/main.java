package EnumProject;

public class main {
    public static void main(String... args) {
        Product product = new Product();
      //  ProductCategory category = ProductCategory.GROCERIES;
      //  System.out.println(category);
        for(ProductCategory category : ProductCategory.values()){
            System.out.println(category);
            System.out.println(category.describeConstable());
        }



    }
}
