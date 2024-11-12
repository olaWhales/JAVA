import ofofo.data.model.Entry;
import ofofo.servicies.DiaryServicesImpl;
import ofofo.servicies.DiaryServicies;
import ofofo.servicies.EntryServicesImp;
import ofofo.servicies.EntryServicies;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryServiciesTest {
    DiaryServicies diaryServicies = new DiaryServicesImpl();
    EntryServicies entryRepository = new EntryServicesImp();
    List<Entry> entries = new ArrayList<>();

    @Test public void testThatDiaryIsLocked() {
        diaryServicies.islocked();
        assertTrue(diaryServicies.isLock());
    }
    @Test public void testThatDiaryIsNotLocked() {
        diaryServicies.isNotLock();
        assertFalse(diaryServicies.isLock());
    }
    @Test public void testThatDiaryCanRegisterUser(){
        diaryServicies.isNotLock();
        assertFalse(diaryServicies.isLock());
        diaryServicies.Register("olawale" , "1111");
        assertEquals(diaryServicies.countDiary() , 1);
    }
    @Test public void testThatDiaryRegistered_CanLoggedInUser(){
        diaryServicies.isNotLock();
        diaryServicies.Register("olawale" , "1111");
        assertEquals(diaryServicies.countDiary() , 1);
        String user = diaryServicies.Login("olawale" , "1111");
        assertEquals(user , "SUCCESSFUL LOGIN");
    }
    @Test public void testThatDiaryCanLogout_User_after_login(){
        diaryServicies.isNotLock();
        diaryServicies.Register("olawale" , "1100");
        diaryServicies.Login("olawale" , "1100");
        assertEquals(diaryServicies.countDiary() , 1);
        diaryServicies.Login("olawale"  , "1100");
        String logout = diaryServicies.logout("olawale");
        assertEquals(diaryServicies.countDiary() , 0);
        assertEquals(logout , "SUCCESSFUL LOGOUT" , "");
    }

    @Test public void testThatDiaryServiceCanDelete(){
        diaryServicies.isNotLock();
        diaryServicies.Register("olawale" , "2211");
        assertEquals(diaryServicies.countDiary() , 1);
        diaryServicies.Delete("olawale");
        assertEquals(diaryServicies.countDiary(), 0);
    }
    @Test public void testThatDiaryUserCanBeFindById(){
        diaryServicies.isNotLock();
        diaryServicies.Register("olawale" , "1010");
        diaryServicies.Login("olawale" , "1010");
        String user = diaryServicies.findDiaryById("olawale");
        assertEquals(diaryServicies.countDiary() , 1);
        assertEquals(user  , "olawale");
        System.out.println(user);
  }
    @Test public void testThatUserCanFindEntryByTitleAfterRegisterDiaryAndEntry(){
        diaryServicies.isNotLock();
        diaryServicies.Register("olawale" , "0810");
        diaryServicies.Login("Ajadi" , "0810");
        assertEquals(diaryServicies.countDiary() , 1);
     }
     @Test public void testThatUserCanCreateEntryAndFindFromDiaryServices() {
         diaryServicies.isNotLock();
         diaryServicies.Register("olawale", "1010");
         diaryServicies.Login("olawale", "1010");
         diaryServicies.creatEntry(1 , "life" ,"life is good" , "olawale");
         String user = diaryServicies.findDiaryById("olawale");
         assertEquals(diaryServicies.countDiary() , 1);
         assertEquals(user, "olawale");
     }

}



