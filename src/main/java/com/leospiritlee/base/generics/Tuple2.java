package com.leospiritlee.base.generics;

/**
 * @Project: JavaStudyDemo
 * @ClassName Tuple2
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-28 17:53
 **/
public class Tuple2<A, B>  {

    public final A a1;
    public final B a2;

    public Tuple2(A a, B b) {
        a1 = a; a2 = b;
    }

    public String rep() {
        return a1 + ", " + a2;
    }

    @Override
    public String toString() {
        return "(" + rep() + ")";
    }

}
