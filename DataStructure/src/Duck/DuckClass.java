package Duck;

public class DuckClass {
    private Quakable quake;
    private Flyable flyable;

    public DuckClass( Quakable quake , Flyable flyable) {
        this.quake = quake;
        this.flyable = flyable;
    }
     public void quake() {
        quake.quake();
     }
     public void fly() {
        flyable.fly();
     }
}


