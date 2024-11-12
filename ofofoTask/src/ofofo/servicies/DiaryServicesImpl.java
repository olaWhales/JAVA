package ofofo.servicies;

import ofofo.data.model.Diary;
import ofofo.data.model.Entry;

import java.util.ArrayList;
import java.util.List;

public class DiaryServicesImpl implements DiaryServicies{
    private Entry entryService ;
    private Diary diaryRepository ;
    private boolean islocked = false;

    public DiaryServicesImpl() {}
    List<Diary> diaryList = new ArrayList<>() ;
    List<Entry> entries = new ArrayList<>();


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
        return "ERROR LOGIN";
    }

    @Override
    public int Delete(String DiaryId) {
        for(Diary diary : diaryList) {
            if(diary.getUserName().equals(DiaryId)) {
                diaryList.remove(diary);
                return diaryList.size();
            }
        }
        return 0;
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
    public String findDiaryById(String diaryId) {
        return diaryId.toString();
    }

    @Override
    public Entry creatEntry(int id, String title, String boby, String diaryId) {
        entryService = new Entry();
        entryService.setId(1);
        entryService.setTitle("life");
        entryService.setBody("life is good");
        entryService.setDiaryId("Olawale");
        entries.add(entryService) ;
        return entryService ;
    }

    @Override
    public Entry findDiaryById(String userName, String password) {
        for(Diary diaryCheck : diaryList) {
            if(diaryCheck.getUserName().equals(userName) && diaryCheck.getPassword().equals(password)) {
                return entryService;
            }
        }
        return entryService ;
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

    @Override
    public Entry creatEntry(String number, String title, String s) {
        entryService = new Entry();
        entryService.setDiaryId("olawale");
        entryService.setTitle("life");
        entryService.setBody("I'm alive");
        entryService.setId(1);
        entries.add(entryService);
        return entryService;
    }


}
