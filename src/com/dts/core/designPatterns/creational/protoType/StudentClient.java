package com.dts.core.designPatterns.creational.protoType;

public class StudentClient {
    public static void main(String[] as) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistryWithStudents(studentRegistry);

        Student copiedStudent = studentRegistry.getStudent("RegularStu-Morning").clone();
        copiedStudent.setName("Tulasi");
        copiedStudent.setRank(7);
        studentRegistry.registerStudent("RegularStu-Morning-1", copiedStudent);

        Student nightStudent  = studentRegistry.getStudent("NightStu-Night").clone();
        nightStudent.setName("Jai");
        nightStudent.setRank(1);
        studentRegistry.registerStudent("NightStu-Night-1", nightStudent);

        System.out.println("Final Registry.. RegularStu-Morning.. " + studentRegistry.getStudent("RegularStu-Morning"));
        System.out.println("Final Registry.. NightStu-Night.. " + studentRegistry.getStudent("NightStu-Night"));
        System.out.println("Final Registry.. RegularStu-Morning-1 .. " + studentRegistry.getStudent("RegularStu-Morning-1"));
        System.out.println("Final Registry.. NightStu-Night-1 .. " + studentRegistry.getStudent("NightStu-Night-1"));

    }

    private static void fillRegistryWithStudents(StudentRegistry studentRegistry) {
        Student student = new Student();
        student.setName("Sanjeev");
        student.setAge(37);
        student.setBatch("Morning");
        student.setRank(10);
        student.setMarksScore(200.78);

        studentRegistry.registerStudent("RegularStu-Morning", student);

        NightStudent nightStudent = new NightStudent();
        nightStudent.setTime(10.30);
        nightStudent.setName("Shiva");

        studentRegistry.registerStudent("NightStu-Night", nightStudent);
    }
}
