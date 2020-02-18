package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName Mugs
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-18 21:15
 **/
public class Mugs {

    Mug mug1;
    Mug mug2;
    { // [1] 缺少static 每次初始化对象都会调用
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 & mug2 initialized");
    }

    Mugs() {
        System.out.println("Mugs()");
    }

    Mugs(int i) {
        System.out.println("Mugs("+i+")");
    }

    public static void main(String[] args) {
        System.out.println("Inside main()");
        new Mugs();
        System.out.println("new Mugs() completed");
        new Mugs(1);
        System.out.println("new Mugs(1) completed");
    }
}

class Mug {
    Mug(int marker) {
        System.out.println("Mug(" + marker + ")");
    }
}
