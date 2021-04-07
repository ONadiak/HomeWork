package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class functions {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void read_check_float() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float[] to_check = new float[3];
        for (int i = 0 ; i<3; i++){
            System.out.println( " Enter three float numbers to check is it in range [-5;5] ");
            to_check[i] = Float.parseFloat(br.readLine());
        }
        for (int i =0; i<3;i++){
            if (to_check[i] <5 && to_check[i] > -5 ){
                System.out.print(to_check[i]+ " ");
            }
        }
        System.out.print( "belongs to the range [-5;5]");
        System.out.println();
    }
    public static void check_names (String first, String second, String third){

         if ( first == second && first == third)
            System.out.println(" All dogs have the same names");
         else if (first == second | first == third| second == third)
             System.out.println("Two dogs have the same names ");
        else
            System.out.println("All dogs have unique names ");

    }
    public static void min_and_max () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] int_toCheck = new int[3];
        for (int i = 0 ; i<3; i++){
            System.out.println( " Enter three numbers to check which is the biggest one and smallest ");
            int_toCheck[i] = Integer.parseInt(br.readLine());
        }
        if (int_toCheck[0]== int_toCheck[1] && int_toCheck[0] == int_toCheck[3])
            System.out.println(" All numbers are equal");
        else {
            Arrays.sort(int_toCheck);
            System.out.println(int_toCheck[0] + " is min, and " + int_toCheck[2] + " is max one ");
        }
    }

    public static void HTTPError () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int error;
            System.out.println( " Enter number of error about which you want to know in range 400 - 410");
            error = Integer.parseInt(br.readLine());
            switch (error) {
                case 400:
                    System.out.println(" 400 Bad Request");
                    break;
                case 401:
                    System.out.println(" 401 Unauthorized ");
                    break;
                case 402:
                    System.out.println(" 402 Payment Required");
                    break;
                case 403:
                    System.out.println(" 403 Forbidden");
                    break;
                case 404:
                    System.out.println(" 404 Not Found");
                    break;
                case 405:
                    System.out.println(" 405 Method Not Allowed");
                    break;
                case 406:
                    System.out.println(" 406 Not Acceptable");
                    break;
                case 407:
                    System.out.println(" 407 Proxy Authentication Required");
                    break;
                case 408:
                    System.out.println(" 408 Request Timeout");
                    break;
                case 409:
                    System.out.println(" 409 Conflict");
                    break;
                case 410:
                    System.out.println(" 410 Gone ");
                    break;




        }


    }

}
