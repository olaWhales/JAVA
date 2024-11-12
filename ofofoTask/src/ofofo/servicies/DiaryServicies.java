package ofofo.servicies;

import ofofo.data.model.Diary;
import ofofo.data.model.Entry;

public interface DiaryServicies {
    Diary Register(String userName , String password);
    String Login(String userName , String password);
    int countDiary();

    Entry findDiaryById(String userName, String password);

    String logout(String userName);
    int Delete(String DiaryId);
    void islocked();
    boolean isLock();
    void isNotLock();
    void saved(Diary diary);
    String findDiaryById(String userName);
    Entry creatEntry(int id, String title, String body , String diaryId);

    Entry creatEntry(String number, String title, String s);
}
