package com.leospiritlee.base.onjava;

import com.leospiritlee.base.generics.Tuple2;
import com.leospiritlee.base.generics.Tuple3;
import com.leospiritlee.base.generics.Tuple4;
import com.leospiritlee.base.generics.Tuple5;

/**
 * @Project: JavaStudyDemo
 * @ClassName Tuple
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-30 21:34
 **/
public class Tuple {

    public static <A, B> Tuple2<A, B> tuple(A a, B b) {
        return new Tuple2<>(a, b);
    }

    public static <A, B, C> Tuple3<A, B, C> tuple(A a, B b, C c) {
        return new Tuple3<>(a, b, c);
    }

    public static <A, B, C, D> Tuple4<A, B, C, D> tuple(A a, B b, C c, D d) {
        return new Tuple4<>(a, b, c, d);
    }

    public static <A, B, C, D, E> Tuple5<A, B, C, D, E> tuple(A a, B b, C c, D d, E e) {
        return new Tuple5<>(a, b, c, d, e);
    }


}
