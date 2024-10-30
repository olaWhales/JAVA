package MainPackage.services;

import MainPackage.data.repositories.EntryRepository;
import MainPackage.data.repositories.EntryRepositoryImp;

public interface EntryServices {

    EntryRepository entryRepository = new EntryRepositoryImp();

    void createEntry();

    void saved(EntryRepository entryRepository);
}
