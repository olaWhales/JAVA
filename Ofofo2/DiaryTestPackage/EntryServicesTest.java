import MainPackage.data.repositories.EntryRepository;
import MainPackage.data.repositories.EntryRepositoryImp;
import MainPackage.services.EntryServices;
import MainPackage.services.EntryServicesImp;
import org.junit.jupiter.api.Test;

import static java.util.Map.entry;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EntryServicesTest {
    private final EntryServices entryServices = new EntryServicesImp();

//    @Test
//    public void testToCheckIfEntryHaveAllRequiredFields() {
//        EntryRepository entryRepository = new EntryRepositoryImp();
//        entryRepository.entry(1 , "Life" , "I'm alive");
//        entryServices.saved(entryRepository);
//        assertEquals(entryServices.numberOfEntry() , 1);
//    }
}
