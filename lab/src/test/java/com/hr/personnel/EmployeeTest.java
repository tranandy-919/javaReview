package com.hr.personnel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class EmployeeTest {
    private Employee employee;
    @BeforeEach
    public void setUp() throws Exception {
         employee = new HourlyEmployee(
                "Andy", LocalDate.of
                (2020, 8, 20), 30.0, 100);
    }

    @Test
    public void getEmployeeInfo_should_return_valid_info_given_valid_employee() {

        // call test target method
        String employeeInfo = employee.getEmployeeInfo();

        // verify if th result is what is expected
        assertEquals("name = Andy, hireDate = 2020-08-20",
                employeeInfo);
    }

    @Test
    void work() {

        // call test target method
        String work = employee.work();

        // verify result is what's expected
        assertEquals("Andy worked", employee.work());
    }
}