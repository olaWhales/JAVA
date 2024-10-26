package MainPackage.services;

import MainPackage.models.Diary;
import MainPackage.repositories.DiaryRepository;
import MainPackage.repositories.DiaryRepositorylmp;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiaryServicesTest {
    private final DiaryServices diaryServices = new DiaryServiceslmp();

    @Test
    public void test_to_registerNewUSER() {
        DiaryRepository diaryRepository = new DiaryRepositorylmp();
        Diary diary = new Diary();
        diaryServices.register();
        diary.setUserName("ola");
        diary.setPassword("1111");
        diaryRepository.save(diary);
        assertEquals(diaryRepository , 1);
    }



//    @Test
//    public void test_to_check_if_diary_can_delete_a_users() {
//        diaryServices.register("olawale" , "2222");
//        assertEquals(diaryServices.numberOfUser() , 1);
//        diaryServices.deletes();
//        assertEquals(diaryServices.numberOfUser() , 0);
//    }
//    @Test
//    public void test_to_check_if_same_user_can_register_twice(){
//        diaryServices.register("olawale" , "2222");
//        diaryServices.register("olawale" , "2222");
//        diaryServices.registraValidation(diaryServices);
//        assertEquals(diaryServices.numberOfUser() , 1);
//
//    }


}
