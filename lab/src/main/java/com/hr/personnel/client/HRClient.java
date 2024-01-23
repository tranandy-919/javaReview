package com.hr.personnel.client;

import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;

import java.time.LocalDate;

public class HRClient {
    public static void main(String[] args) {
        Employee emp1 = new SalariedEmployee
                ("Andy", LocalDate.of(2001, 1, 1));
        Employee emp2 = new SalariedEmployee
                ("Mai", LocalDate.of(2002, 2, 2));
        Employee emp3 = new HourlyEmployee
                ("Mac", LocalDate.of(2003,  3, 3));
    }
}