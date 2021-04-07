package com.company;

public class ContractEmployee extends Employee implements ISalary
{
    private String federalTaxIdMember;
    private int SalaryPerMonth = 10000;

    public ContractEmployee(int employeeID, String name, String federalTaxIdMember) {
        super(employeeID, name);
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public ContractEmployee(String name, String federalTaxIdMember) {
        super(name);
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public ContractEmployee(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    @Override
    public double calculatePay() {
        return SalaryPerMonth;
    }

    @Override
    public String toString() {
        return "ContractEmployee " + super.getName() + " {" +
                "federalTaxIdMember='" + federalTaxIdMember + '\'' +
                ", SalaryPerMonth=" + SalaryPerMonth +
                '}';
    }
}
