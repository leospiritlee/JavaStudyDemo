package com.leospiritlee.base.streams;

import java.util.stream.LongStream;
import static java.util.stream.LongStream.*;
/**
 * @Project: JavaStudyDemo
 * @ClassName Prime
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-11 21:41
 **/
public class Prime {

    public static Boolean isPrime(long n) {
        return rangeClosed(2, (long)Math.sqrt(n))
                .noneMatch(i -> n % i == 0);
    }
    public LongStream numbers() {
        return iterate(2, i -> i + 1)
                .filter(Prime::isPrime);
    }
    public static void main(String[] args) {
        new Prime().numbers()
                .limit(10)
                .forEach(n -> System.out.format("%d ", n));

        System.out.println();
        new Prime().numbers()
                .skip(90)
                .limit(10)
                .forEach(n -> System.out.format("%d ", n));
    }


}
