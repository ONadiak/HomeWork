package com.company;

import java.util.Calendar;
import java.util.Objects;

public class Telephone {
    private String brand,model;
    private int yearOfManufacture,getAge;
    private boolean screenShines;

    public String getBrand() { return brand; }
    public String getModel() {return model;}
    public int getYearOfManufacture() { return yearOfManufacture; }


    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setYearOfManufacture(int yearOfManufacture) { this.yearOfManufacture = yearOfManufacture; }

    public Telephone(String brand, String model, int yearOfManufacture) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    public Telephone(String brand) {
        this.brand = brand;
    }

    public Telephone(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public Telephone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Telephone(String brand, int yearOfManufacture) {
        this.brand = brand;
        this.yearOfManufacture = yearOfManufacture;
    }

    public static void clickOnPowerButton () {
        System.out.println("After clicking on power button telephone's screen lited up ");

    }
    public static void clickOnScreen () {
        System.out.println(" Nothing happened");
    }
    public int getAgeOfTelephone ( ) {
        return Calendar.getInstance().get(Calendar.YEAR) - yearOfManufacture;
    }
    public boolean isScreenShinesAfterClickingOnButton (  ){
        clickOnPowerButton();
        return true;
    }
    public boolean isScreenShinesAfterTouching ( ){
        clickOnScreen();
        return false;
    }


    @Override
    public String toString() {
        return "Telephone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telephone telephone = (Telephone) o;
        return yearOfManufacture == telephone.yearOfManufacture && brand.equals(telephone.brand) && Objects.equals(model, telephone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearOfManufacture);
    }
}

