package ofofo.servicies;

public interface EntryServicies {
    void unLock();
    boolean  islocked();
    void isLock();
    void createEntry(int id, String title, String body, String userName);
    int size();
}
