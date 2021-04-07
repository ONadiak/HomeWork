package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first side of brick ");
        int a = Integer.parseInt(br.readLine());
        while (a<= 0){
            System.out.println(" You entered invalid data, please enter new data ");
            a = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter second side of brick ");
        int b = Integer.parseInt(br.readLine());
        while (a<= 0){
            System.out.println(" You entered invalid data, please enter new data ");
            b = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter the last one ");
        int c = Integer.parseInt(br.readLine());
        while (a<= 0){
            System.out.println(" You entered invalid data, please enter new data ");
            c = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter height of hole ");
        int x = Integer.parseInt(br.readLine());
        while (a<= 0){
            System.out.println(" You entered invalid data, please enter new data ");
            x = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter width of hole  ");
        int y = Integer.parseInt(br.readLine());
        while (a<= 0){
            System.out.println(" You entered invalid data, please enter new data ");
            y = Integer.parseInt(br.readLine());
        }


        if ( b <= x && c <= y || c <= x && b<=y  )
            System.out.println(" Brick entered ");
        else if ( a <= x && b <= y || b <= x && a<=y  )
            System.out.println(" Brick entered ");
        else if ( a <= x && c <= y || c <= x && a<=y  )
            System.out.println(" Brick entered ");
        else
            System.out.println(" Brick didn't enter");

    }
}
