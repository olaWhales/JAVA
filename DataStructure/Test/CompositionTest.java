import BoyFriend.Girlfriend;
import BoyFriend.LekkiBoyfriend;
import BoyFriend.MushinBoyfriend;
import BoyFriend.YabaBoyfriend;
import org.junit.Test;

public class CompositionTest {
    @Test
    public void TestToCheckMushinBoy() {
        Girlfriend girlfriend = new Girlfriend(new MushinBoyfriend());
        girlfriend.care();
        girlfriend.last();
        girlfriend.spend();
    }
    @Test
    public void TestToCheckLekkiBoy() {
    Girlfriend girlfriend = new Girlfriend(new LekkiBoyfriend());
            girlfriend.care();
            girlfriend.last();
            girlfriend.spend();
    }
    @Test
    public void TestToCheckYabaBoyfriend() {
        Girlfriend girlfriend = new Girlfriend(new YabaBoyfriend());
        girlfriend.care();
        girlfriend.last();
        girlfriend.spend();
    }
}
