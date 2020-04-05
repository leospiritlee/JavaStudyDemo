package com.leospiritlee.base.enums;

import static com.leospiritlee.base.enums.SpicinessEnum.HOT;
import static com.leospiritlee.base.enums.SpicinessEnum.MEDIUM;
import static com.leospiritlee.base.enums.SpicinessEnum.NOT;

/**
 * @Project: JavaStudyDemo
 * @ClassName Burrito2
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-05 16:53
 **/
public class Burrito2 {

    SpicinessEnum degree;
    public Burrito2(SpicinessEnum degree) {
        this.degree = degree;
    }
    @Override
    public String toString() {
        return "Burrito is "+ degree;
    }
    public static void main(String[] args) {
        System.out.println(new Burrito2(NOT));
        System.out.println(new Burrito2(MEDIUM));
        System.out.println(new Burrito2(HOT));
    }

}
