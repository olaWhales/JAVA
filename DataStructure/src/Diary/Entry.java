package Diary;

public class Entry {
    private String title;
    private String content;
    private int id ;

    public Entry(String title, String body, int id) {
        this.title = title;
        this.content = body;
        this.id = id;
    }

    public int findById(int entryID){
        return entryID;
    }
}
