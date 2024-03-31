package com.dts.core.designPatterns.creational.protoType;

public class NightStudent extends Student {

    private double time;

    public NightStudent() {
        super();
    }

    public NightStudent(NightStudent nightStudent) {
        super(nightStudent);
        this.time = nightStudent.time;
    }

    @Override
    public NightStudent clone() {
        return new NightStudent(this);
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + this.getAge() +
                ", name='" + this.getName() + '\'' +
                ", batch='" + this.getBatch() + '\'' +
                ", marksScore=" + this.getMarksScore() +
                ", rank=" + this.getRank() +
                "time=" + this.time +
                '}';
    }
}
