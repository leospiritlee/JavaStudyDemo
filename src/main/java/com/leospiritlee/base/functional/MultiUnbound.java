package com.leospiritlee.base.functional;

/**
 * @Project: JavaStudyDemo
 * @ClassName MultiUnbound
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-08 13:00
 **/
public class MultiUnbound {

    /**
     * 未绑定的方法与多参数的结合运用
     * @param args
     */
    public static void main(String[] args) {
        TwoArgs twoargs = This::two;
        ThreeArgs threeargs = This::three;
        FourArgs fourargs = This::four;

        This athis = new This();

        twoargs.call2(athis, 11, 3.14);
        threeargs.call3(athis, 11, 3.14, "Three");
        fourargs.call4(athis, 11, 3.14, "Four", 'Z');
    }

}


class This {
    void two(int i, double d) {}
    void three(int i, double d, String s) {}
    void four(int i, double d, String s, char c) {}
}

interface TwoArgs {
    void call2(This athis, int i, double d);
}

interface ThreeArgs {
    void call3(This athis, int i, double d, String s);
}

interface FourArgs {
    void call4(This athis, int i, double d, String s, char c);
}
