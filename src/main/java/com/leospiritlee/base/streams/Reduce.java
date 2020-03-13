package com.leospiritlee.base.streams;

import java.util.Random;
import java.util.stream.Stream;

/**
 * @Project: JavaStudyDemo
 * @ClassName Reduce
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-13 15:15
 **/
public class Reduce {

    public static void main(String[] args) {
        Stream.generate(Frobnitz::supply)
                .limit(10)
                .peek(System.out::println)
                .reduce((fr0, fr1) -> fr0.size < 50 ? fr0 : fr1)
                .ifPresent(System.out::println);
    }

}

class Frobnitz {
    int size;
    Frobnitz(int sz) { size = sz; }
    @Override
    public String toString() {
        return "Frobnitz(" + size + ")";
    }
    // Generator:
    static Random rand = new Random(47);
    static final int BOUND = 100;
    static Frobnitz supply() {
        return new Frobnitz(rand.nextInt(BOUND));
    }
}
