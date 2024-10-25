import MainPackage.models.Diary;
import MainPackage.repositories.DiaryRepositorylmp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiaryRepositoryTest {
    private final DiaryRepositorylmp diaryRepository = new DiaryRepositorylmp();

    @Test
    public void checkIfDiaryIsEmpty() {
        long answer = diaryRepository.count();
        assertEquals(0, answer);
    }

    @Test
    public void checkIfDiaryIsNotEmpty() {
        long answer = diaryRepository.count();
        assertEquals(0, answer);
        diaryRepository.save(new Diary());
        diaryRepository.save(new Diary());
        assertEquals(diaryRepository.count(), 2);
    }
    @Test
    public void testToCheckIfDiaryCanBeFindById(){
        Diary diary = new Diary();
        diary.setUserName("Name");
        diary.setPassword("password");
        diary.getEntries();
        diaryRepository.save(diary);
        diaryRepository.save(new Diary());
        assertEquals(diaryRepository.count(), 2);

    }

}
