package com.company.vehicles;

import java.util.ArrayList;
import java.util.Iterator;


public class Student {

    private String name;
    private int group;
    private int course;
    private int mathMark;
    private int chemMark;
    private int physMark;
    private ArrayList<Student> studentList;

    public Student(){}
    public Student (ArrayList<Student> studentList){
        this.studentList = studentList;
    }

    public Student (String name, int group, int course, int mathMark, int chemMark, int physMark) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.mathMark = mathMark;
        this.chemMark = chemMark;
        this.physMark = physMark;
    }

    public void setCourse (int course){
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public int getMathMark() {
        return mathMark;
    }

    public int getChemMark() {
        return chemMark;
    }

    public int getPhysMark() {
        return physMark;
    }

    public double getAverageMark(int mathMark, int chemMark, int physMark) {
        double averageMark;
        averageMark = (mathMark + chemMark + physMark)/3;
        return averageMark;
    }

    public void deleteStudent(){
        Iterator<Student> studentIterator = studentList.iterator();
        while (studentIterator.hasNext()) {
            Student nextStudent = studentIterator.next();
            if (nextStudent.getAverageMark(nextStudent.getMathMark(), nextStudent.getPhysMark() , nextStudent.getChemMark()) < 3) {
                System.out.println("remove:" + nextStudent.getName() + " average mark: " + nextStudent.getAverageMark(nextStudent.getMathMark(), nextStudent.getPhysMark() , nextStudent.getChemMark()));
                studentIterator.remove();
            }
        }
    }

    public void displayStudentList(){
        for (Student student: studentList)
        System.out.println("name:" + student.getName() + " group: " + student.getGroup() + " course: " + student.getCourse()
                + " average mark: " + student.getAverageMark(student.getMathMark(), student.getChemMark(), student.getPhysMark()));
    }

    public void moveToNextCourse(){
        for (Student student:studentList)
        if(student.getAverageMark(student.getMathMark(), student.getPhysMark() , student.getChemMark()) >= 3)
            student.setCourse(student.getCourse()+1);
    }

    public void printStudents(ArrayList<Student> students, int course){
        for (Student student: students){
            if (student.getCourse() == course)
                System.out.println(student.getName());
        }
    }



}
