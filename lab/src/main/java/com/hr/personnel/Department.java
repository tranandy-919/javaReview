package com.hr.personnel;

public class Department {
    private String name;
    private String location;
    private Employee[] employees = new Employee[100];
    private int currentIndex = 0;

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    // Compute total monthly compensation of all
    // employees in that department
    public double computeDepartmentMonthlyTotalCompensation() {
        double sum = 0.0;
        int count = 0;
        while(count < currentIndex) {
            Employee emp = employees[count];
            double val = emp.computeMonthlyCompensation();
            sum += val;
            count++;
        }
        return sum;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public void addEmployee(Employee employee) {
        employees[currentIndex] = employee;
        currentIndex++;
    }

    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
        int count = 0;
        while(count < currentIndex) {
            count++;
        }
        return count;
    }
}