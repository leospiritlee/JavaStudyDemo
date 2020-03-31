package com.leospiritlee.base.generics;

/**
 * @Project: JavaStudyDemo
 * @ClassName SimpleHolder
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-31 11:02
 **/
public class SimpleHolder {

    private Object obj;

    public void set(Object obj) {
        this.obj = obj;
    }

    public Object get() {
        return obj;
    }

    public static void main(String[] args) {
        SimpleHolder holder = new SimpleHolder();
        holder.set("Item");
        String s = (String) holder.get();
        System.out.println(s);
    }

}
