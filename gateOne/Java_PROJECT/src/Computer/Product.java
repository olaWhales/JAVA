package computer;

abstract class Product{
    private String model ;
    private String manufacture ;
    private int width ;
    private int height ;
    private int depth ;

    public Product(String model, String manufacture) {
        this.model = "2022" ;
        this.manufacture = "Mazda";
    }




    public String getManufacture() {
        return manufacture;
    }

    public String getModel() {
        return model;
    }


    public abstract String getPressPowerButton();
}
