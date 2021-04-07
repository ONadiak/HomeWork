package com.company;

import java.util.Comparator;

public class ComparingCourses implements Comparator<Student> {
    public int compare(Student a, Student b) {
        if ( a.getCourse() < b.getCourse() ) return -1;
        else if ( a.getCourse() == b.getCourse() ) return 0;
        else return 1;
    }



}
