package ofofo.servicies;

import ofofo.model.Diary;

public interface DiaryServicies {
    Diary Register(String userName , String password);
    String Login(String userName , String password);
    String Logout(String userName);
    Diary findDiaryById(Diary diaryId);
    Diary Delete(Diary DiaryId);
    int countDiary();

    void islocked();
    boolean isLock();
    void isNotLock();
    void saved(Diary diary);
    String logout(String userName);
}
