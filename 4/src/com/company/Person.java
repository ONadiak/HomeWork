package com.company;

import java.util.Calendar;

public class Person {

    private String name;
    private int birthYear;
    private int year = Calendar.getInstance().get(Calendar.YEAR);

    public String  getName (){
        return name;
    }
    public int getBirthYear ( ) {
        return birthYear;
    }
    public void setName (String name) {
        this.name = name;
    }

    public void setBirthYear (int birthYear) {
        this.birthYear = birthYear;
    }

    public int age () {
        return this.year - this.birthYear;
    }
    public void input ( String name, int birthYear){
        setName(name);
        setBirthYear(birthYear);
    }
    public void output() {
        System.out.println(" The name of the person is " + this.name );
        System.out.println(" Person's birthday is " + this.birthYear + " and age is " + this.age());
    }
    public void changeName (String name ) {
        this.name = name ;
    }
    public Person ( ) {};
    public Person (String name , int birthYear) {
        this.name=name;
        this.birthYear = birthYear;

    }
    public Person (String name ) {
        this.name = name;
    }

}
