package ru.netology.CI;

//import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashBackHackServiceTest {


    @Test
    void remainIfAmountLess0() throws IllegalArgumentException {
        CashBackHackService cash = new CashBackHackService();
        assertThrows(IllegalArgumentException.class, ()->cash.remain(-50));
    }

    @Test
    void remainIfAmountMore0BackExtraSum(){
        CashBackHackService cash = new CashBackHackService();
        int actual = cash.remain(700);
        int expected = 300;
        assertEquals(expected,actual);
    }

    @Test
    void remainIfAmountMore0DoNotBackExtraSum(){
        CashBackHackService cash = new CashBackHackService();
        int actual = cash.remain(1000);
        int expected = 0;
        assertEquals(expected,actual);
    }
}