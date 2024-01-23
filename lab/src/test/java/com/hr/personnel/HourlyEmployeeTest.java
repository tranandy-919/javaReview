package com.hr.personnel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class HourlyEmployeeTest {
    private HourlyEmployee employee;

    @BeforeEach
    void setUp() {
        employee = new HourlyEmployee("Mai", LocalDate.of
                (2014, 9, 23), 10.0, 100);
    }

    @Test
    void getEmployeeInfo_shouldReturnValidInfo() {
        String ex = "100 hours a month at 10.0 an hour name = Mai hireDate = 2014-09-23";
        assertEquals(ex, employee.getEmployeeInfo());
    }

    @Test
    void computeMonthlyTaxToPay_shouldReturnValidInfo () {
        assertEquals(250.0, employee.computeMonthlyTaxToPay());
    }
}