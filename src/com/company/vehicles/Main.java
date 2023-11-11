package com.company.vehicles;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Student> studentList = new ArrayList<>();
        Student ivanov = new Student("Ivanov", 52294, 2,5,4,3);
        Student petrov = new Student("Petrov", 52295, 3,1,2,2);
        Student sidorov = new Student("Sidorov", 52293, 1,1,2,3);
        studentList.add(ivanov);
        studentList.add(petrov);
        studentList.add(sidorov);
        Student admin = new Student(studentList);
        admin.displayStudentList();
        admin.deleteStudent();
        System.out.println();
        admin.displayStudentList();


    }
}
