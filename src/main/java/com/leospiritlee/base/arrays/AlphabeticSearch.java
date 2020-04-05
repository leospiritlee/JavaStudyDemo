package com.leospiritlee.base.arrays;

import com.leospiritlee.base.onjava.Rand;

import java.util.Arrays;

import static com.leospiritlee.base.onjava.ArrayShow.show;

/**
 * @Project: JavaStudyDemo
 * @ClassName AlphabeticSearch
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-05 11:48
 **/
public class AlphabeticSearch {

    public static void main(String[] args) {
        String[] sa = new Rand.String().array(30);
        Arrays.sort(sa, String.CASE_INSENSITIVE_ORDER);
        show(sa);
        int index = Arrays.binarySearch(sa, sa[10], String.CASE_INSENSITIVE_ORDER);
        System.out.println("Index: " + index + "\n" + sa[index]);
    }

}
