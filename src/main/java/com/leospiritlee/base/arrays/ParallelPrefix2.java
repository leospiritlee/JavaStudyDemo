package com.leospiritlee.base.arrays;

import com.leospiritlee.base.onjava.Rand;

import java.util.Arrays;

import static com.leospiritlee.base.onjava.ArrayShow.show;

/**
 * @Project: JavaStudyDemo
 * @ClassName ParallelPrefix2
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-05 11:56
 **/
public class ParallelPrefix2 {

    public static void main(String[] args) {
        String[] strings = new Rand.String(1).array(8);
        show(strings);
        Arrays.parallelPrefix(strings, (a, b) -> a + b);
        show(strings);
    }

}
