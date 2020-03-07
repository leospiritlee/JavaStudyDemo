package com.leospiritlee.base.functional;

/**
 * @Project: JavaStudyDemo
 * @ClassName RecursiveFactorial
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-07 22:20
 **/
public class RecursiveFactorial {

    static IntCall fact;
    public static void main(String[] args) {
        /**
         *  interface IntCall impl lambda
         */
        fact = n -> n == 0 ? 1 : n * fact.call(n - 1);
        for(int i = 0; i <= 10; i++){
            System.out.println(fact.call(i));
        }

        for(int i = 1 ; i <= 10; i++){
            System.out.println(call(i));
        }


    }


    public static int call(int n){
        System.out.println("n: " + n);
        return n == 0 ? 1 : n * call(n -1);
    }

}
