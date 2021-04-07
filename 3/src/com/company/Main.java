package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println(" Task №1");
        System.out.println("Enter a radius of flower bed ");
        double radius = Float.parseFloat(br.readLine()); double perimetr, area;
        perimetr = 2 * Math.PI * radius ;
        area = Math.PI*radius*radius;
        System.out.println(" Perimeter of flower bed is: " + perimetr + " and area is: " + area);


        System.out.println(" Task №2");
        System.out.println(" Hello! What is your name? ");
        String name = br.readLine();
        System.out.println("Where are you live, " + name + "?");
        String address = br.readLine();
        System.out.println(" Hello " + name + ", you live in " + address );


        System.out.println(" Task №3");
        double c1,c2,c3; int t1,t2,t3;
        System.out.println(" How much standard units per minite does first call costs? ");
        c1 = Double.parseDouble(br.readLine());
        System.out.println("How long was your conversation?");
        t1 =Integer.parseInt(br.readLine());

        System.out.println(" How much standard units per minite does second call costs? ");
        c2 = Double.parseDouble(br.readLine());
        System.out.println("How long was your conversation?");
        t2 =Integer.parseInt(br.readLine());

        System.out.println(" How much standard units per minite does last one costs? ");
        c3 = Double.parseDouble(br.readLine());
        System.out.println("How long was your conversation?");
        t3 =Integer.parseInt(br.readLine());

        System.out.println(" First call costs " + c1*t1 + " standard units per minute");
        System.out.println(" Second call costs " + c2*t2 + " standard units per minute");
        System.out.println(" The last one costs " + c3*t3 + " standard units per minute");
        System.out.println(" All calls together cost " + ((c1*t1)+(c2*t2)+(c3*t3)) +" standard units per minute");





    }
}
