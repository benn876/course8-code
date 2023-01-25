package org.fasttrackit.course8.homework;

public class Student {
    private static double sumGrades;
    private static int numberOfStudents;
    private final String name;
    private final int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        sumGrades= sumGrades + grade;
        numberOfStudents++;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public static double avgGrades(){
        return sumGrades / numberOfStudents;
    }
}
