package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName IfElse
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-16 13:50
 **/
public class IfElse {

    static int test(int testval, int target) {
        if(testval > target){
            return  +1;
        }

        if(testval < target){
            return  -1;
        }

        // Match
        return 0;
    }

    public static void main(String[] args) {
        int result = test(10, 5);
        System.out.println(result);
        result = test(5, 10);
        System.out.println(result);
        result = test(5, 5);
        System.out.println(result);
    }

}
