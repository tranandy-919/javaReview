package com.hr.corp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CorporationTest {
    private Corporation corporation;

    @BeforeEach
    void setUp() {
        corporation = new Corporation("Evil.Inc", 1000.0);
    }

    @Test
    void computeMonthlyTaxToPay_shouldBe10PercentOfIncome () {
        assertEquals(100, corporation.computeMonthlyTaxToPay());
    }
}