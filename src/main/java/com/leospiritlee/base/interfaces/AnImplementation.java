package com.leospiritlee.base.interfaces;

/**
 * @Project: JavaStudyDemo
 * @ClassName AnImplementation
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-24 15:49
 **/
public class AnImplementation implements AnInterface {
    @Override
    public void firstMethod() {
        System.out.println("firstMethod");
    }

    @Override
    public void secondMethod() {
        System.out.println("secondMethod");
    }

    public static void main(String[] args) {
        AnInterface anInterface = new AnImplementation();
        anInterface.firstMethod();
        anInterface.secondMethod();
    }
}
