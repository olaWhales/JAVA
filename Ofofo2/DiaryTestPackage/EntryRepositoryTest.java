import MainPackage.data.repositories.EntryRepository;
import MainPackage.data.repositories.EntryRepositoryImp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class EntryRepositoryTest {
    private final EntryRepository entryRepository = new EntryRepositoryImp();

    @Test
    public void testToAddEntry() {
        entryRepository.entry(1 , "ola" , "tomorrow is today").getId();
        entryRepository.entry(2 , "ola" , "tomorrow is today").getId();
        assertEquals(entryRepository.numberOfEntry() , 2);
        System.out.print(entryRepository.numberOfEntry());
    }
    @Test
    public void testRemoveEntry() {
        entryRepository.entry(1 , "ola" , "tomorrow is today").getId();
        entryRepository.entry(2 , "ola" , "tomorrow is today").getId();
        entryRepository.delete();
        assertEquals(entryRepository.numberOfEntry() , 1);
    }
}
