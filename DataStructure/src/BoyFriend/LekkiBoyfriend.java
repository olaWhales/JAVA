package BoyFriend;

public class LekkiBoyfriend implements Boyfriend {
    @Override
    public void last() {
        System.out.println("he last 1 minute");
    }

    @Override
    public void spend() {
        System.out.println("He spend everyday");
    }

    @Override
    public void care() {
        System.out.println("I'm busy presently");
    }
}