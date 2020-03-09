package com.leospiritlee.base.functional;

import java.util.function.Function;

/**
 * @Project: JavaStudyDemo
 * @ClassName TransformFunction
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-09 22:06
 **/
public class TransformFunction {

    static Function<I,O> transform(Function<I,O> in) {
        return in.andThen(o -> {
            System.out.println(o);
            return o;
        });
    }

    public static void main(String[] args) {
        Function<I,O> f2 = transform(i -> {
            System.out.println(i);
            return new O();
        });
        O o = f2.apply(new I());
    }

}


class I {
    @Override
    public String toString() { return "I"; }
}

class O {
    @Override
    public String toString() { return "O"; }
}
