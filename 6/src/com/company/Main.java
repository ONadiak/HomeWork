package com.company;

public class Main {

    public static void main(String[] args) {

        Telephone tl1 = new Telephone(" Lenovo ", " K40 ");
	Telephone.clickOnPowerButton();
	tl1.setYearOfManufacture(2018);
        System.out.println(" Telephone was manufactured " + tl1.getAgeOfTelephone() + " years ago ");
    }
}
