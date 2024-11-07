package ofofo.servicies;

import ofofo.model.Diary;
import ofofo.model.Entry;

import java.util.ArrayList;
import java.util.List;

import static java.util.Locale.filter;

public class DiaryServicesImpl implements DiaryServicies{
    private Entry entryService ;
    private Diary diaryRepository ;
    private boolean islocked = false;

    public DiaryServicesImpl() {
        this.diaryRepository = diaryRepository ;
        this.entryService = entryService ;
    }
    List<Diary> diaryList = new ArrayList<Diary>() ;


    @Override
    public Diary Register(String userName, String password) {
        Diary diary = new Diary();
        diary.setUserName(userName);
        diary.setPassword(password);
        diaryList.add(diary) ;
        return diary;
    }

    @Override
    public String Login(String userName, String password) {
        for(int index = 0 ; index < diaryList.size() ; index++) {
            if(diaryList.get(index).getUserName().equals(userName)){
                if(diaryList.get(index).getPassword().equals(password)){
                    islocked = true;
                    return "SUCCESSFUL LOGIN";
                }
            }
        }

//        for(Diary diary : diaryList) {
//            if(diary.getUserName().equals(userName) && diary.getPassword().equals(password)){
//                    return "SUCCESSFUL LOGIN";
//            }
//        }
        return "ERROR LOGIN";
    }

    @Override
    public String Logout(String userName) {
        return "";
    }

    @Override
    public Diary findDiaryById(Diary diaryId) {
        for(Diary diary : diaryList) {
            if(diary.getUserName().equals(diaryId.getUserName())) {}
        }
        return null;
    }

    @Override
    public Diary Delete(Diary DiaryId) {
        return null;
    }

    @Override
    public int countDiary() {
        return diaryList.size() ;
    }
    @Override
    public void islocked() {this.islocked = true;
    }
    @Override
    public void isNotLock() {this.islocked = false ;
    }
    @Override
    public boolean isLock() {
        return islocked;
    }



    @Override
    public void saved(Diary diary) {
        diaryList.add(diary) ;
    }

    @Override
    public String logout(String userName){
        for(Diary diaryCheck : diaryList) {
            if(diaryCheck.getUserName().equals(userName)) {
            diaryList.remove(diaryCheck)  ;
            return "SUCCESSFUL LOGOUT";
            }
        }
        return "ERROR LOGOUT";
    }

}
