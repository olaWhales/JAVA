import MainPackage.models.Diary;
import MainPackage.repositories.DiaryRepositorylmp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiaryRepositoryTest {
    private final DiaryRepositorylmp diaryRepository = new DiaryRepositorylmp();

    @Test
    public void checkIfDiaryIsEmpty() {
        long answer = diaryRepository.count(new Diary());
        assertEquals(0, answer);
    }

    @Test
    public void checkIfDiaryIsNotEmpty() {
        long answer = diaryRepository.count(new Diary());
        assertEquals(0, answer);
        diaryRepository.save(new Diary());
        diaryRepository.save(new Diary());
        assertEquals(diaryRepository.count(new Diary()), 2);
    }

}
