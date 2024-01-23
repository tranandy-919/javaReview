package com.hr.personnel.client;

import com.hr.personnel.Employee;

import java.time.LocalDate;

public class HRClient {
    public static void main(String[] args) {
        Employee employee = new Employee("Andy"
                ,LocalDate.of(2020, 8, 20));
        String employeeInfo = employee.getEmployeeInfo();
        System.out.println(employeeInfo);
    }
}