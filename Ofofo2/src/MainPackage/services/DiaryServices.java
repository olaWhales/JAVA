package MainPackage.services;

import MainPackage.data.repositories.DiaryRepository;
import MainPackage.data.repositories.DiaryRepositoryImp;

public interface DiaryServices {
    DiaryRepository diaryRepository = new DiaryRepositoryImp();

    void createUser(String olawale, String number);

    short numberOfUser();

    String login(String olawale, String number);

    Boolean isLock();
}