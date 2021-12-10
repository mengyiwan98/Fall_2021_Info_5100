package edu.northeastern.mengyi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException {

        Student s1 = new Student(1, "Ana",3.8, new SimpleDateFormat("yyyy-MM-dd").parse("1998-03-11"));
        Student s2 = new Student(2, "James",3.5, new SimpleDateFormat("yyyy-MM-dd").parse("1997-05-22"));
        Student s3 = new Student(3, "Bob",3.6, new SimpleDateFormat("yyyy-MM-dd").parse("1996-10-18"));
        Student s4 = new Student(4, "Zoe",4.0, new SimpleDateFormat("yyyy-MM-dd").parse("1998-01-14"));
        Student s5 = new Student(5, "Maria",3.2, new SimpleDateFormat("yyyy-MM-dd").parse("1997-12-04"));

        List<Student> students = new LinkedList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        students.sort(new Student.NameComparator());
        System.out.println("Sort by ascending order of 'name'");
        for (Student student: students) {
            System.out.println(student.getId() + " name:" + student.getName() +
                    " gpa: " + student.getGpa() + " dateOfBirth: " + student.getDataOfBirth());
        }
        System.out.println("");

        students.sort(new Student.GpaComparator());
        System.out.println("Sort by descending order of 'gpa'");
        for (Student student: students) {
            System.out.println(student.getId() + " name:" + student.getName() +
                    " gpa: " + student.getGpa() + " dateOfBirth: " + student.getDataOfBirth());
        }
        System.out.println("");

        students.sort(new Student.DateOfBirthComparator());
        System.out.println("Sort by ascending order of 'dateOfBirth'");
        for (Student student: students) {
            System.out.println(student.getId() + " name:" + student.getName() +
                    " gpa: " + student.getGpa() + " dateOfBirth: " + student.getDataOfBirth());
        }
        System.out.println("");
    }
}
