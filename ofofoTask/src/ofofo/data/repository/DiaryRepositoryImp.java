package ofofo.data.repository;

import ofofo.data.model.Diary;

import java.util.ArrayList;
import java.util.List;

public class DiaryRepositoryImp implements DiaryRepository {
    List<Diary> diaries = new ArrayList<Diary>();
    private int count = 0 ;

    @Override
    public Diary save(Diary diary) {
        Diary diary1 = new Diary();
        diary1.setUserName("olawale");
        diary1.setPassword("1111");
        diaries.add(diary);
        count++;
        return count == 0 ? diary : null ;
    }

    @Override
    public Diary findById(String userName) {
        for(Diary diary : diaries) {
            if(diary.getUserName().equals(userName)) {
                return diary;
            }
        }
        return null;
    }

    @Override
    public List<Diary> findByTitle(String title) {
        return List.of();
    }

    @Override
    public void delete(Diary diary) {
        for(Diary deleteUser : diaries) {
            if(deleteUser.getUserName().equals(diary.getUserName())) {
                diaries.remove(deleteUser);
                break;
            }
        }
    }

    @Override
    public void delete(int id) {
        diaries.remove(1);
    }

    @Override
    public long count() {
        return diaries.size();
    }

    @Override
    public void deleteAll() {
        diaries.clear();
    }
}
