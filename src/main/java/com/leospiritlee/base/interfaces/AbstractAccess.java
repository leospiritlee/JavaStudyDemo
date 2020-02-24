package com.leospiritlee.base.interfaces;

/**
 * @Project: JavaStudyDemo
 * @ClassName AbstractAccess
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-24 14:21
 **/
abstract  class AbstractAccess {

    private void m1() {}

    // private abstract void m1a(); // illegal

    protected void m2() {}

    protected abstract void m2a();

    void m3() {}

    abstract void m3a();

    public void m4() {}

    public abstract void m4a();
}
