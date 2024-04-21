package com.dts.core.designPatterns.java.creational.builder.studentBuilder;

public class StudentBuilder implements Builder {

    private Student student;

    public StudentBuilder(){
        this.student = new Student();
    }


    @Override
    public void buildStudentName(String name) {
        if(name != null) {
            student.setName(name);
        }
    }

    @Override
    public void buildStudentAge(int age) {
        if(age > 18) {
            student.setAge(age);
        }
    }

    @Override
    public void buildStudentGradeYear(int gradeYear) {
        student.setGradeYear(gradeYear);
    }

    @Override
    public void buildStudentPhNo(int phNo) {
        if(phNo > 0) {
            student.setPhNo(phNo);
        }
    }

    @Override
    public void buildStudentGradeType(String gradeType) {
        student.setGradeType(gradeType);
    }

    @Override
    public Student getStudent() {
        return this.student;
    }
}
