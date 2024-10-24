import Diary.Diary;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    @Test
    public void test_to_check_diary_is_lock() {
        Diary diary = new Diary();
        diary.isLock();
        assertTrue(diary.islock());
    }
    @Test
    public void test_to_check_diary_is_Unlocked() {
        Diary diary = new Diary();
        diary.isUnlocked();
        assertFalse(diary.islock());
    }
    @Test
    public void test_to_check_diary_can_be_locked_after_unlock() {
        Diary diary = new Diary();
        diary.isLock();
        assertTrue(diary.islock());
        diary.isUnlocked();
        assertFalse(diary.islock());
    }
    @Test
    public void test_to_check_diary_can_be_add_after_unlock() {
        Diary diary = new Diary();
        diary.isUnlocked();
        assertFalse(diary.islock());
        diary.addEntry("1" ,"leek");
        diary.addEntry("2" , "bleed");
        assertEquals(diary.getSize (), 2);
        System.out.println(diary.getSize());
    }
    @Test
    public void test_to_check_diary_can_be_add_after_lock() {
        Diary diary = new Diary();
        diary.isUnlocked();
        assertFalse(diary.islock());
        diary.isLock();
        assertTrue(diary.islock());
        diary.addEntry("1" , "leek");
        diary.addEntry("2" , "bleed");
        assertNotEquals(diary.getSize (), "3");
    }
    @Test
    public void test_to_check_diary_can_delete_after_add() {
        Diary diary = new Diary();
        diary.isUnlocked();
        assertFalse(diary.islock());
        diary.addEntry("1" , "house");
        diary.addEntry("1" , "come");
        diary.addEntry("111" , "house");
        diary.deleteEntry();
        assertEquals(diary.getSize (), 2);
        System.out.println(diary.getSize());
    }
    @Test
    public void test_to_check_if_diary_can_have_a_password_after_unlock() {
        Diary diary = new Diary();
        assertFalse(diary.islock());
        diary.password("password");
        assertTrue(diary.islock());
    }
    @Test
    public void test_to_check_if_diary_can_unlock_with_wrong_password() {
        Diary diary = new Diary();
        assertFalse(diary.islock());
        diary.password("pass");
        assertFalse(diary.islock());
    }
//    @Test
//    public void test_to_see_if_diary_can_update(){
//        Diary diary = new Diary();
//        diary.FindEntry = new FindEntry();
//        entry.theSize(2);
//        assertTrue(diary.size(), 2);
//    }
}
