package MainPackage.repositories;

import MainPackage.models.Diary;

import java.util.List;

public class DiaryRepositorylmp implements DiaryRepository {
    private int users ;

    @Override
    public Diary save(Diary diary) {
        users++ ;
        return users == 1 ? diary : null;
    }

    @Override
    public List<Diary> findByTitle(String title) {
        return List.of();
    }

    @Override
    public void delete(int id) {
    }

    @Override
    public void delete(Diary diary) {
        users-- ;
    }

    @Override
    public long count(Diary diary) {
        return users;
    }

    @Override
    public Diary findById(String userName) {
        return null;
    }
}