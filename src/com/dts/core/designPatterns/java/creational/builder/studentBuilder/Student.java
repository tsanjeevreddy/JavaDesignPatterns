package com.dts.core.designPatterns.java.creational.builder.studentBuilder;

public class Student {
    private String name;
    private int age;
    private int gradeYear;
    private int phNo;
    private String gradeType;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGradeYear(int gradeYear) {
        this.gradeYear = gradeYear;
    }

    public void setPhNo(int phNo) {
        this.phNo = phNo;
    }

    public void setGradeType(String gradeType) {
        this.gradeType = gradeType;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gradeYear=" + gradeYear +
                ", phNo=" + phNo +
                ", gradeType='" + gradeType + '\'' +
                '}';
    }
}
