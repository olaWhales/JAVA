package ofofo.controller;

import ofofo.data.model.Diary;
import ofofo.servicies.DiaryServicesImpl;
import ofofo.servicies.DiaryServicies;

public class DiaryControllerImp implements DiaryController{
    DiaryServicies diaryServicies = new DiaryServicesImpl();

    @Override
    public String Register(String userName, String password) {
        diaryServicies.Register(userName, password);
        return "Register successful";
    }


    @Override
    public String Login(String userName , String password) {
        diaryServicies.Login(userName, password);
            return "Login successful";
    }


    @Override
    public String Logout(String UserName) {
        return "";
    }

}
