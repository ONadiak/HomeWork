package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class functions  {

    public static int Input ( ) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please, enter a natural number");
        int n = 0; int i = 0;
        while ( i != 1) {
            try {
                n = Integer.parseInt(br.readLine());

            } catch (IOException e) {
                e.printStackTrace();

            }
            if (n <= 0) {
                System.out.println("You entered incorrect number, please enter number >0");
            }
            else if (n > 0)
                i++;
        }
        return  n;
    }


    public static void Check_3(int a) {
        int n = a * a; int c = 0;
        while (c != 1) {
            int b = n % 10;
            if (b == 3) {
                System.out.println(" Your squared number has the number 3");
                break;
            } else if (b == 0){
                System.out.println(" Your number squared hasn't the number 3");
            }
            if (n == 0)
                c++;
            n /= 10;
        }
    }


    public static int Count (int a) {
        int count=0;
        while (a != 0)
        {
            a = a / 10;
            count++;
        }
        return count;
    }

    public static void Inverting (int a ) {
        int count = Count(a);
        int [] arr = new int[ count];
        int b; String number = "" ;
       if ( a > 0) {
           for (int i = 0; i < count; i++) {
               b = a % 10;
               a /= 10;
               arr[i] = b;
               if (a == 0) {
                   for (int j = 0; j < count; j++) {
                       number = number + arr[j];
                   }
                   System.out.println("Your inverted number is: " + number);
               }
           }

       }
        else if ( a == 0)
            System.out.println( " Your number is 0 ");

    }
    public static void Reshuffle ( int a ) {
       String number = " "; int b; int [] arr = new int[ Count(a)]; int count = Count(a); int first, last;
        for (int i = Count(a); i != 0; i-- )
        {
            b = a % 10;
            a /= 10;
            arr[--count] = b;
        }
        last = arr[arr.length -1];
        first = arr[0];
        arr[0] = last;
        arr[arr.length -1 ] = first;
        for (int j = 0; j < arr.length ; j++) {
            number = number + arr[j];
        }
        System.out.println("New number is: " + number);
    }

    public static void Adding_1 ( int a )
    {
        String number_with_1 = Integer.toString(a);
        System.out.println( " Your number with 1 at the end and at the start is: " + 1+number_with_1+1 );
    }

}



