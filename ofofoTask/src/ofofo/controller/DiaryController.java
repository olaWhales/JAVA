package ofofo.controller;

import ofofo.data.model.Diary;

public interface DiaryController {
    String Register(String UserName, String Password);
    String Login(String username, String password);
    String Logout(String UserName);
}
