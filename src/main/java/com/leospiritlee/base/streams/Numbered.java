package com.leospiritlee.base.streams;

/**
 * @Project: JavaStudyDemo
 * @ClassName Numbered
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-12 13:48
 **/
public class Numbered {

    final int n;
    Numbered(int n) {
        this.n = n;
    }
    @Override
    public String toString() {
        return "Numbered(" + n + ")";
    }

}
