package com.dts.core.designPatterns.java.creational.protoType.practice;

public class Student implements ProtoType<Student> {

    private int age;
    private String name;
    private String batch;
    private double marksScore;
    private int rank;

    public Student() {
    }

    public Student(Student student) {
        this.age = student.age;
        this.name = student.name;
        this.batch = student.batch;
        this.marksScore = student.marksScore;
        this.rank = student.rank;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setMarksScore(double marksScore) {
        this.marksScore = marksScore;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getBatch() {
        return batch;
    }

    public double getMarksScore() {
        return marksScore;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", batch='" + batch + '\'' +
                ", marksScore=" + marksScore +
                ", rank=" + rank +
                '}';
    }
}
