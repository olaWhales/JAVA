import MainPackage.data.repositories.EntryRepository;
import MainPackage.data.repositories.EntryRepositoryImp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class EntryRepositoryTest {
    private final EntryRepository entryRepository = new EntryRepositoryImp();

    @Test
    public void testAddEntry() {
        int check = entryRepository.entry(1 , "ola" , "tomorrow is today").getId();
        int check2 = entryRepository.entry(2 , "ola" , "tomorrow is today").getId();
        assertEquals(entryRepository.numberOfEntry() , 2);
        System.out.print(entryRepository.numberOfEntry());
    }

}
