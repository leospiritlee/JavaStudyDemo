package com.leospiritlee.base.enums;

/**
 * @Project: JavaStudyDemo
 * @ClassName UpcastEnum
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-05 19:15
 **/
public class UpcastEnum {

    public static void main(String[] args) {
        Search[] vals = Search.values();
        Enum e = Search.HITHER; // Upcast
        // e.values(); // No values() in Enum
        for(Enum en : e.getClass().getEnumConstants()){
            System.out.println(en);
        }

    }

}

enum Search { HITHER, YON }
