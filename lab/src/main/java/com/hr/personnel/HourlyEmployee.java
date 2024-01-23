package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    int hoursWorkedPerMonth;
    double hourlyRate;

    public HourlyEmployee(String name, LocalDate hireDate,
                          double hourlyRate, int hoursWorkedPerMonth) {
        super(name, hireDate);
        setHoursWorkedPerMonth(hoursWorkedPerMonth);
        setHourlyRate(hourlyRate);
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

    @Override
    public double computeMonthlyCompensation() {
        return hourlyRate * hoursWorkedPerMonth;
    }

    @Override
    public String getEmployeeInfo() {
        return hoursWorkedPerMonth + " hours a month at " + hourlyRate + " an hour " + "name = " +
                getName() + " hireDate = " + getHireDate();
    }

    @Override
    public double computeMonthlyTaxToPay() {
        return computeMonthlyCompensation() * HOURLY_TAX_RATE;
    }
}