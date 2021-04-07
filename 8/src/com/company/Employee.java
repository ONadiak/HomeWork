package com.company;

public  class Employee implements ISalary {
    private int employeeID;
    private String name;

    public Employee(int employeeID, String name) {
        this.employeeID = employeeID;
        this.name = name;
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Employee() {
    }

    @Override
    public double calculatePay() {
        return 0;
    }
}
