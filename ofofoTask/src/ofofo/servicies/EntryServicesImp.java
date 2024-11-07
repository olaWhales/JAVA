package ofofo.servicies;

import ofofo.model.Diary;
import ofofo.model.Entry;

public class EntryServicesImp implements EntryServicies{
    DiaryServicies diaryServicies = new DiaryServicesImpl();
    private boolean islocked = false;

    @Override
    public void unLock() {
        if(diaryServicies.isLock())
        islocked = false;
    }
    @Override
    public boolean islocked() {
        return islocked;
    }
    @Override
    public void isLock() {
        if(!diaryServicies.isLock())
        islocked = true;
    }

    @Override
    public void register(int id, String title, String body, String userName) {


    }



}
