package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName ListCharacters
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-16 13:57
 **/
public class ListCharacters {

    public static void main(String[] args) {
        for(char c = 0; c < 128; c++)
            if(Character.isLowerCase(c)){
                System.out.println("value: " + (int)c + " character: " + c);
            }

    }
}
