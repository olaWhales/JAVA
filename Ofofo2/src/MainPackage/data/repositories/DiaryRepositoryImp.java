package MainPackage.data.repositories;

import MainPackage.data.model.Diary;

import java.util.ArrayList;
import java.util.List;

public class DiaryRepositoryImp implements DiaryRepository {
    private List<Diary> listDiary =  new ArrayList<>();
    int users = 0 ;

    @Override
    public Diary save(Diary diary) {
        diary.setUserName("Olawale");
        diary.setPassword("1111");
        listDiary.add(diary);
        users++;
        return diary;
    }

    @Override
    public Diary findById(String userName) {
        this.listDiary.getFirst();
        return listDiary.get(users-1);
    }

    @Override
    public List<Diary> findByTitle(String title) {
        return List.of();
    }

    @Override
    public void delete(Diary diary) {
        users-- ;
    }

    @Override
    public void delete(int id) {
        users-- ;
    }

    @Override
    public long count() {
        return users;
    }



}
