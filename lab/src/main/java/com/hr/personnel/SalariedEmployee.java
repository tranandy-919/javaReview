package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    int hoursWorkedPerMonth;
    double hourlyRate;

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public int getHoursWorkedPerMonth() {
        return hoursWorkedPerMonth;
    }

    public void setHoursWorkedPerMonth(int hoursWorkedPerMonth) {
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}