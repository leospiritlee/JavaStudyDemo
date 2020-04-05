package com.leospiritlee.base.arrays;

import java.util.Arrays;
import java.util.Collections;

import static com.leospiritlee.base.onjava.ArrayShow.show;

/**
 * @Project: JavaStudyDemo
 * @ClassName Reverse
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-05 11:31
 **/
public class Reverse {

    public static void main(String[] args) {
        CompType[] a = new CompType[12];
        Arrays.setAll(a, n -> CompType.get());
        show("Before sorting", a);
        Arrays.sort(a, Collections.reverseOrder());
        show("After sorting", a);
    }

}
