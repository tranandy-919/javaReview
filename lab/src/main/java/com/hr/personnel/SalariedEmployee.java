package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    double monthlySalary;

    public SalariedEmployee(String name, LocalDate hireDate, double monthlySalary) {
        super(name, hireDate);
        setMonthlySalary(getMonthlySalary());
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}