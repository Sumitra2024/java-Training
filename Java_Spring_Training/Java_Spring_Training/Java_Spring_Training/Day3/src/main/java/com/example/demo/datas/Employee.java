package com.example.demo.datas;

public class Employee {

    private String employeeId;

    private String employeeName;

    private String employeePhone;
    public Employee(){}

    public Employee(String employeeId, String employeeName, String employeePhone) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeePhone = employeePhone;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }
}