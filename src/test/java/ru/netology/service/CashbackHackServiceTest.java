package ru.netology.service;


@org.testng.annotations.Test
public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    void shouldCalculateCashbackHackServiceTestMoreThenMax() {
        CashbackHackService service = new CashbackHackService();
        int remain = service.remain(1001);
        org.testng.Assert.assertEquals(remain, 999);

    }

    @org.testng.annotations.Test
    void shouldCalculateCashbackHackServiceTestLessThenMax() {
        CashbackHackService service = new CashbackHackService();
        int remain = service.remain(0);
        org.testng.Assert.assertEquals(remain, 1000);


    }

    @org.testng.annotations.Test
    void shouldCalculateCashbackHackServiceTestNegative() {
        CashbackHackService service = new CashbackHackService();
        int remain = service.remain(-1);
        org.testng.Assert.assertEquals(remain, 1001);

    }
<<<<<<< HEAD
=======

    @org.testng.annotations.Test
    void shouldCalculateCashbackHackServiceTest1000() {
        CashbackHackService service = new CashbackHackService();
        int remain = service.remain(1000);
        org.testng.Assert.assertEquals(remain, 0);

    }

>>>>>>> a3ad1c8 ("testng 1000")
}