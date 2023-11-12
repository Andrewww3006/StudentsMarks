package com.company.vehicles;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Student> studentList = new ArrayList<>();
        Student ivanov = new Student("Ivanov", 52294, 2,10,4,3);
        Student petrov = new Student("Petrov", 52295, 2,2,2,2);
        Student sidorov = new Student("Sidorov", 52293, 2,5,2,3);
        studentList.add(ivanov);
        studentList.add(petrov);
        studentList.add(sidorov);
        Student admin = new Student(studentList);
        admin.displayStudentList();
        //admin.deleteStudent();
        System.out.println();
        //admin.displayStudentList();
        //admin.moveToNextCourse();
        //admin.displayStudentList();
        //admin.printStudents(studentList,2);
        Student test = new Student();
        //test.printStudents(studentList,2);

        List<Student> linkedListStudents = new LinkedList<>();

        linkedListStudents.addAll(studentList);
        linkedListStudents.add(2, admin);
        for(Student student:linkedListStudents)
            System.out.println(student.getName()+"l");

        Comparator<Student> idComparator = new Comparator <Student>(){

            @Override
            public int compare(Student c1, Student c2) {
                return (c1.getMathMark() - c2.getMathMark());
            }
        };
        Queue<Student> priorityQueue = new PriorityQueue<>(idComparator);
        priorityQueue.add(sidorov);
        priorityQueue.add(ivanov);
        priorityQueue.add(petrov);

        System.out.println(priorityQueue.poll().getName());
        System.out.println(priorityQueue.poll().getName());

        System.out.println( priorityQueue.peek().getName());
    }
}
