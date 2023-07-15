package tdd;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;



public class MusicPlayerTest {

    @Test
            public  void  TurnPowerONTest (){
             MusicPlayer sony = new MusicPlayer();
             boolean checkPower = sony.getIsOn();
             assertFalse(checkPower);

                sony.setIsOn(true);

                boolean newCheckPower = sony.getIsOn();
                assertTrue(newCheckPower );




        }
                 @Test

                    public void TurnPowerOffTest () {
                    MusicPlayer sony = new MusicPlayer();

                    boolean checkPower = sony.getIsOff();
                    assertFalse(checkPower);

                    sony.setIsOff(true);

                    boolean newPower = sony.getIsOff();
                    assertTrue(newPower);
        }



        @Test

            public void PreviousMusicTest () {
            MusicPlayer sony = new MusicPlayer();

            boolean checkPrevious = sony.getIsPrevious();
            assertFalse(checkPrevious);

            sony.setIsPrevious(true);

            boolean newCheckPrevious = sony.getIsPrevious();
            assertTrue(newCheckPrevious);
        }
        @Test

            public void  increaseVolumeTest (){
            MusicPlayer sony = new MusicPlayer();
            sony.setIsOn(true);
            boolean checkPower = sony.getIsOn();
            assertTrue(checkPower);
            sony.setVolume(0);

            sony.increaseVolume();

            int currentVolume = sony.getVolume();
            assertEquals(1, currentVolume);

            sony.increaseVolume();

            int newIncreaseVolume = sony.getVolume();
            assertEquals(2, newIncreaseVolume);
        }

        @Test
             public void increaseVolumeLimitTest (){
            MusicPlayer sony = new MusicPlayer();

            sony.setIsOn(true);
            boolean checkPower = sony.getIsOn();
            assertTrue(checkPower);
            sony.setVolume(99);

            sony.increaseVolume();

            int checkVolume = sony.getVolume();
            assertEquals(100,checkVolume);

            sony.increaseVolume();
            int newCheckVolume = sony.getVolume();
            assertEquals(100,newCheckVolume);

        }





        @Test

            public void DecreaseVolumeTest() {
            MusicPlayer sony = new MusicPlayer();
            sony.setIsOn(true);
            boolean check = sony.getIsOn();
            assertTrue(check);
            sony.setVolume(5);

            sony.decreaseVolume();

            int currentVolume = sony.getVolume();
            assertEquals(4, currentVolume);

            sony.decreaseVolume();

            int newVolume = sony.getVolume();
            assertEquals(3, newVolume);


        }
        @Test
            public void DecreaseLessThanTest (){
            MusicPlayer sony = new MusicPlayer();
            sony.setVolume(1);

            sony.decreaseVolume();

            int checkVolume = sony.getVolume();
            assertEquals(0, checkVolume);

            sony.decreaseVolume();

            int newCheck = sony.getVolume();
             assertEquals(0, newCheck);
        }

        @Test
            public void MuteVolumeTest(){
            MusicPlayer sony = new MusicPlayer();
            sony.setVolume(99);

            sony.increaseVolume();

            int checkVolume = sony.getVolume();
            assertEquals(100,checkVolume);

            sony.muteVolume();

            int soundCheck = sony.getmute();
            assertEquals(0, soundCheck);


        }
}


