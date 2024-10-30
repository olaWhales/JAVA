package MainPackage.data.repositories;

import MainPackage.data.model.Entry;

import java.util.ArrayList;
import java.util.List;

public class EntryRepositoryImp implements EntryRepository {
    List<Entry> entries = new ArrayList<Entry>();

    @Override
    public Entry entry(int id, String title, String body) {
        Entry entry = new Entry();
        entry.setId(1);
        entry.setTitle("title");
        entry.setBody("body");
        entries.add(entry);
        return entry;
    }

    @Override
    public short numberOfEntry() {
        return (short) entries.size();
    }

    @Override
    public void delete() {
        entries.remove(entries.size()-1);
    }
}
