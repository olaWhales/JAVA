package MainPackage.data.repositories;

import MainPackage.data.model.Entry;

public interface EntryRepository {
    Entry entry (int id, String title, String body);

    short numberOfEntry();
}
