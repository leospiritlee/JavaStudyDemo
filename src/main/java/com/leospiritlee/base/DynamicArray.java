package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName DynamicArray
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-18 21:25
 **/
public class DynamicArray {

    public static void main(String[] args) {
        Other.main(new String[] {"fiddle", "de", "dum"});
    }
}

class Other {
    public static void main(String[] args) {
        for (String s: args) {
            System.out.print(s + " ");
        }
    }
}
