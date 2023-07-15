package tdd;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class  BikeTest {
    @Test
    public void BikeTurnedOnTest() {
        Bike bmw = new Bike();

        bmw.setIsOn(false);
        boolean checkBike = bmw.getIsOn();
        assertFalse(checkBike);

        bmw.setIsOn(true);

        boolean newCheckBike = bmw.getIsOn();

        assertTrue(newCheckBike);


    }

    @Test
    public void TurnBikeOfTest() {
        Bike bmw = new Bike();
        bmw.setIsOn(true);
        boolean power = bmw.getIsOn();
        assertTrue(power);

        bmw.setIsOff(false);
        boolean newPower = bmw.getIsOff();
        assertFalse(newPower);

        bmw.setIsOff(true);
        boolean newCheck = bmw.getIsOff();
        assertTrue(newCheck);

    }

    @Test
    public void checkBikeSpeedAndGearTest() {
        Bike bmw = new Bike();
        bmw.setIsOn(true);
        boolean power = bmw.getIsOn();
        assertTrue(power);

        int checkSpeed = bmw.getSpeed();
        assertEquals(0, checkSpeed);

        int checkGear = bmw.getGear();
        assertEquals(0, checkGear);
    }

    @Test
    public void accelerationCheckTest() {
        Bike bmw = new Bike();
        bmw.setIsOn(true);
        boolean power = bmw.getIsOn();
        assertTrue(power);
        int checkSpeed = bmw.getSpeed();
        assertEquals(0, checkSpeed);
        int checkGear = bmw.getGear();
        assertEquals(0, checkGear);

        bmw.setAcceleration(23);

        bmw.increaseAcceleration();

        checkSpeed = bmw.getSpeed();
        assertEquals(25, checkSpeed);
        checkGear = bmw.getGear();
        assertEquals(2, checkGear);

        bmw.increaseAcceleration();

        int speed = bmw.getSpeed();
        assertEquals(27, speed);
        int gear = bmw.getGear();
        assertEquals(2, gear);


    }


        @Test
        public void checkSpeedTest() {
            Bike bmw = new Bike();
            bmw.setIsOn(true);
            boolean power = bmw.getIsOn();
            assertTrue(power);
            int checkSpeed = bmw.getSpeed();
            assertEquals(0, checkSpeed);
            int checkGear = bmw.getGear();
            assertEquals(0, checkGear);

            bmw.setAcceleration(0);

            bmw.increaseAcceleration();

            checkSpeed = bmw.getSpeed();
            assertEquals(1, checkSpeed);


        }

        @Test
        public void checkGearTest () {
            Bike bmw = new Bike();
            bmw.setIsOn(true);
            boolean power = bmw.getIsOn();
            assertTrue(power);
            int checkSpeed = bmw.getSpeed();
            assertEquals(0, checkSpeed);
            int checkGear = bmw.getGear();
            assertEquals(0, checkGear);

            bmw.setAcceleration(15);

            bmw.increaseAcceleration();

            checkSpeed = bmw.getSpeed();
            assertEquals(16,checkSpeed);
            checkGear = bmw.getGear();
            assertEquals(1,checkGear);

            bmw.setAcceleration(22);

            bmw.increaseAcceleration();

            checkSpeed = bmw.getSpeed();
            assertEquals(24, checkSpeed);
            checkGear = bmw.getGear();
            assertEquals(2, checkGear);

            bmw.setAcceleration(35);

            bmw.increaseAcceleration();

            checkSpeed = bmw.getSpeed();
            assertEquals(38, checkSpeed);
            checkGear = bmw.getGear();
            assertEquals(3, checkGear);

            bmw.setAcceleration(45);

            bmw.increaseAcceleration();

            checkSpeed = bmw.getSpeed();
            assertEquals(49, checkSpeed);
            checkGear = bmw.getGear();
            assertEquals(4, checkGear);



        }

    @Test
    public void decreaseAccelerationTest () {
        Bike bmw = new Bike();
        bmw.setIsOn(true);
        boolean power = bmw.getIsOn();
        assertTrue(power);

        bmw.setAcceleration(16);
        bmw.increaseAcceleration();

        int checkSpeed = bmw.getSpeed();
        assertEquals(17, checkSpeed);
        int checkGear = bmw.getGear();
        assertEquals(1, checkGear);

        bmw.decreaseAcceleration();

        checkSpeed = bmw.getSpeed();
        assertEquals(16,checkSpeed);
        checkGear = bmw.getGear();
        assertEquals(1, checkGear);


    }
    @Test
        public void testCheckingGearSpeed () {
        Bike bmw = new Bike();
        bmw.setIsOn(true);
        boolean power = bmw.getIsOn();
        assertTrue(power);

        bmw.setAcceleration(16);
        bmw.decreaseAcceleration();

        int checkSpeed = bmw.getSpeed();
        assertEquals(15, checkSpeed);
        int checkGear = bmw.getGear();
        assertEquals(1,checkGear);


        bmw.setAcceleration(30);
        bmw.decreaseAcceleration();

        int checkingSpeed2 = bmw.getSpeed();
        assertEquals(28, checkingSpeed2);
        int checkingGear = bmw.getGear();
        assertEquals(2,checkingGear);



        bmw.setAcceleration(40);
        bmw.decreaseAcceleration();

        int checkSpeed3 = bmw.getSpeed();
        assertEquals(37, checkSpeed3);
        int checkGear3 = bmw.getGear();
        assertEquals(3,checkGear3);



        bmw.setAcceleration(55);
        bmw.decreaseAcceleration();

        int checkSpeed4 = bmw.getSpeed();
        assertEquals(49, checkSpeed3);
        int checkGear4 = bmw.getGear();
        assertEquals(4, checkGear4);





    }


}
