package com.leospiritlee.base.typeinfo;

/**
 * @Project: JavaStudyDemo
 * @ClassName GenericClassReferences
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-03 16:33
 **/
public class GenericClassReferences {

    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class; // 同一个东西
        intClass = double.class;
//         genericIntClass = double.class; // 非法
//        Class<Number> geenericNumberClass = int.class; // 非法
    }

}
