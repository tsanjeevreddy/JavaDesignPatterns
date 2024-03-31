package com.dts.core.designPatterns.creational.builder.studentBuilder;

public class SchoolDirector {

    public Student createStudent(Builder builder) {
        builder.buildStudentName("Sanjeev");
        builder.buildStudentGradeYear(2024);
        builder.buildStudentGradeType("MS");
        builder.buildStudentAge(37);
        builder.buildStudentPhNo(2143175884);
        return builder.getStudent();
    }
}
