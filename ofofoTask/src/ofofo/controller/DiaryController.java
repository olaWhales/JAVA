package ofofo.controller;

import ofofo.data.model.Diary;

public interface DiaryController {
    String Register(String userName, String password);
    String Login(String username, String password);
    String Logout(String UserName);
}
