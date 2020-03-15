package com.leospiritlee.base.exceptions;

/**
 * @Project: JavaStudyDemo
 * @ClassName OnOffSwitch
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-15 12:09
 **/
public class OnOffSwitch {

    private static Switch sw = new Switch();
    public static void f()
            throws OnOffException1, OnOffException2 {}
    public static void main(String[] args) {
        try {
            sw.on();
            // Code that can throw exceptions...
            f();
            sw.off();
        } catch(OnOffException1 e) {
            System.out.println("OnOffException1");
            sw.off();
        } catch(OnOffException2 e) {
            System.out.println("OnOffException2");
            sw.off();
        }
    }

}
