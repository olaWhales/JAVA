package BoyFriend;

public class Girlfriend {
    private Boyfriend boyfriend;

    public Girlfriend(Boyfriend boyfriend) {
        this.boyfriend = boyfriend;
    }

    public Boyfriend getBoyfriend() {
        return boyfriend;
    }

    public void setBoyfriend(Boyfriend boyfriend) {
        this.boyfriend = boyfriend;
    }

    public void spend(){
        boyfriend.spend();
    }
    public void care() {
        boyfriend.care();
    }
    public void last(){
        boyfriend.last();
    }
}
