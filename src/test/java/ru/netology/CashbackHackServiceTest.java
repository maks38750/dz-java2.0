package ru.netology;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();


    @org.junit.Test
    public void shouldCorrectAmount() {
        assertEquals(service.remain(2800), 200);

    }

    @org.junit.Test
    public void shouldAmountZero() {
        assertEquals(service.remain(0), 1000);
    }

    @org.junit.Test
    public void shouldBuyExtraIfTheAmount1000() {
        assertEquals(service.remain(1000), 0);
    }

}