import ofofo.model.Diary;
import ofofo.repository.DiaryRepository;
import ofofo.repository.DiaryRepositoryImp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiaryRepositoryTest {
    private final DiaryRepository diaryRepository = new DiaryRepositoryImp();
    @Test
    public void testThatDiaryIsEmpty() {
        assertEquals(diaryRepository.count() , 0);
    }
    @Test
    public void testThatDiaryIsNotEmpty() {
        Diary diary = new Diary();
        diary.setUserName("Olawale");
        diary.setPassword("1111");
        diaryRepository.save(diary);
        assertEquals(diaryRepository.count() , 1);
    }
    @Test
    public void testThatDiaryCanRegisterMoreThanOneUsers(){
        Diary diary = new Diary();
        diary.setUserName("Olawale");
        diary.setPassword("1111");
        diaryRepository.save(diary);
        assertEquals(diaryRepository.count() , 1);
        diary.setUserName("wale");
        diary.setPassword("2222");
        diaryRepository.save(diary);
        assertEquals(diaryRepository.count() , 2);
    }
    @Test
    public void testThatDiaryCanDeleteById(){
        Diary diary = new Diary();
        diary.setUserName("Olawale");
        diary.setPassword("1111");
        diaryRepository.save(diary);
        assertEquals(diaryRepository.count() , 1);
        Diary diary1 = new Diary();
        diary.setUserName("Olawale");
        diary.setPassword("1111");
        diaryRepository.save(diary1);
        assertEquals(diaryRepository.count() , 2);
        diaryRepository.delete(1);
        assertEquals(diaryRepository.count() , 1);
    }
    @Test
    public void testThatDiaryCanDeleteByIndex(){
        Diary diary = new Diary();
        diary.setUserName("Olawale");
        diary.setPassword("1111");
        diaryRepository.save(diary);
        assertEquals(diaryRepository.count() , 1);
        diaryRepository.delete(diary);
        assertEquals(diaryRepository.count() , 0);
    }
    @Test
    public void testThatDiaryCanBeFindID(){
        Diary diary = new Diary();
        diary.setUserName("Olawale");
        diary.setPassword("1111");
        diaryRepository.save(diary);
        assertEquals(diaryRepository.count() , 1);
        Diary diary1 = new Diary();
        diary1.setUserName("wale");
        diary1.setPassword("1111");
        diaryRepository.save(diary1);
        assertEquals(diaryRepository.count() , 2);
        Diary findUserById = diaryRepository.findById("Olawale");
        assertEquals(findUserById.getUserName(),  "Olawale");
    }
    @Test
    public void testThatDiaryCanDeleteAll(){
        Diary diary = new Diary();
        diary.setUserName("Olawale");
        diary.setPassword("1111");
        diaryRepository.save(diary);
        assertEquals(diaryRepository.count() , 1);
        Diary diary1 = new Diary();
        diary1.setUserName("wale");
        diary1.setPassword("1111");
        diaryRepository.save(diary1);
        assertEquals(diaryRepository.count() , 2);
        diaryRepository.deleteAll();
        assertEquals(diaryRepository.count() , 0);
    }

}
