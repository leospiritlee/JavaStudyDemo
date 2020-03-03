package com.leospiritlee.base.typeinfo;

/**
 * @Project: JavaStudyDemo
 * @ClassName GenericToyTest
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-03 17:17
 **/
public class GenericToyTest {

    public static void main(String[] args) throws Exception {
        Class<FancyToy> ftClass = FancyToy.class;
        // Produces exact type:
        FancyToy fancyToy = ftClass.newInstance();
        Class<? super FancyToy> up = ftClass.getSuperclass();
        // This won't compile:
        // Class<Toy> up2 = ftClass.getSuperclass();
        // Only produces Object:
        Object obj = up.newInstance();
    }

}
