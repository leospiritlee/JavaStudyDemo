package com.leospiritlee.base.collections;

/**
 * @Project: JavaStudyDemo
 * @ClassName StackTest2
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-02 10:17
 **/
public class StackTest2 {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        for(String s : "My dog has fleas".split(" ")){
            stack.push(s);
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }

        System.out.println(stack.isEmpty());
    }

}
