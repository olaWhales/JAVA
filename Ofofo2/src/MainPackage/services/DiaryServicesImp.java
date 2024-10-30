package MainPackage.services;

import MainPackage.data.model.Diary;
import MainPackage.data.repositories.DiaryRepository;
import MainPackage.data.repositories.DiaryRepositoryImp;

import java.util.ArrayList;
import java.util.List;

public class DiaryServicesImp implements DiaryServices{
    DiaryRepository diaryRepository = new DiaryRepositoryImp();
    List<Diary> diaryList = new ArrayList<>();
    boolean isLocked = false ;

    @Override
    public void createUser(String olawale, String number) {
        Diary diary = new Diary();
        diary.setUserName("olawale");
        diary.setPassword("1111");
        diaryRepository.save(diary);
        diaryList.add(diary);
    }

    @Override
    public short numberOfUser() {
        return (short) diaryList.size();
    }

    @Override
    public String login(String name, String password) {
        for(Diary diary : diaryList) {
            if(diary.getUserName().equals(name) && diary.getPassword().equals(password)) {
                return "Login Successful" ;
            }
        }
        return "Login Unsuccessful, please try again later." ;
    }

    @Override
    public Boolean isLock() {
        isLocked = true ;
        return isLocked ;
    }
    public void isNotLocked() {
        isLocked = false ;
    }
    public boolean isLocked() {
         return isLocked ;
    }

}
