package com.leospiritlee.base.typeinfo;

import java.lang.reflect.Proxy;

/**
 * @Project: JavaStudyDemo
 * @ClassName SimpleDynamicProxy
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-26 22:01
 **/
public class SimpleDynamicProxy {

    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);
        // Insert a proxy and call again:
        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[]{Interface.class},
                new DynamicProxyHandler(real));
        consumer(proxy);
    }

}
