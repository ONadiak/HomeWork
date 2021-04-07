package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void printStudents (List<Student> lst, int course ) {

    }

    public static void main(String[] args) {
        List <Student> students = new ArrayList<Student>(5);

        students.add(0,new Student("Oleh", 4 ));
        students.add(1,new Student("Andrew",2 ));
        students.add(2,new Student("Illia",3 ));
        students.add(3,new Student("Max",1 ));
        students.add(4,new Student("Ostap",2 ));


        System.out.println("Sorted by course");
        students.sort(new ComparingCourses());
        for (int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }
        System.out.println();
        System.out.println("Sorted by name");
        students.sort(new ComparingName());
        for (int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }






    }
}
