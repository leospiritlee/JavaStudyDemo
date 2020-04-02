package com.leospiritlee.base.generics;

import com.leospiritlee.base.typeinfo.pets.Dog;

/**
 * @Project: JavaStudyDemo
 * @ClassName DogsAndRobots
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-02 10:12
 **/
public class DogsAndRobots {

    public static void main(String[] args) {
        Communicate.perform(new PerformingDog());
        Communicate.perform(new Robot());
    }
}


class PerformingDog extends Dog implements Performs {
    @Override
    public void speak() { System.out.println("Woof!"); }
    @Override
    public void sit() { System.out.println("Sitting"); }
    public void reproduce() {}
}

class Robot implements Performs {
    public void speak() { System.out.println("Click!"); }
    public void sit() { System.out.println("Clank!"); }
    public void oilChange() {}
}

class Communicate {
    public static <T extends Performs>
    void perform(T performer) {
        performer.speak();
        performer.sit();
    }
}