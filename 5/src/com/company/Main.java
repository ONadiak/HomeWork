package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Task №1");
        functions.read_check_float();
        functions.min_and_max();
        functions.HTTPError();


        System.out.println(" ");
        System.out.println(" Task №2");
        Dog dog1 = new Dog("Bub", "shepherd", 3);
        Dog dog2 = new Dog(3, " bulldog");
        Dog dog3 = new Dog( 3);
        dog2.setName("Bub");
        dog3.setName( "Bub");
        dog3.setBreed("huskie");
        dog3.output();
        functions.check_names(dog1.getName(),dog2.getName(),dog3.getName());
        if ( dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge())
            System.out.println(" The oldest dog is " + dog1.getName() );
        else if (dog2.getAge()> dog1.getAge() && dog2.getAge()> dog3.getAge())
            System.out.println("The oldest dog is " + dog2.getName());
        else if ( dog2.getAge() == dog1.getAge() && dog1.getAge() == dog3.getAge())
            System.out.println(" All dogs are the same age ");
        else
            System.out.println(" The oldest dog is " + dog3.getName());


    }
}
