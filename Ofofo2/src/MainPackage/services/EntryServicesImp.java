package MainPackage.services;

import MainPackage.data.model.Entry;
import MainPackage.data.repositories.EntryRepository;
import MainPackage.data.repositories.EntryRepositoryImp;

import java.util.ArrayList;
import java.util.List;

public class EntryServicesImp implements EntryServices {
    EntryRepository repository = new EntryRepositoryImp();
    List<Entry> entries = new ArrayList<>();

    @Override
    public void createEntry() {
    }

    @Override
    public void saved(EntryRepository entryRepository) {

    }
}