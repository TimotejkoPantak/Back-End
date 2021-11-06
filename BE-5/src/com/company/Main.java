package com.company;


public class Main {

    public static void main(String[] args) {
        var coder = new JobPosition("IT Programmer", 2100);
        var employee = new Employee("Jožko", "Mrkvička","4.7.1990" , coder);
        System.out.println(employee.getName() + "," + employee.getSureName() + "," + employee.getDate() + "," + coder.getName() + "," + "salary: " + coder.getSalary()+" eur");;
    }
}

class JobPosition{
    private String Name;
    private double Salary;

    public JobPosition(String name, double salary) {
        Name = name;
        Salary = salary;
    }

    public String getName() {
        return Name;
    }

    public double getSalary() {
        return Salary;
    }
}

class Employee {
    private String Name;
    private String SureName;
    private String Date;

    public Employee(String name, String sureName, String date, JobPosition coder) {
        Name = name;
        SureName = sureName;
        Date = date;
    }

    public String getName() {
        return Name;
    }

    public String getSureName() {
        return SureName;
    }

    public String getDate() {
        return Date;
    }
}