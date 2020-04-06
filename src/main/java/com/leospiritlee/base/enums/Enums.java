package com.leospiritlee.base.enums;

import java.util.Random;

/**
 * @Project: JavaStudyDemo
 * @ClassName Enums
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-06 17:06
 **/
public class Enums {

    private static Random rand = new Random(47);

    public static <T extends Enum<T>> T random(Class<T> ec) {
        return random(ec.getEnumConstants());
    }

    public static <T> T random(T[] values) {
        return values[rand.nextInt(values.length)];
    }
}
