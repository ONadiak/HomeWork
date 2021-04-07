package com.company;

public class SalariedEmployee extends Employee implements ISalary
{
    private int hoursForMonth, hourlyRate = 15, salary;
    private String socialSecurityNumber;

    public SalariedEmployee(int employeeID, String name, int hoursForMonth) {
        super(employeeID, name);
        this.hoursForMonth = hoursForMonth;
    }

    public SalariedEmployee(String name, int hoursForMonth) {
        super(name);
        this.hoursForMonth = hoursForMonth;
    }

    public SalariedEmployee(int employeeID, String name, int hoursForMonth, String socialSecurityNumber) {
        super(employeeID, name);
        this.hoursForMonth = hoursForMonth;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public SalariedEmployee(String name, int hoursForMonth, String socialSecurityNumber) {
        super(name);
        this.hoursForMonth = hoursForMonth;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public SalariedEmployee(int employeeID, String name){
        super(employeeID, name);


   }

    @Override
    public double calculatePay() {
        salary = hourlyRate * hoursForMonth;
        return salary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee " + super.getName() + " {" +
                "hoursForMonth=" + hoursForMonth +
                ", salary=" + calculatePay() +
                ", socialSecurityNumber='" + socialSecurityNumber  +
                '}';
    }
}
