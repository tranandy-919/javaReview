package com.hr.personnel.client;

import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import com.hr.personnel.*;

import java.time.LocalDate;

public class HRClient {
    public static void main(String[] args) {
        Employee emp1 = new SalariedEmployee
                ("Andy", LocalDate.of(2001, 1, 1));
        Employee emp2 = new SalariedEmployee
                ("Mai", LocalDate.of(2002, 2, 2));
        Employee emp3 = new HourlyEmployee
                ("Mac", LocalDate.of(2003,  3, 3));

        Department department = new Department("Engineering", "Seattle");
        department.addEmployee(emp1);
        department.addEmployee(emp2);
        department.addEmployee(emp3);

        int count = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
        System.out.println(count);
    }
}