package MainPackage.repositories;

import MainPackage.models.Diary;

import java.util.List;

public interface DiaryRepository {
    Diary save(Diary diary);
    List<Diary> fiindByTitle(String title);
    void delete(int id);
    void delete(Diary diary);
    long count();
    Diary findById(String userName);
}
