package com.leospiritlee.base.enums;

/**
 * @Project: JavaStudyDemo
 * @ClassName RandomTest
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-06 16:14
 **/
public class RandomTest {


    public static void main(String[] args) {
        for(int i = 0; i < 20; i++){
            System.out.print(Enums.random(Activity.class) + " ");
        }

    }
}

enum Activity { SITTING, LYING, STANDING, HOPPING,
    RUNNING, DODGING, JUMPING, FALLING, FLYING }