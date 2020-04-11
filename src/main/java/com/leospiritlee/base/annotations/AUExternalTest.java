package com.leospiritlee.base.annotations;

/**
 * @Project: JavaStudyDemo
 * @ClassName AUExternalTest
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-11 19:48
 **/
public class AUExternalTest extends AtUnitExample1 {

    @Test
    boolean _MethodOne() {
        return methodOne().equals("This is methodOne");
    }
    @Test
    boolean _MethodTwo() {
        return methodTwo() == 2;
    }
}
