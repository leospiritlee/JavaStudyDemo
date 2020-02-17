package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName WhileTest
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-16 13:52
 **/
public class WhileTest {

    static boolean condition() {
        boolean result = Math.random() < 0.99;
        System.out.print(result + ", ");
        return result;
    }
    public static void main(String[] args) {
        while(condition()){
            System.out.println("Inside 'while'");
        }
        System.out.println("Exited 'while'");
    }

}
