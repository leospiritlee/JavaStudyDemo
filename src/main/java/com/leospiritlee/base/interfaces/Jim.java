package com.leospiritlee.base.interfaces;

/**
 * @Project: JavaStudyDemo
 * @ClassName Jim
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-24 18:45
 **/
public class Jim implements Jim1, Jim2 {


    @Override
    public void jim() {
        Jim2.super.jim();
    }

    public static void main(String[] args) {
        new Jim().jim();
    }
}


interface Jim1 {
    default void jim() {
        System.out.println("Jim1::jim");
    }
}

interface Jim2 {
    default void jim() {
        System.out.println("Jim2::jim");
    }
}