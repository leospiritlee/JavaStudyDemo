package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName StaticSuper
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-22 17:40
 **/
public class StaticSuper {

    public static String staticGet() {
        return "Base staticGet()";
    }

    public String dynamicGet() {
        return "Base dynamicGet()";
    }

}

class StaticSub extends StaticSuper {

    public static String staticGet() {
        return "Derived staticGet()";
    }
    @Override
    public String dynamicGet() {
        return "Derived dynamicGet()";
    }
}
