package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName CommaOperator
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-16 14:00
 **/
public class CommaOperator {

    public static void main(String[] args) {
        for(int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
            System.out.println("i = " + i + " j = " + j);
        }

        System.out.println("----------------------------");

        int m =1, n = m + 10;
        System.out.println("m = " + m + " n = " + n);
        while (true){
            m++;
            if(m < 5){
                n = m * 2;
                System.out.println("m = " + m + " n = " + n);
            }else {
                break;
            }
        }
    }

}
