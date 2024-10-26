package MainPackage.services;

import MainPackage.models.Diary;
import MainPackage.repositories.DiaryRepository;

public interface DiaryServices {
    String register();

    Diary numberOfUser();

    void deletes();

    void registraValidation(DiaryServices registra);

    void registraValidation(DiaryServices name, DiaryServices password);

    Object save(DiaryRepository diaryRepository);
}
