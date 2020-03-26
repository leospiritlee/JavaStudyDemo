package com.leospiritlee.base.typeinfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Project: JavaStudyDemo
 * @ClassName DynamicProxyHandler
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-26 22:00
 **/
public class DynamicProxyHandler implements InvocationHandler {

    private Object proxied;

    DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("**** proxy: " + proxy.getClass() + ", method: " + method + ", args: " + args);
        if (args != null)
            for (Object arg : args)
                System.out.println("  " + arg);
        return method.invoke(proxied, args);
    }
}
