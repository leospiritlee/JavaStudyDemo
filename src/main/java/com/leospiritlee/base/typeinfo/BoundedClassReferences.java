package com.leospiritlee.base.typeinfo;

/**
 * @Project: JavaStudyDemo
 * @ClassName BoundedClassReferences
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-03 16:49
 **/
public class BoundedClassReferences {

    public static void main(String[] args) {
        Class<? extends Number> bounded = int.class;
        bounded = double.class;
        bounded = Number.class;
        bounded = Integer.class;
        bounded = Double.class;
        bounded = float.class;
        // Or anything else derived from Number.
    }

}
