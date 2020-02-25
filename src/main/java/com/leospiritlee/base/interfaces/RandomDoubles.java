package com.leospiritlee.base.interfaces;

import java.util.Random;

/**
 * @Project: JavaStudyDemo
 * @ClassName RandomDoubles
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-25 18:03
 **/
public interface  RandomDoubles {

    Random RAND = new Random(47);

    default double next() {
        return RAND.nextDouble();
    }

    static void main(String[] args) {
        RandomDoubles rd = new RandomDoubles(){};
        for (int i = 0; i < 7; i++) {
            System.out.println(rd.next() + " ");
        }
    }

}
