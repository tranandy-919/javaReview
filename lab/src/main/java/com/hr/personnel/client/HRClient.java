package com.hr.personnel.client;

import com.hr.personnel.Employee;
import com.hr.personnel.SalariedEmployee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.*;

import java.time.LocalDate;

public class HRClient {
    public static void main(String[] args) {
        Employee emp1 = new HourlyEmployee
                ("Andy", LocalDate.of(2001, 1, 1),
                        45.0, 150);

        Employee emp2 = new HourlyEmployee
                ("Mai", LocalDate.of(2002, 2, 2),
                        55.0, 120);

        Employee emp3 = new SalariedEmployee
                ("Mac", LocalDate.of
                        (2003,  3, 3), 4000);

        Department department = new Department("Engineering", "Seattle");
        department.addEmployee(emp1);
        department.addEmployee(emp2);
        department.addEmployee(emp3);

        int count = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
        System.out.println(count);

        double deptSal = department.computeDepartmentMonthlyTotalCompensation();
        System.out.println(deptSal);
    }
}