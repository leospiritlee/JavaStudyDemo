package com.leospiritlee.base.arrays;

import com.leospiritlee.base.onjava.Rand;

import java.util.Arrays;
import java.util.Collections;

import static com.leospiritlee.base.onjava.ArrayShow.show;

/**
 * @Project: JavaStudyDemo
 * @ClassName StringSorting
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-05 11:36
 **/
public class StringSorting {

    public static void main(String[] args) {
        String[] sa = new Rand.String().array(20);
        show("Before sort", sa);
        Arrays.sort(sa);
        show("After sort", sa);
        Arrays.sort(sa, Collections.reverseOrder());
        show("Reverse sort", sa);
        Arrays.sort(sa, String.CASE_INSENSITIVE_ORDER);
        show("Case-insensitive sort", sa);
    }

}
