package edu.northeastern.mengyi;

import java.util.Comparator;
import java.util.Date;

public class Student {
    private int id;
    private String name;
    private double gpa;
    private Date dateOfBirth;

    public Student(int id, String name, double gpa, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.dateOfBirth = dateOfBirth;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public Date getDataOfBirth() {
        return dateOfBirth;
    }

    public static class NameComparator implements Comparator<Student> {
        @Override
        public int compare(Student a, Student b) {
            return a.name.compareTo(b.name);
        }
    }

    public static class GpaComparator implements Comparator<Student> {
        @Override
        public int compare(Student a, Student b) {
            return Double.compare(b.gpa,a.gpa);
        }
    }

    public static class DateOfBirthComparator implements Comparator<Student> {
        @Override
        public int compare(Student a, Student b) {
            return a.dateOfBirth.compareTo(b.dateOfBirth);
        }
    }
}

