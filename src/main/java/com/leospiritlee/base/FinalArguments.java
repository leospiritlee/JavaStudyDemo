package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName FinalArguments
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-21 13:43
 **/
public class FinalArguments {

    void with(final Gizmo g) {
        //-g = new Gizmo(); // Illegal -- g is final
        int gResult = this.g(10);
        System.out.println("gResult: " + gResult);
    }

    void without(Gizmo g) {
        g = new Gizmo(); // OK -- g is not final
        g.spin();
    }

    //void f(final int i) { i++; } // Can't change
    // You can only read from a final primitive
    int g(final int i) {
        return i + 1;
    }

    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.without(null);
        bf.with(null);
    }
}


class Gizmo {
    public void spin() {
        System.out.println("spin()");
    }
}