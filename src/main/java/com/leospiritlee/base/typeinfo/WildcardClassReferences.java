package com.leospiritlee.base.typeinfo;

/**
 * @Project: JavaStudyDemo
 * @ClassName WildcardClassReferences
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-03 16:46
 **/
public class WildcardClassReferences {

    public static void main(String[] args) {
        Class<?> intClass = int.class;
        intClass = double.class;
    }

}
