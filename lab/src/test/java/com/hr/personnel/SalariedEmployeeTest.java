package com.hr.personnel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class SalariedEmployeeTest {
    private Employee employee;

    @BeforeEach
    public void setUp() {
        employee = new SalariedEmployee(
                "Andy", LocalDate.of
                (2020, 8, 20), 1000);
    }

    @Test
    public void computeMonthlyComp_shouldReturnValidInfo () {
        double comp = employee.computeMonthlyCompensation();
        assertEquals(3500, comp);
    }

    @Test
    void getEmployeeInfo() {
        String ex = "1000.0 a month name = Andy hireDate = 2020-08-20";
        assertEquals(ex, employee.getEmployeeInfo());
    }

    @Test
    void computeMonthlyTaxToPay_shouldReturnValidInfo () {
        assertEquals(300.0, employee.computeMonthlyTaxToPay());
    }
}