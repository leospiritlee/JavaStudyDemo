package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName Person
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-17 20:48
 **/
public class PassingThis  {

    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}

class Person {
    public void eat(Apple apple) {
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");
    }
}

class Peeler {
    static Apple peel(Apple apple) {
        // ... remove peel
        return apple; // Peeled
    }
}

class Apple {
    Apple getPeeled() {
        return Peeler.peel(this);
    }
}
