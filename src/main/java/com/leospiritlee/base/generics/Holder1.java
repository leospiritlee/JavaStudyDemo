package com.leospiritlee.base.generics;

/**
 * @Project: JavaStudyDemo
 * @ClassName Holder1
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-27 20:20
 **/
public class Holder1 {

    private Automobile a;

    public Holder1(Automobile a) {
        this.a = a;
    }

    Automobile get() {
        return a; 
    }

}


class Automobile {}