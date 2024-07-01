package com.pluralsight;

public class Employee {
    private int employeeId;
    private String employeeName;
    private String department;
    private double payRate;
    private int hoursWorked;

    public Employee(int employeeId, String employeeName, String department, double payRate, int hoursWorked) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getRegularHours() {
        return Math.min(hoursWorked, 40);
    }

    public int getOvertimeHours() {
        return Math.max(0, hoursWorked - 40);
    }

    public double calculatePay() {
        int regularHours = getRegularHours();
        int overtimeHours = getOvertimeHours();
        return (regularHours * payRate) + (overtimeHours * payRate * 1.5);
    }
}