import MainPackage.data.model.Diary;
import MainPackage.data.repositories.DiaryRepository;
import MainPackage.data.repositories.DiaryRepositoryImp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiaryRepositoryTest {
    private final DiaryRepository diaryRepository = new DiaryRepositoryImp();

    @Test
    public void testThatUserCanBeCreatedInDiary() {
        Diary diary = new Diary();
        diary.setUserName("Olawale");
        diary.setPassword("1111");
        diaryRepository.save(diary);
        assertEquals(diaryRepository.count() , 1);
    }

    @Test
    public void testThatUserCanBeUpdatedByAddingDiary() {
        Diary diary = new Diary();
        diary.setUserName("Olawale");
        diary.setPassword("1111");
        diaryRepository.save(diary);
        assertEquals(diaryRepository.count() , 1);
        Diary diary1 = new Diary();
        diary1.setUserName("Olawale");
        diary1.setPassword("1111");
        diaryRepository.save(diary1);
        assertEquals(diaryRepository.count() , 2);
    }

    @Test
    public void testThatUserCanBeDeletedByDeleteByDiary() {
        Diary diary = new Diary();
        diary.setUserName("Olawale");
        diary.setPassword("1111");
        diaryRepository.save(diary);
        diaryRepository.delete(diary);
        assertEquals(diaryRepository.count() , 0);
    }

    @Test
    public void testThatUserCanBeDeleteById() {
        Diary diary = new Diary();
        diary.setUserName("Olawale");
        diary.setPassword("1111");
        diaryRepository.save(diary);
        diaryRepository.delete(1);
        Diary diary1 = new Diary();
        diary1.setUserName("wale");
        diary1.setPassword("1112");
        diaryRepository.save(diary);
        assertEquals(diaryRepository.count() , 1);
    }

    @Test
    public void testThatUserCanBeRetrievedById() {
        Diary diary = new Diary();
        diary.setUserName("Olawale");
        diary.setPassword("1111");
        diaryRepository.save(diary);
        assertEquals(diaryRepository.count() , 1);
        Diary diary1 = new Diary();
        diary1.setUserName("wale");
        diary1.setPassword("1112");
        diaryRepository.save(diary1);
        assertEquals(diaryRepository.count() , 2);
        Diary find  = diaryRepository.findById("Olawale");
        assertEquals(find , diary1);
    }

//    @Test
//    public void testThatUserCanBeRetrievedByTitle() {}
}
