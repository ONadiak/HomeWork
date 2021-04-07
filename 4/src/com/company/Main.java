package com.company;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.input("Sasha", 2002 );
        person1.output();


        Person person2 = new Person("Petro", 1962);
        System.out.println("Petro's age is " + person2.age());

        Person person3 = new Person( " Alex ");
        person3.setBirthYear(1999);
        person3.output();


        Person person4 = new Person();
        person4.setName(" Max ");
        person4.setBirthYear(2009);
        System.out.println("Person's name is " + person4.getName() + " and he is " + person4.age() + "years old ");

        Person person5 = new Person();
        person5.input(" Ostap ", 2002 );
        person5.output();
        person5.changeName("Olexandr ");
        System.out.println(person5.getName() + " was born in " + person5.getBirthYear() );
    }
}
