package org.fasttrackit.course8.homework;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("student1", 9);
        Student student2 = new Student("student2", 6);
        Student student3 = new Student("student3", 4);
        Student student4 = new Student("student4", 10);

        System.out.println(Student.avgGrades());

    }
}
