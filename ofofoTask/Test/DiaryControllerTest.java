import ofofo.controller.DiaryController;
import ofofo.controller.DiaryControllerImp;
import ofofo.servicies.DiaryServicesImpl;
import ofofo.servicies.DiaryServicies;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiaryControllerTest {
    DiaryController diaryController = new DiaryControllerImp();

    @Test
    public void testToRegisterUser() {
        DiaryServicies diaryServicies = new DiaryServicesImpl();
        diaryServicies.Register("Olawale" , "1111");
        assertEquals(diaryController.Register("Olawale" , "1111"), "Register successful");
    }
    @Test
    public void testToLogin() {
        DiaryServicies diaryServicies = new DiaryServicesImpl();
        diaryServicies.Register("Olawale" , "1111");
        assertEquals(diaryController.Login("Olawale" , "1111"), "Login successful");
    }

}