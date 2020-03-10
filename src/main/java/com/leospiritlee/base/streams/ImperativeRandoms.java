package com.leospiritlee.base.streams;

import java.time.Instant;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @Project: JavaStudyDemo
 * @ClassName ImperativeRandoms
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-10 10:39
 **/
public class ImperativeRandoms {

    public static void main(String[] args) {
        Random rand = new Random(47);
        SortedSet<Integer> rints = new TreeSet<>();
        while(rints.size() < 7) {
            int r = rand.nextInt(20);
            if(r < 5){
                continue;
            }
            rints.add(r);
        }
        System.out.println(rints);

        new Random(47)
                .ints(5, 20)
                .distinct()
                .limit(7)
                .sorted()
                .forEach(System.out::println);


        Object[] [] arr = {{"1", 2}, {Integer.valueOf(3)},{4.0}};
        System.out.println(arr[0][1]);


    }

}
