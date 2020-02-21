package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName Jurassic
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-21 17:47
 **/
public class Jurassic {

    public static void main(String[] args) {
        Dinosaur n = new Dinosaur();
        n.f();
        n.i = 40;
        n.j++;

        System.out.println(n);

        n = new Dinosaur();

        System.out.println(n);
    }

}

class SmallBrain {
    @Override
    public String toString() {
        return "SmallBrain{}";
    }
}

final class Dinosaur {
    int i = 7;
    int j = 1;
    SmallBrain x = new SmallBrain();

    void f() {}

    @Override
    public String toString() {
        return "Dinosaur{" +
                "i=" + i +
                ", j=" + j +
                ", x=" + x +
                '}';
    }
}