package com.leospiritlee.base.collections;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Project: JavaStudyDemo
 * @ClassName StackTest
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-02 09:52
 *
 *  后进先出”（LIFO）集合
 *
 **/
public class StackTest {

    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        for(String s : "My dog has fleas".split(" "))
            stack.push(s);
        while(!stack.isEmpty())
            System.out.print(stack.pop() + " ");
    }

}
