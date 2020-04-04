package com.leospiritlee.base.arrays;

import java.util.SplittableRandom;

import static com.leospiritlee.base.onjava.ArrayShow.show;

/**
 * @Project: JavaStudyDemo
 * @ClassName IceCreamFlavors
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-04 09:59
 **/
public class IceCreamFlavors {

    private static SplittableRandom rand = new SplittableRandom(47);
    static final String[] FLAVORS = {
            "Chocolate", "Strawberry", "Vanilla Fudge Swirl",
            "Mint Chip", "Mocha Almond Fudge", "Rum Raisin",
            "Praline Cream", "Mud Pie"
    };
    public static String[] flavorSet(int n) {
        if(n > FLAVORS.length){
            throw new IllegalArgumentException("Set too big");
        }

        String[] results = new String[n];
        boolean[] picked = new boolean[FLAVORS.length];
        show("picked", picked);
        for(int i = 0; i < n; i++) {

            /**
             *  随机获取下标 t
             *  获取下标 FLAVORS[t] 对应的数据
             *  为result[] 赋值 从0 - 2
             *  为picked[t] 从 false -> true
             */
            int t;
            do{
                t = rand.nextInt(FLAVORS.length);
            } while(picked[t]);
            results[i] = FLAVORS[t];
            picked[t] = true;
        }
        show("picked", picked);
        return results;
    }
    public static void main(String[] args) {
        for(int i = 0; i < 7; i++)
            show(flavorSet(3));
    }

}
