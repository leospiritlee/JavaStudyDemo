package com.leospiritlee.base.streams;

import static com.leospiritlee.base.streams.RandInts.rands;

/**
 * @Project: JavaStudyDemo
 * @ClassName SelectElement
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-13 19:39
 **/
public class SelectElement {

    public static void main(String[] args) {
        System.out.println(rands().findFirst().getAsInt());
        System.out.println(
                rands().parallel().findFirst().getAsInt());
        System.out.println(rands().findAny().getAsInt());
        System.out.println(
                rands().parallel().findAny().getAsInt());
    }

}
