package tdd;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {

    @Test
    public void TurnOnTelevisionTest() {
        Television samsung = new Television();

        boolean checkPower = samsung.getOn();
        assertFalse(checkPower);

        samsung.setOn(true);
        boolean newCheckPower = samsung.getOn();
        assertTrue(newCheckPower);
    }

    @Test
    public void TurnOffTelevision() {
        Television samsung = new Television();
        samsung.setOn(true);
        boolean checkPower = samsung.getOn();
        assertTrue(checkPower);

        samsung.setOff(true);

        boolean newCheckPower = samsung.getOff();
        assertTrue(newCheckPower);
    }

    @Test
    public void increaseVolumeTest() {
        Television samsung = new Television();
        samsung.setOn(true);
        boolean checkPower = samsung.getOn();
        assertTrue(checkPower);

        samsung.setVolume(0);
        samsung.increaseVolume();

        int checkSound = samsung.getVolume();
        assertEquals(1, checkSound);
    }

    @Test
    public void decreaseVolumeTest() {
        Television samsung = new Television();
        samsung.setOn(true);
        boolean checkPower = samsung.getOn();
        assertTrue(checkPower);

        samsung.setVolume(7);

        samsung.decreaseVolume();

        int checkSound = samsung.getVolume();
        assertEquals(6, checkSound);
    }

    @Test
    public void VolumeLimitTest() {
        Television samsung = new Television();
        samsung.setOn(true);
        boolean checkPower = samsung.getOn();
        assertTrue(checkPower);

        samsung.setVolume(99);

        samsung.increaseVolume();

        int checkSound = samsung.getVolume();
        assertEquals(100, checkSound);

        samsung.increaseVolume();

        int newCheckSound = samsung.getVolume();
        assertEquals(100, newCheckSound);

    }

    @Test
    public void DecreaseLimitTest() {
        Television samsung = new Television();
        samsung.setOn(true);
        boolean checkPower = samsung.getOn();
        assertTrue(checkPower);

        samsung.setVolume(1);

        samsung.decreaseVolume();

        int checkSound = samsung.getVolume();
        assertEquals(0, checkSound);

        samsung.decreaseVolume();

        int newCheckSound = samsung.getVolume();
        assertEquals(0, newCheckSound);

    }
    @Test
        public void MuteVolumeTest (){
        Television samsung = new Television();
        samsung.setOn(true);
        boolean checkPower = samsung.getOn();
        assertTrue(checkPower);

        samsung.setVolume(0);

        samsung.decreaseVolume();
        int checkVolume = samsung.getVolume();
        assertEquals(0, checkVolume);
    }

    @Test
            public void  ChangeChannelTest () {
                Television samsung = new Television();
                samsung.setOn(true);

                samsung.isOn();
                boolean checkPower = samsung.getOn();
                assertTrue(checkPower);

                samsung.setChannel(1);

                samsung.channelUp();

                int newChannel = samsung.getChannel();
                assertEquals(2, newChannel);
    }
    @Test
            public void ChangeChannelBackwardTest (){
            Television samsung = new Television ();

            samsung.setOn(true);
            boolean checkPower = samsung.getOn();
            assertTrue(checkPower);

            samsung.setChannel(2);

            samsung.channelDown();
            int newChannel = samsung.getChannel();
            assertEquals(1, newChannel);
    }

}




