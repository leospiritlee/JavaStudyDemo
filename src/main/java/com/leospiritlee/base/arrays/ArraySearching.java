package com.leospiritlee.base.arrays;

import com.leospiritlee.base.onjava.Rand;

import java.util.Arrays;

import static com.leospiritlee.base.onjava.ArrayShow.show;

/**
 * @Project: JavaStudyDemo
 * @ClassName ArraySearching
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-05 11:43
 **/
public class ArraySearching {

    public static void main(String[] args) {
        Rand.Pint rand = new Rand.Pint();
        int[] a = new Rand.Pint().array(25);
        Arrays.sort(a);
        show("Sorted array", a);
        while (true) {
            int r = rand.getAsInt();
            int location = Arrays.binarySearch(a, r);
            if (location >= 0) {
                System.out.println("Location of " + r + " is " + location + ", a[" + location + "] is " + a[location]);
                break; // Out of while loop
            }
        }
    }

}
