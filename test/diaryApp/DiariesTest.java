package diaryApp;


import Ziggy.CustomerException;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class DiariesTest {
    Diaries diary = new Diaries();
    @BeforeEach
    public void startWith(){

        diary.addNewUser("GodPower","home");
    }

    @Test
    public void testDiariesForMultipleUser(){
        diary.addNewUser("Hope","joy");
        assertEquals(2,diary.getAllUsers());
    }

    @Test
    public void testDiariesToFindUserExist() throws CustomerException {
        diary.addNewUser("Hope","joy");
        boolean isUserExiting = diary.userExist("Godpower");

        assertTrue(isUserExiting);
    }

    @Test
    public void testDiariesToFindUserExistInLowerCasing() throws CustomerException {
        diary.addNewUser("Hope", "joy");
        boolean isUserExiting = diary.userExist("godpower");

        assertTrue(isUserExiting);
    }
    @Test
    public void testDiariesForNonExistingUser() throws CustomerException {
        assertThrows(CustomerException.class, () -> diary.userExist("godpowers"));
    }

    @Test
    public void testDiariesToDeleteUser() throws CustomerException {
        diary.deleteUser("godpower");
        int numberOfUser = diary.getAllUsers();

        assertEquals(0,numberOfUser);
    }

}
