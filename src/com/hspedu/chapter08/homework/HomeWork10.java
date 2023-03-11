package com.hspedu.chapter08.homework;

public class HomeWork10 {
    public static void main(String[] args) {
        //向上转型
        Person10 p = new Sun10();
        p.run();
        p.eat();

        System.out.println("------------------------------");
        //向下转型
        Sun10 s = (Sun10) p;

        s.run();
        s.study();
        s.eat();

    }


}

class Person10 {
    public void run() {
        System.out.println("Person run()");
    }

    public void eat() {
        System.out.println("Person eat()");
    }

}

class Sun10 extends Person10 {
    public void run() {
        System.out.println("Sun run()");
    }

    public void study() {
        System.out.println("Sun study()!");
    }

}
