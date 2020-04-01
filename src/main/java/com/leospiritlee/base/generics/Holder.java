package com.leospiritlee.base.generics;

import java.util.Objects;

/**
 * @Project: JavaStudyDemo
 * @ClassName Holder
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-01 20:37
 **/
public class Holder<T> {

    private T value;

    public Holder() {}

    public Holder(T val) {
        value = val;
    }

    public void set(T val) {
        value = val;
    }

    public T get() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
//        System.out.println(o instanceof  Holder);
//        System.out.println(Objects.equals(value, ((Holder) o).value));
        return o instanceof Holder && Objects.equals(value, ((Holder) o).value);
    }




    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    public static void main(String[] args) {
        Holder<Apple> apple = new Holder<>(new Apple());
        Apple d = apple.get();
        apple.set(d);
//        Holder<Fruit> fruit = apple; // Cannot upcast
        Holder<? extends Fruit> fruit = apple; // OK
        Fruit p = fruit.get();
        d = (Apple) fruit.get();
        try {
            Orange c = (Orange) fruit.get(); // No warning
        } catch (Exception e) {
            System.out.println(e);
        }
//        fruit.set(new Apple()); // Cannot call set()
//        fruit.set(new Fruit()); // Cannot call set()
        System.out.println(fruit.equals(d)); // OK
    }
}
