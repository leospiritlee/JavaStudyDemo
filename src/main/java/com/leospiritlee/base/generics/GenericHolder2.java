package com.leospiritlee.base.generics;

/**
 * @Project: JavaStudyDemo
 * @ClassName GenericHolder2
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-31 11:05
 **/
public class GenericHolder2<T> {
    private T obj;

    public void set(T obj) {
        this.obj = obj;
    }

    public T get() {
        return obj;
    }

    public static void main(String[] args) {
        GenericHolder2<String> holder =  new GenericHolder2<>();
        holder.set("Item");
        String s = holder.get();
        System.out.println(s);
    }
}
