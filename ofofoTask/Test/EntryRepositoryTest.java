import ofofo.data.model.Entry;
import ofofo.data.repository.EntryRepository;
import ofofo.data.repository.EntryRepositoryImp;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EntryRepositoryTest {
    EntryRepository entryRepository = new EntryRepositoryImp();

    @Test
    public void testThatEntryIsEmpty() {
        assertEquals(entryRepository.count() , 0);
    }
    @Test
    public void testThatEntryIsNotEmpty() {
        Entry entry = new Entry();
        entry.setId(1111);
        entry.setTitle("Test");
        entry.setBody("i'm a great man");
        entryRepository.saveEntry(entry);
        assertEquals(entryRepository.count(), 1);
    }

    @Test
    public void testThatEntryCanDeleteByEntry() {
        Entry entry = new Entry();
        entry.setId(1111);
        entry.setTitle("Test");
        entry.setBody("i'm a  great man");
        entryRepository.saveEntry(entry);
        Entry entry2 = new Entry();
        entry2.setId(2222);
        entry2.setTitle("Test2");
        entry2.setBody("i'm the greatest man");
        entryRepository.saveEntry(entry2);
        entryRepository.delete(entry2);
        assertEquals(entryRepository.count(), 1);
    }
    @Test
    public void testThatEntryCanDeleteAllById(){
        Entry entry = new Entry();
        entry.setId(1111);
        entry.setDiaryId("Olawale");
        entry.setTitle("Ola");
        entry.setBody("i'm a great man");
        entryRepository.saveEntry(entry);
        assertEquals(entryRepository.count(), 1);
        entryRepository.deleteById( 1111);
        assertEquals(entryRepository.count() , 0);
    }
    @Test
    public void testThatEntryCanDeleteALLByDiaryId() {
        Entry entry = new Entry();
        entry.setId(1111);
        entry.setDiaryId("Olawale");
        entry.setTitle("Test");
        entry.setBody("i'm a great man");
        entryRepository.saveEntry(entry);
        entryRepository.deleteAll("Olawale");
        assertEquals(entryRepository.count(), 0);
    }
    @Test
    public void testThatEntryCanDeletedBy_DiaryId_And_CountId(){
        Entry entry = new Entry();
        entry.setId(1111);
        entry.setDiaryId("Olawale");
        entry.setTitle("Test");
        entry.setBody("i'm a great man");
        entryRepository.saveEntry(entry);
        assertEquals(entryRepository.count(), 1);
        entryRepository.deleteById("Olawale" , 1111);
        assertEquals(entryRepository.count(), 0);
    }
    @Test
    public void testThatEntryCanBeFind_findByDiary_and_Count(){
        Entry entry = new Entry();
        entry.setId(1111);
        entry.setDiaryId("Olawale");
        entry.setTitle("Test");
        entry.setBody("i'm a great man");
        entryRepository.saveEntry(entry);
        assertEquals(entryRepository.count(), 1);
        Entry entry1 = new Entry();
        entry1.setId(2222);
        entry1.setDiaryId("Olawale");
        entry1.setTitle("Life is vanity");
        entry1.setBody("i'm the greatest man");
        entryRepository.saveEntry(entry1);
        assertEquals(entryRepository.count(), 2);
        Entry findUserById = entryRepository.findById("Olawale" , 2222);
        assertEquals(findUserById.getTitle() , entry1.getTitle());
    }
    @Test
    public void testThatWeCanCheckIf_Entry_Exists(){
        Entry entry = new Entry();
        entry.setId(1111);
        entry.setDiaryId("Olawale");
        entry.setTitle("Test");
        entry.setBody("i'm a great man");
        entryRepository.saveEntry(entry);
        boolean userExist = entryRepository.existsById("Olawale" , 1111);
        assertTrue(userExist, entry.getTitle());
    }
    @Test
    public void testThatEntryCanBe_findByTitle(){
        Entry entry = new Entry();
        entry.setId(1111);
        entry.setDiaryId("Olawale");
        entry.setTitle("Test for entry");
        entry.setBody("i'm a great man");
        entryRepository.saveEntry(entry);
        Entry findByTitle = entryRepository.findByTitle("Olawale" , "Test for entry");
        assertEquals(findByTitle , entry);
    }
    @Test
    public void testThatEntryCanBe_findAll(){
        Entry entry = new Entry();
        entry.setId(1111);
        entry.setDiaryId("Olawale");
        entry.setTitle("Test for entry");
        entry.setBody("i'm a great man");
        entryRepository.saveEntry(entry);
        Entry entry2 = new Entry();
        entry2.setId(2222);
        entry2.setDiaryId("Olawale");
        entry2.setTitle("Test for entry");
        entry2.setBody("i'm the greatest man");
        entryRepository.saveEntry(entry2);
        assertEquals(entryRepository.count(), 2);
        List<Entry> entries = entryRepository.findAll("Olawale");
        System.out.println(entries);
    }
    @Test public void testThatEntryCanBeFoundById(){
        Entry entry = new Entry();

    }

}
