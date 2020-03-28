package com.leospiritlee.base.generics;

/**
 * @Project: JavaStudyDemo
 * @ClassName Tuple5
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-28 17:58
 **/
public class Tuple5<A, B, C, D, E> extends Tuple4<A, B, C, D> {

    public final E e;
    public Tuple5(A a, B b, C c, D d, E e) {
        super(a, b, c, d);
        this.e = e;
    }

    @Override
    public String rep() {
        return super.rep() + ", " + e;
    }
}