package com.leospiritlee.base.annotations;

/**
 * @Project: JavaStudyDemo
 * @ClassName AUComposition
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-11 19:56
 **/
public class AUComposition {

    AtUnitExample1 testObject = new AtUnitExample1();
    @Test
    public boolean tMethodOne() {
        return testObject.methodOne()
                .equals("This is methodOne");
    }
    @Test
    boolean tMethodTwo() {
        return testObject.methodTwo() == 2;
    }

}
