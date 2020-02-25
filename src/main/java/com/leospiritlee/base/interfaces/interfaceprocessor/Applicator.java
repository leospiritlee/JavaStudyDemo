package com.leospiritlee.base.interfaces.interfaceprocessor;

/**
 * @Project: JavaStudyDemo
 * @ClassName Applicator
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-25 15:49
 **/
public class Applicator {

    public static void apply(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }

}
