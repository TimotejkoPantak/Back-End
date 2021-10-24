package com.company;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("John", 2, "Legionarska 1, 01001 Zilina", 123456);
        Student student2 = new Student("Fero", 5, "Legionarska 2, 01001 Zilina", 456789);
        System.out.println(student1.getName() + "," + student1.getStudentNumber() + "," + student1.getStudentAddress() +","+ student1.getStudentPhoneNumber());
        System.out.println(student2.getName() + "," + student2.getStudentNumber() + "," + student2.getStudentAddress() +","+ student2.getStudentPhoneNumber());
    }

    static class Student{
        private String Name;
        private int StudentNumber;
        private String StudentAddress;
        private int StudentPhoneNumber;

        public Student(String name, int studentNumber, String studentAddress, int studentPhoneNumber){
            Name = name;
            StudentNumber = studentNumber;
            StudentAddress = studentAddress;
            StudentPhoneNumber = studentPhoneNumber;
        }

        public String getName() {
            return Name;
        }
        public int getStudentNumber() {
            return StudentNumber;
        }
        public String getStudentAddress() { return StudentAddress; }
        public int getStudentPhoneNumber() { return StudentPhoneNumber; }
    }
}
