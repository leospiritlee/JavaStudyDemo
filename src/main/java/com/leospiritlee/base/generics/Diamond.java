package com.leospiritlee.base.generics;

/**
 * @Project: JavaStudyDemo
 * @ClassName Diamond
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-28 16:51
 **/
public class Diamond<T> {

    public static void main(String[] args) {
        GenericHolder<Bob> h3 = new GenericHolder<>();
        h3.set(new Bob());
    }

}

class Bob {}
