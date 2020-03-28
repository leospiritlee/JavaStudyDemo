package com.leospiritlee.base.generics;

/**
 * @Project: JavaStudyDemo
 * @ClassName ObjectHolder
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-28 10:09
 **/
public class ObjectHolder {


    private Object a;
    public ObjectHolder(Object a) { this.a = a; }
    public void set(Object a) { this.a = a; }
    public Object get() { return a; }

    public static void main(String[] args) {
        ObjectHolder h2 = new ObjectHolder(new Automobile());
        Automobile a = (Automobile)h2.get();
        h2.set("Not an Automobile");
        String s = (String)h2.get();
        h2.set(1); // 自动装箱为 Integer
        Integer x = (Integer)h2.get();
    }

}
