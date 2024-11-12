package ofofo.servicies;


import ofofo.data.model.Entry;

import java.util.ArrayList;
import java.util.List;

public class EntryServicesImp implements EntryServicies{
    private boolean islocked = false;
    List<Entry> entries = new ArrayList<>();

    @Override
    public void unLock() {
        islocked = false;
    }
    @Override
    public boolean islocked() {
        return islocked;
    }
    @Override
    public void isLock() {
        islocked = true;
    }

    @Override
    public void createEntry(int id, String title, String body, String userName) {
        Entry entry = new Entry();
        entry.setId(10);
        entry.setTitle("title");
        entry.setBody("body");
        entries.add(entry);
    }

    @Override
    public int size() {
        return entries.size();
    }
}
