package tdd;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AirConditionTest {
    @Test
    public void canAcBeOnTest() {
        AirCondition samsung = new AirCondition();
        boolean check = samsung.getIsOn();
        assertEquals(false, check);

        samsung.setIsOn(true);

        boolean newCheck = samsung.getIsOn();
        assertEquals(true, newCheck);

    }
    @Test
    public void canAcBeOffTest() {
        AirCondition samsung = new AirCondition();
        samsung.setIsOn(true);
        boolean check = samsung.getIsOn();
        assertEquals(true, check);
        samsung.setIsOn(false);
        boolean newCheck = samsung.getIsOn();
        assertEquals(false, newCheck);

    }

    @Test
    public void increaseTemperature(){
        AirCondition samsung = new AirCondition();
        samsung.setIsOn(true);
        boolean check = samsung.getIsOn();

        assertEquals(true, check);
        samsung.setTemperature(16);

        int checkTemperature = samsung.getTemperature();
        assertEquals(16, checkTemperature);

        samsung.increaseTemperature ();

        int currentTemperature = samsung.getTemperature();
        assertEquals( 17, currentTemperature);



    }
    @Test
    public void DecreaseTemperature (){
        AirCondition samsung = new AirCondition();
         samsung.setIsOn(true);
         boolean checkPower = samsung.getIsOn();
         assertTrue(checkPower);

         samsung.setTemperature(20);

         samsung.decreaseTemperature();

         int checkTemperature = samsung.getTemperature();
         assertEquals(19, checkTemperature);

    }
     @Test
    public void IncreaseLimit (){
        AirCondition samsung = new AirCondition();

        samsung.setIsOn(true);
        boolean checkPower = samsung.getIsOn();
        assertTrue(checkPower);

        samsung.setTemperature(29);
        samsung.increaseTemperature();

        int checkTemperature = samsung.getTemperature();
        assertEquals(30,checkTemperature);

        samsung.increaseTemperature();

        int newCheckTemperature = samsung.getTemperature();
        assertEquals(30, newCheckTemperature);




     }
        @Test
            public void DecreaseTemperatureLimit(){
            AirCondition samsung = new AirCondition();

            samsung.setIsOn(true);
            boolean checkPower = samsung.getIsOn();
            assertTrue(checkPower);
            samsung.setTemperature(17);

            samsung.decreaseTemperature();

            int checkTemperature = samsung.getTemperature();
            assertEquals(16, checkTemperature);

            samsung.decreaseTemperature();

            int newCheckTemperature = samsung.getTemperature();
            assertEquals(16,newCheckTemperature);

     }
}


