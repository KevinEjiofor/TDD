package diaryApp;

import Ziggy.CustomerException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    Diary diary;
    @BeforeEach
    public void startWith(){
        diary = new Diary("world war","good");
        diary.createEntry("word","bad");
        diary.lockDiary();

    }

    @Test
    public void testingIfDiaryIsLock(){
        boolean check = diary.getIsLock();
        assertTrue(check);

    }

    @Test
        public void testingUnlockWithPassword() throws CustomerException {

        diary.unLock("good");

        boolean newCheck = diary.getIsLock();
        assertFalse(newCheck);



    }
    @Test
        public void testingTOUnlockWithWrongPassword() throws CustomerException {
        assertThrows(CustomerException.class, () ->  diary.unLock("pppp"));

    }


    @Test
        public void testingToCreateAEntry() throws CustomerException {
        diary.createEntry("ziggy","word");

        assertEquals(new Entry(1,"ziggy","word").getId(), diary.findEntry(1).getId());
    }
    @Test
        public void  testingToGetMoreEntry() throws CustomerException {


        diary.createEntry("ziggy","word");

        assertEquals(new Entry(1,"word","bad").getId(), diary.findEntry(1).getId());
        assertEquals(new Entry(2,"ziggy","word").getId(), diary.findEntry(2).getId());

    }


    @Test
        public void testingForDeletingEntry() throws CustomerException {
        diary.unLock("good");
        diary.createEntry("ziggy","word");

        assertEquals(new Entry(1,"word","bad"), diary.findEntry(1));
        assertEquals(new Entry(2,"ziggy","word"),diary.findEntry(2));

        diary.deleteEntry(1);
        int checkSize = diary.getSize();
        assertEquals(1,checkSize);
    }


    @Test
    public void testToUpdateDiary() throws CustomerException {
        diary.unLock("good");


        diary.createEntry("ziggy","word");

        assertEquals(new Entry(1,"word","bad"), diary.findEntry(1));
        assertEquals(new Entry(2,"ziggy","word"), diary.findEntry(2));


        diary.updateEntry(2,"war","run");

        String check = diary.findEntry(2).getDiaryDetails();
        assertEquals("war run", check);

    }
    @Test
    public void testToFindId(){

    }




}
