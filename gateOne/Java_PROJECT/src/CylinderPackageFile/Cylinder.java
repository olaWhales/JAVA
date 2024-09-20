package CylinderPackageFile;

public class Cylinder {
    private int radius;
    private int height;

    public Cylinder(int radius , int height){
        this.radius = radius;
        this.height = height;
    }
    public void setRadius(int radius) {
        radiusIsNotValid(radius); {
            this.radius = radius;
        }
    }
    public boolean radiusIsNotValid(int radius) {
        if (radius % 2 != 0) {
            throw new IllegalArgumentException("Radius must be even");
        }
        return true ;
    }
    public int getRadius() {
        return radius;
    }
    public void setHeight(int height) {
        heightIsNotValid(height);
        this.height = height;
    }
    private boolean heightIsNotValid(int height) {
        if (height % 2 != 0) {
           throw new IllegalArgumentException("Height must be even");
        }
        return true;
    }
    public int getHeight() {
        return height ;
    }

    public int totalCalculation(int radius , int height) {
        heightIsNotValid(height);
        radiusIsNotValid(radius);
        float pi = 3.14157f ;
        float result = pi * radius * height;
        return (int) result;
    }
}
