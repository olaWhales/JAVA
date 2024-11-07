package ofofo.servicies;

public interface EntryServicies {
    void unLock();

    boolean  islocked();

    void isLock();

    void register(int id, String title, String body, String olawale);
}
