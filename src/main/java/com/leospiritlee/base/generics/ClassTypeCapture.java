package com.leospiritlee.base.generics;

/**
 * @Project: JavaStudyDemo
 * @ClassName ClassTypeCapture
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-31 11:10
 **/
public class ClassTypeCapture<T> {
    Class<T> kind;

    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }

    public boolean f(Object arg) {
        /**
         *  arg 是否 是 kind 一个实例
         *  arg is an instance of this class
         */
        return kind.isInstance(arg);
    }

    public static void main(String[] args) {
        ClassTypeCapture<Building> ctt1 = new ClassTypeCapture<>(Building.class);
        System.out.println(ctt1.f(new Building())); //true
        System.out.println(ctt1.f(new House())); //true

        ClassTypeCapture<House> ctt2 =new ClassTypeCapture<>(House.class);
        System.out.println(ctt2.f(new Building())); //false
        System.out.println(ctt2.f(new House())); //true
    }
}


class Building {
}

class House extends Building {
}
