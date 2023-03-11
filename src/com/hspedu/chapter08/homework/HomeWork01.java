package com.hspedu.chapter08.homework;

import java.util.Objects;

public class HomeWork01 {
    public static void main(String[] args) {
        Person persons[] = new Person[5];
        persons[0] = new Person("jim",1500, "程序员");
        persons[1] = new Person("tom",5000, "农民工");
        persons[2] = new Person("jack",2000, "销售经理");
        persons[3] = new Person("wu",3200, "司机");
        persons[4] = new Person("si",2200, "武神");

        for(Person p: persons)
        {
            System.out.println(p);
        }
        System.out.println("冒泡排序后。。。。。。。。。。。。。。。。。");
        for(int i=0; i<persons.length-1; i++) {
            for (int j = 0; j < persons.length-1-i; j++) {
                if (persons[j].getSalary() > persons[j+1].getSalary()) {

                    Person.exchangePeron(persons[j], persons[j+1]);
                }
            }
        }
        for(int i=0; i< persons.length; i++)
        {
            System.out.println(persons[i]);
        }

    }
}

class Person {
    private String name;
    private double salary;
    private String work;

    public Person(String name, double salary, String work) {
        this.name = name;
        this.salary = salary;
        this.work = work;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", work='" + work + '\'' +
                '}';
    }

    public static void exchangePeron(Person p1, Person p2) {
        double tSalary;
        String tName;
        String tWork;

        tSalary = p1.getSalary();
        p1.setSalary(p2.getSalary());
        p2.setSalary(tSalary);

        tName = p1.getName();
        p1.setName(p2.getName());
        p2.setName(tName);

        tWork = p1.getWork();
        p1.setWork(p2.getWork());
        p2.setWork(tWork);
    }
}
