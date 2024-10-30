import MainPackage.data.repositories.DiaryRepository;
import MainPackage.data.repositories.DiaryRepositoryImp;
import MainPackage.services.DiaryServices;
import MainPackage.services.DiaryServicesImp;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryServiceTest {
    DiaryServices diaryServices = new DiaryServicesImp();

    @Test
    public void testToCreateUserDiary() {
        diaryServices.createUser("Olawale", "1111");
        assertEquals(diaryServices.numberOfUser() , 1);
    }
    @Test
    public void testToCheckIfDiaryCreateUserMoreTHanOne() {
        diaryServices.createUser("Olawale", "1111");
        diaryServices.createUser("Olawale", "2222");
        diaryServices.createUser("Olawale", "3333");
        assertEquals(diaryServices.numberOfUser() , 3);
    }
    @Test
    public void testToValidateIfUserDetailsIsCorrectToLoginAfterRegistered() {
        diaryServices.createUser("Olawale", "1111");
        assertEquals(diaryServices.numberOfUser() , 1);
        String verify = diaryServices.login("Olawale", "1111");
        assertEquals(verify , "Login Successful");
    }
    @Test
    public void testToValidateIfUserTriedToLoginWithWrongDetails() {
        diaryServices.createUser("Olawale", "1111");
        assertEquals(diaryServices.numberOfUser() , 1);
        String verify = diaryServices.login("Olawale", "2222");
        assertEquals(verify , "Login Unsuccessful, please try again later.");
    }
    @Test
    public void testToCheckIfDiaryCanBeUnlockAfterInputTheRightPassword() {
        diaryServices.createUser("Olawale", "1111");
        assertEquals(diaryServices.numberOfUser() , 1);
        String verify = diaryServices.login("Olawale", "1111");
        assertEquals("Login Successful", verify);
//        Boolean access = diaryServices.isLock();
//        assertTrue(access  , "Diary is locked");
    }
//    @Test
//    public void testToCheckLocked() {
//        diaryServices.isLock();
//        assertTrue(diaryServices.isLock() , "Diary is locked");
//    }

}