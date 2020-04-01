package com.leospiritlee.base.generics;

import java.util.Arrays;
import java.util.List;

/**
 * @Project: JavaStudyDemo
 * @ClassName CompilerIntelligence
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-01 20:21
 **/
public class CompilerIntelligence {

    public static void main(String[] args) {
        List<? extends Fruit> flist = Arrays.asList(new Apple());
        Apple a = (Apple) flist.get(0); // No warning
        System.out.println("a: " + a.toString());
        System.out.println(flist.contains(new Apple())); // Argument is 'Object'
        System.out.println(flist.indexOf(new Apple())); // Argument is 'Object'

        System.out.println(flist.contains(a));
        System.out.println(flist.indexOf(a));

        System.out.println("ab: " + flist.get(0));
        System.out.println(flist.contains(flist.get(0)));
        System.out.println(flist.indexOf(flist.get(0)));
    }

}
