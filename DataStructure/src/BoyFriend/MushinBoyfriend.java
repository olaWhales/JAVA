package BoyFriend;

public class MushinBoyfriend implements Boyfriend {
    @Override
    public void last() {
        System.out.println("Last for 30 minutes");
    }

    @Override
    public void spend() {
        System.out.println("He has no money");
    }

    @Override
    public void care() {
        System.out.println("He's careless");
    }
}
