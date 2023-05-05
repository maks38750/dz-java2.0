package ru.netology;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void testRemainBoundaryValuesOne() {
        org.testng.Assert.assertThrows(RuntimeException.class, () -> {
            service.remain(-1);
        });
    }


    @org.testng.annotations.Test
    public void shouldCorrectAmount() {
        assertEquals(service.remain(2800), 200);

    }

    @org.testng.annotations.Test
    public void shouldAmountZero() {
        assertEquals(service.remain(0), 1000);
    }

    @org.testng.annotations.Test
    public void shouldBuyExtraIfTheAmount1000() {
        assertEquals(service.remain(1000), 0);
    }

}