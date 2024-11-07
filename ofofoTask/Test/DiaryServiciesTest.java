import ofofo.servicies.DiaryServicesImpl;
import ofofo.servicies.DiaryServicies;
import ofofo.servicies.EntryServicesImp;
import ofofo.servicies.EntryServicies;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class DiaryServiciesTest {
    DiaryServicies diaryServicies = new DiaryServicesImpl();
    EntryServicies entryServicies = new EntryServicesImp();

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
        diaryServicies.Register("olawale" , "1111");
        diaryServicies.Login("olawale" , "1111");
        assertEquals(diaryServicies.countDiary() , 1);
        diaryServicies.Login("olawale"  , "1111");
        String logout = diaryServicies.logout("olawale");
        assertEquals(diaryServicies.countDiary() , 0);
        assertEquals(logout , "SUCCESSFUL LOGOUT" , "");
    }
    @Test public void testThatEntryServiceIsLocked() {
        entryServicies.isLock();
        assertTrue(entryServicies.islocked());
    }
    @Test public void testThatEntryCanUnlock_AfterDiaryRegister(){
        diaryServicies.isNotLock();
        diaryServicies.Register("olawale" , "1111");
        diaryServicies.Login("olawale" , "1111");
        assertEquals(diaryServicies.countDiary() , 1);
        entryServicies.unLock();
        assertFalse(entryServicies.islocked());
    }
    @Test public void testThatUserCanRegisterEntry_AfterDiaryRegister(){
        diaryServicies.isNotLock();
        diaryServicies.Register("olawale" , "1111");
        diaryServicies.Login("olawale" , "1111");
        assertEquals(diaryServicies.countDiary() , 1);
        entryServicies.unLock();
        assertFalse(entryServicies.islocked());
        entryServicies.register(2 , "Title" , "I'm still living" , "olawale");
        assertEquals(diaryServicies.countDiary() , 1);
     }
//     @Test public void  testThatDiaryCanBy
}
