package com.leospiritlee.base.generics;

/**
 * @Project: JavaStudyDemo
 * @ClassName Tuple4
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-28 17:57
 **/
public class Tuple4<A, B, C, D>  extends Tuple3<A, B, C> {

    public final D d;
    public Tuple4(A a, B b, C c, D d) {
        super(a, b, c);
        this.d = d;
    }

    @Override
    public String rep() {
        return super.rep() + ", " + d;
    }
}
