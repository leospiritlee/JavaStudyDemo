package com.leospiritlee.base.generics;

/**
 * @Project: JavaStudyDemo
 * @ClassName Tuple3
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-28 17:56
 **/
public class Tuple3<A, B, C> extends Tuple2<A, B> {

    public final C c;

    public Tuple3(A a, B b, C c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public String rep() {
        return super.rep() + ", " + c;
    }
}
