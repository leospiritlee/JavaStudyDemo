package com.leospiritlee.base.generics;

import com.leospiritlee.base.typeinfo.pets.Dog;

import java.util.function.Consumer;

/**
 * @Project: JavaStudyDemo
 * @ClassName DogsAndRobotMethodReferences
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-02 12:00
 **/
public class DogsAndRobotMethodReferences {

    public static void main(String[] args) {
        CommunicateA.perform(new PerformingDogA(), PerformingDogA::speak, PerformingDogA::sit);
        CommunicateA.perform(new RobotA(), RobotA::speak, RobotA::sit);
        CommunicateA.perform(new Mime(), Mime::walkAgainstTheWind, Mime::pushInvisibleWalls);
    }

}


class PerformingDogA extends Dog {
    public void speak() { System.out.println("Woof!"); }
    public void sit() { System.out.println("Sitting"); }
    public void reproduce() {}
}

class RobotA {
    public void speak() { System.out.println("Click!"); }
    public void sit() { System.out.println("Clank!"); }
    public void oilChange() {}
}

class CommunicateA {
    public static <P> void perform(P performer, Consumer<P> action1, Consumer<P> action2) {
        action1.accept(performer);
        action2.accept(performer);
    }
}
