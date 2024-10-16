import Duck.*;
import org.junit.Test;

public class DuckTest {
    @Test
    public void testToTestQuake() {
        DuckClass duckClass = new DuckClass(new Quake1(), new Fly2());
        DuckClass duckClass2 = new DuckClass(new Quake2(), new Fly2());
        DuckClass duckClass3 = new DuckClass(new Quake3(), new Fly2());
            duckClass.quake();
            duckClass3.quake();
            duckClass2.quake();
    }
    @Test
    public void testToTestFly() {
        DuckClass duckClass = new DuckClass(new Quake1(), new Fly2());
        DuckClass duckClass2 = new DuckClass(new Quake2(), new Fly1());
        DuckClass duckClass3 = new DuckClass(new Quake3(), new Fly3());
        duckClass2.fly();
        duckClass3.fly();
        duckClass.fly();
    }
}
