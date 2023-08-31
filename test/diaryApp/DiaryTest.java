package diaryApp;

import Ziggy.CustomerException;
import diaryApp.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    Diary diary;
    @BeforeEach
    public void startWith(){
        diary = new Diary("world war","good");
        diary.lockDiary();

    }

    @Test
        public void testingLock() {
            boolean check = diary.getIsLock();
            assertTrue(true, String.valueOf(check));

            diary.setIsLock(false);

            boolean newCheck = diary.getIsLock();
            assertFalse(false,String.valueOf(newCheck));
    }


    @Test
        public void testingToCreateAEntry() throws CustomerException {

        diary.setIsLock(false);
        diary.createEntry("ziggy","word");

        assertEquals(new Entry(1,"ziggy","word").getId(), diary.findEntry(1).getId());
    }
    @Test
        public void  testingToGettingMoreEntry() throws CustomerException {
        diary.setIsLock(false);
        diary.createEntry("word","bad");
        diary.createEntry("ziggy","word");

        assertEquals(new Entry(1,"word","bad").getId(), diary.findEntry(1).getId());
        assertEquals(new Entry(2,"ziggy","word").getId(), diary.findEntry(2).getId());

    }


    @Test
        public void testingForDeletingEntry() throws CustomerException {
        diary.setIsLock(false);
        diary.createEntry("word","bad");
        diary.createEntry("ziggy","word");

        assertEquals(new Entry(1,"word","bad").getId(), diary.findEntry(1).getId());
        assertEquals(new Entry(2,"ziggy","word").getId(), diary.findEntry(2).getId());

        diary.deleteEntry(1);
        int checkSize = diary.getSize();
        assertEquals(1,checkSize);
    }







}
