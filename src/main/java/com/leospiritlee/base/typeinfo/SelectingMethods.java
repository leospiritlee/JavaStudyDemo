package com.leospiritlee.base.typeinfo;

import java.lang.reflect.Proxy;

/**
 * @Project: JavaStudyDemo
 * @ClassName SelectingMethods
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-27 15:15
 **/
public class SelectingMethods {

    public static void main(String[] args) {
        SomeMethods proxy =
                (SomeMethods) Proxy.newProxyInstance(
                        SomeMethods.class.getClassLoader(),
                        new Class[]{SomeMethods.class},
                        new MethodSelector(new Implementation()));
        proxy.boring1();
        proxy.boring2();
        proxy.interesting("bonobo");
        proxy.boring3();
    }

}
