package com.hr.personnel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {
    private Employee employee;
    private Department department;

    @BeforeEach
    void setUp() {
        employee = new HourlyEmployee
                ("Andy", LocalDate.of(2020, 8, 20),
                        30.0, 160);
        department = new Department("Software", "Seattle");
        department.addEmployee(employee);
    }

    @Test
    void addEmployee() {
        assertTrue(department.getCurrentIndex() > 0);
    }

    @Test
    void letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
        int count = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
        assertEquals(1, count);
    }

    @Test
    void computeDepartmentMonthlyTotalCompensation_shouldReturnValidInfo () {
        assertEquals(4800, department.computeDepartmentMonthlyTotalCompensation());
    }
}