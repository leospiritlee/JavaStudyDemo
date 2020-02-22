package com.leospiritlee.base.polymorphism;

/**
 * @Project: JavaStudyDemo
 * @ClassName Sandwich
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-22 20:05
 **/

/**
 * 基类构造器被调用。这个步骤被递归地重复，这样一来类层次的顶级父类会被最先构造，然后是它的派生类，以此类推，直到最底层的派生类。
 * 按声明顺序初始化成员。
 * 调用派生类构造器的方法体。
 */
public class Sandwich extends PortableLunch {

    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();

//    private PortableLunch portableLunch = new PortableLunch();
//    private Lunch lunch = new Lunch();

    public Sandwich() {
        System.out.println("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();
    }

}

class Meal {
    Meal() {
        System.out.println("Meal()");
    }
}

class Bread {
    Bread() {
        System.out.println("Bread()");
    }
}

class Cheese {
    Cheese() {
        System.out.println("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
        System.out.println("Lettuce()");
    }
}

class Lunch extends Meal {
    Lunch() {
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        System.out.println("PortableLunch()");
    }
}