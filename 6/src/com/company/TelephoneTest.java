package com.company;

import static org.junit.jupiter.api.Assertions.*;

  class TelephoneTest {

      Telephone tl1 = new Telephone("lenovo", " K40", 2020);
    @org.junit.jupiter.api.Test
    void getAgeOfTelephone() {
        assertEquals(1, tl1.getAgeOfTelephone());
    }

    @org.junit.jupiter.api.Test
    void isScreenShinesAf() {
        assertTrue(tl1.isScreenShinesAfterClickingOnButton());
    }

    @org.junit.jupiter.api.Test
    void isScreenShinesAfterTouching() {
        assertFalse(tl1.isScreenShinesAfterTouching());
    }
}