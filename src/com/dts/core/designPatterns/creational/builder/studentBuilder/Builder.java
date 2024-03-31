package com.dts.core.designPatterns.creational.builder.studentBuilder;

public interface Builder {
    void buildStudentName(String name);
    void buildStudentAge(int age);
    void buildStudentGradeYear(int gradeYear);
    void buildStudentPhNo(int phNo);
    void buildStudentGradeType(String gradeType);
    Student getStudent();
}
