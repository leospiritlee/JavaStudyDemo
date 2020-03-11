package com.leospiritlee.base.streams;

import com.leospiritlee.base.interfaces.Operations;

import java.util.Arrays;

/**
 * @Project: JavaStudyDemo
 * @ClassName Machine2
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-11 19:04
 **/
public class Machine2 {

    public static void main(String[] args) {
        Arrays.stream(new Operations[] {
                () -> Operations.show("Bing"),
                () -> Operations.show("Crack"),
                () -> Operations.show("Twist"),
                () -> Operations.show("Pop")
        }).forEach(Operations::execute);
    }

}
