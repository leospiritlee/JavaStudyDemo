package com.leospiritlee.base.enums;

/**
 * @Project: JavaStudyDemo
 * @ClassName NonEnum
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-05 19:19
 **/
public class NonEnum {

    public static void main(String[] args) {
        Class<Integer> intClass = Integer.class;
        try {
            for(Object en : intClass.getEnumConstants()){
                System.out.println(en);
            }

        } catch(Exception e) {
            System.out.println("Expected: " + e);
        }
    }

}
