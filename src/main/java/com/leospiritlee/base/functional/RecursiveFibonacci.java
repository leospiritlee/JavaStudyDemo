package com.leospiritlee.base.functional;

/**
 * @Project: JavaStudyDemo
 * @ClassName RecursiveFibonacci
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-07 22:32
 **/
public class RecursiveFibonacci {

    IntCall fib;

    RecursiveFibonacci() {
        /**
         * 构造函数中实现 IntCall 接口
         */
        fib = n -> n == 0 ? 0 :
                n == 1 ? 1 :
                        fib.call(n - 1) + fib.call(n - 2);
    }

    public static int call(int n){
//        System.out.println("n:" + n);
        return (n == 0 || n== 1) ? n : call(n-1) + call(n-2);
    }

    int fibonacci(int n) {
        //访问IntCall 实现
        return fib.call(n);
    }

    public static void main(String[] args) {
        RecursiveFibonacci rf = new RecursiveFibonacci();
        for(int i = 0; i <= 10; i++)
            System.out.println(rf.fibonacci(i));

        for(int i = 0; i <= 10; i++)
            System.out.println(call(i));

    }

}
