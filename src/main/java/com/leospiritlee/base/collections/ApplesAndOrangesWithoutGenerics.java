package com.leospiritlee.base.collections;

import java.util.ArrayList;

/**
 * @Project: JavaStudyDemo
 * @ClassName ApplesAndOrangesWithoutGenerics
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-28 10:08
 **/

/**
 * output:
 * Exception in thread "main" java.lang.ClassCastException: com.leospiritlee.base.collections.Orange cannot be cast to com.leospiritlee.base.collections.Apple
 * 	at com.leospiritlee.base.collections.ApplesAndOrangesWithoutGenerics.main(ApplesAndOrangesWithoutGenerics.java:22)
 */
public class ApplesAndOrangesWithoutGenerics {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for(int i = 0; i < 3; i++)
            apples.add(new Apple());
        // No problem adding an Orange to apples:
        apples.add(new Orange());
        for(Object apple : apples) {
            ((Apple) apple).id();
            // Orange is detected only at run time
        }
    }


}

class Apple {
    private static long counter;
    private final long id = counter++;
    public long id() { return id; }
}

class Orange {}
