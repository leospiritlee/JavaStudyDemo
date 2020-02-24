package com.leospiritlee.base.interfaces;

/**
 * @Project: JavaStudyDemo
 * @ClassName ImplementingAnInterface
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-24 15:29
 **/
public class ImplementingAnInterface implements Concept {

    @Override
    public void idea1() {
        System.out.println("idea1");
    }

    @Override
    public void idea2() {
        System.out.println("idea2");
    }

    public static void main(String[] args) {
        Concept concept = new ImplementingAnInterface();
        concept.idea1();
        concept.idea2();
    }
}


interface Concept { // Package access
    void idea1();
    void idea2();
}