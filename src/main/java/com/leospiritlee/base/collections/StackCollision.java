package com.leospiritlee.base.collections;

/**
 * @Project: JavaStudyDemo
 * @ClassName StackCollision
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-02 10:19
 **/
public class StackCollision {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for(String s : "My dog has fleas".split(" "))
            stack.push(s);
        while(!stack.isEmpty())
            System.out.print(stack.pop() + " ");
        System.out.println();
        java.util.Stack<String> stack2 =
                new java.util.Stack<>();
        for(String s : "My dog has fleas".split(" "))
            stack2.push(s);
        while(!stack2.empty())
            System.out.print(stack2.pop() + " ");
    }

}
