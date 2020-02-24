package com.leospiritlee.base.interfaces;

/**
 * @Project: JavaStudyDemo
 * @ClassName Implementation2
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-24 15:59
 **/
public class Implementation2 implements InterfaceWithDefault {

    @Override
    public void firstMethod() {
        System.out.println("firstMethod");
    }

    @Override
    public void secondMethod() {
        System.out.println("secondMethod");
    }

    public static void main(String[] args) {
        InterfaceWithDefault interfaceWithDefault = new Implementation2();
        interfaceWithDefault.firstMethod();
        interfaceWithDefault.secondMethod();
        interfaceWithDefault.newMethod();
    }
}
