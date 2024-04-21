package com.dts.core.designPatterns.java.creational.builder.studentBuilder;

public class StudentClient {
    public static void main(String[] as) {
        SchoolDirector director = new SchoolDirector();
        Student student = director.createStudent(new StudentBuilder());
        System.out.println("Student Object.."+ student);
    }
}
