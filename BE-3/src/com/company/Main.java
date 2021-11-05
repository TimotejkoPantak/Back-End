package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Person[] people  = new Person[4];

        people[0] = new Person(4658,13,"Matko");
        people[1] = new Person(5200,43,"Jarko");
        people[2] = new Person(4566,13,"Matko2");
        people[3] = new Person(4895,13,"Timko");

        int allBudget = 0;

        for(int i = 0; i < people.length; i++){
            people[i].ShowPerson();
        }
        for(int i = 0; i < people.length; i++){
            allBudget += people[i].getBudget();
        }
        System.out.println("Budget tohether is : "+allBudget);
    }
}

class Person{
    public int Budget;
    public int Age;
    public String Name;

    public void ShowPerson(){
        System.out.println("Person name: "+Name+", Person Age: "+Age+", Person Budget: "+Budget);
    }
    public Person(int budget, int age, String name) {
        this.Budget = budget;
        this.Age = age;
        this.Name = name;
    }

    public int getBudget() {
        return Budget;
    }

    public int getAge() {
        return Age;
    }

    public String getName() {
        return Name;
    }
}