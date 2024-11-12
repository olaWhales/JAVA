package ofofo.controller;

import ofofo.data.model.Diary;
import ofofo.servicies.DiaryServicesImpl;
import ofofo.servicies.DiaryServicies;

public class DiaryControllerImp implements DiaryController{
    DiaryServicies diaryServicies = new DiaryServicesImpl();

    @Override
    public String Register(String UserName, String Password) {
        Diary diary = diaryServicies.Register(UserName, Password);
        diary.setUserName("Olawale");
        diary.setPassword("1111");
        diaryServicies.saved(diary);
        return "Register successful";
    }


    @Override
    public String Login(String UserName , String Password) {
        if(diaryServicies.Register("Olawale" , "1111").equals(diaryServicies.Login("Olawale" , "1111"))){
            return "Login successful";
        }
        return "Login failed";
    }


    @Override
    public String Logout(String UserName) {
        return "";
    }

}
