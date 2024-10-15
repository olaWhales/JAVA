package BoyFriend;

public class MainClass {
    public static void main(String[] args) {
        Girlfriend girlfriend = new Girlfriend(new YabaBoyfriend());
        girlfriend.spend();
        girlfriend.care();
        girlfriend.last();
        System.out.println(girlfriend);
    }
}
