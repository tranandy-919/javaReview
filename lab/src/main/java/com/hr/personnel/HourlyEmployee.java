package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    double monthlySalary;

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}