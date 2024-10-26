package MainPackage.services;

import MainPackage.models.Diary;
import MainPackage.repositories.DiaryRepository;
import MainPackage.repositories.DiaryRepositorylmp;

public class DiaryServiceslmp implements DiaryServices {
DiaryRepository diaryRepository = new DiaryRepositorylmp();

    public String register(String name, String password) {
        registraValidation((DiaryServices) diaryRepository);
        Diary diary = new Diary("");
        diary.setUserName("olawale");
        diary.setPassword("password");
        diaryRepository.save(diary);
        return "Created successfully";
    }

    @Override
    public String register() {
        return "";
    }

    @Override
    public Diary numberOfUser() {
//        return diaryRepository.count(new Diary());
        return diaryRepository.save(new Diary());
    }

    @Override
    public void deletes() {
        diaryRepository.delete(new Diary());
    }

    @Override
    public void registraValidation(DiaryServices registra) {

    }

    @Override
    public void registraValidation(DiaryServices name, DiaryServices password) {
        Diary diary = new Diary();
        if(diaryRepository.equals(register(diary.getUserName(), diary.getPassword()))) {
            diaryRepository.delete(new Diary());
        }
    }

    @Override
    public Object save(DiaryRepository diaryRepository) {
        return diaryRepository;
    }


}
