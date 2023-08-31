package Ziggy;

import org.junit.jupiter.api.Test;
import tdd.Exchange;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExchangeTest {

    @Test
    public void convertingToDollarTest(){
        Exchange ziggy = new Exchange();
        ziggy.setRate(6.81);

        ziggy.setAmount(100);


        ziggy.convert(1);


        double amount = ziggy.getAmount();
        assertEquals(681.0, amount);

        ziggy.setAmount(10000);

        ziggy.convert(0);

        double newAmount = ziggy.getAmount();
        assertEquals(1468.4287812041116, newAmount);
        }


    }











