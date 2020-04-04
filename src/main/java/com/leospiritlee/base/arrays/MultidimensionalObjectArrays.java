package com.leospiritlee.base.arrays;

import java.util.Arrays;

/**
 * @Project: JavaStudyDemo
 * @ClassName MultidimensionalObjectArrays
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-04 11:10
 **/
public class MultidimensionalObjectArrays {

    public static void main(String[] args) {
        BerylliumSphere[][] spheres = {
                { new BerylliumSphere(), new BerylliumSphere() },
                { new BerylliumSphere(), new BerylliumSphere(),
                        new BerylliumSphere(), new BerylliumSphere() },
                { new BerylliumSphere(), new BerylliumSphere(),
                        new BerylliumSphere(), new BerylliumSphere(),
                        new BerylliumSphere(), new BerylliumSphere(),
                        new BerylliumSphere(), new BerylliumSphere() },
        };
        System.out.println(Arrays.deepToString(spheres));
    }

}
