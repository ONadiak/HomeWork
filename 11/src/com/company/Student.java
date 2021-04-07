package com.company;

import java.util.List;
import java.util.ListIterator;

public class Student {
    private String name;
    private int course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int course) {
        this.course = course;
    }

    public static void printStudents (List<Student> lst, int course )
    {
        ListIterator<Student> iter = lst.listIterator(0);
        while (iter.hasNext()) {
            Student element =iter.next();
            if (element.getCourse() == course) {
                System.out.println(element);
            }
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
