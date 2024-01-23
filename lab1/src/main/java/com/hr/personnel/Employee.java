package com.hr.personnel;

import java.time.LocalDate;

public class Employee {
    private String name;
    private LocalDate hireDate;

    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    public String getEmployeeInfo() {
        return "name = " + getName() +", hireDate = " + getHireDate();
    }

    public String work() {
        return this.getName() + " worked";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
}