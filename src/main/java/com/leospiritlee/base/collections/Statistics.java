package com.leospiritlee.base.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @Project: JavaStudyDemo
 * @ClassName Statistics
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-02 10:57
 **/
public class Statistics {

    public static void main(String[] args) {
        Random rand = new Random(47);
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i < 10000; i++) {
            // Produce a number between 0 and 20:
            int r = rand.nextInt(20);
            Integer freq = m.get(r); // [1]
            m.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(m);

        Integer count = 0;
        for(Integer value : m.values()){
            System.out.println(value);
            count += value;
        }

        System.out.println(count);
    }
}
