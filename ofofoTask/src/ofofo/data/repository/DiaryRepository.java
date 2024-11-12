package ofofo.data.repository;

import ofofo.data.model.Diary;

import java.util.List;

public interface DiaryRepository {
    Diary save(Diary diary);
    Diary findById(String userName);
    List<Diary> findByTitle(String title);
    void delete(Diary diary);
    void delete(int id);
    long count();
    void deleteAll();

}
