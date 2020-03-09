package com.leospiritlee.base.functional;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @Project: JavaStudyDemo
 * @ClassName ConsumeFunction
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-09 21:24
 **/
public class ConsumeFunction {

    static Two consume(Function<One,Two> onetwo) {
        return onetwo.apply(new One());
    }

    static void consumer(Consumer<One> one){
        one.accept(new One());
    }

    public static void main(String[] args) {
        consumer(one -> new One());
        Two two = consume(one -> new Two());

    }

}


class One {

    public One() {
        System.out.println("One construct");
    }
}
class Two {
    public Two() {
        System.out.println("Two construct");
    }
}
