package ru.netology.service;

import org.junit.Test;


public class CashbackHackServiceTest {
    @Test
    public void shouldCalculateCashbackHackServiceTestMoreThenMax() {
        CashbackHackService service = new CashbackHackService();
        int remain = service.remain(1001);
        org.junit.Assert.assertEquals(999, remain);

    }

    @Test
    public void shouldCalculateCashbackHackServiceTestLessThenMax() {
        CashbackHackService service = new CashbackHackService();
        int remain = service.remain(0); 
        org.junit.Assert.assertEquals(1000, remain);


    }

    @Test
    public void shouldCalculateCashbackHackServiceTestNegative() {
        CashbackHackService service = new CashbackHackService();
        int remain = service.remain(-1);
        org.junit.Assert.assertEquals(1001, remain);
    }

    @Test
    public void shouldCalculateCashbackHackServiceTest1000() {
        CashbackHackService service = new CashbackHackService();
        int remain = service.remain(1000);
        org.junit.Assert.assertEquals(0, remain);

    }
}