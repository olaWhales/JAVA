import ofofo.servicies.EntryServicesImp;
import ofofo.servicies.EntryServicies;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EntryServiciesTest {
    EntryServicies entryServicies = new EntryServicesImp();
    @Test
    public void testThatEntryIsEmpry() {
        entryServicies.isLock();
        assertTrue(entryServicies.islocked());
    }
    @Test
    public void testThatEntryIsNotLocked() {
        entryServicies.isLock();
        entryServicies.unLock();
        assertFalse(entryServicies.islocked());
    }
    @Test
    public void testThatEntryCanBeCreated() {
        entryServicies.isLock();
        entryServicies.unLock();
        entryServicies.createEntry(1 , "Life" , "Life is good" , "Olawale");
        assertEquals(entryServicies.size() , 1);
    }
    @Test
    public void testThatEntryCreatedCanBeUpdated() {
        entryServicies.isLock();
        entryServicies.unLock();
        entryServicies.createEntry(1 , "Life" , "Life is good" , "Olawale");
        entryServicies.createEntry(2 , "Life" , "Life is good" , "Olawale");
        assertEquals(entryServicies.size() , 2);
    }

}
