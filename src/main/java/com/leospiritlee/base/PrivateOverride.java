package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName PrivateOverride
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-22 17:31
 **/
public class PrivateOverride {

    private void f() {
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }
}


