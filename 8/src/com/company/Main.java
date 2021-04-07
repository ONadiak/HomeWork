package com.company;

public class Main {

    public static void main(String[] args) {
        Employee empl1 = new ContractEmployee( 1, "Oleh", "15" );
        Employee empl2 = new ContractEmployee( 2, "Andrew", "158" );
        Employee empl3 = new SalariedEmployee( 3, "Max", 152, " 156" );
        Employee empl4 = new SalariedEmployee( 4, "Vova", 135, "157" );

        Employee[] employees = {empl1,empl2,empl3,empl4};


        System.out.println("Sorted salary");
        int n = employees.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (employees[j].calculatePay() < employees[j+1].calculatePay()) {
                    Employee temp = employees[j];
                    employees[j] = employees[j+1];
                    employees[j+1] = temp;

                }
        for (int j = 0; j < n; j++){
            System.out.println(employees[j]);
        }







    }
}
