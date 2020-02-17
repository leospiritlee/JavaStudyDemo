package com.leospiritlee.base;

import java.util.Random;

/**
 * @Project: JavaStudyDemo
 * @ClassName ForInFloat
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-16 14:12
 **/
public class ForInFloat {

    /**
     * 0.72711575
     * 0.39982635
     * 0.5309454
     * 0.0534122
     * 0.16020656
     * 0.57799757
     * 0.18847865
     * 0.4170137
     * 0.51660204
     * 0.73734957
     * @param args
     */
    public static void main(String[] args) {
        Random rand = new Random(47);
        float[] f = new float[10];
        for(int i = 0; i < 10; i++){
            f[i] = rand.nextFloat();
        }

        for(float x : f){
            System.out.println(x);
        }

    }
}
