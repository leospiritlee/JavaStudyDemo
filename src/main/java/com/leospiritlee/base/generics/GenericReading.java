package com.leospiritlee.base.generics;

import java.util.Arrays;
import java.util.List;

/**
 * @Project: JavaStudyDemo
 * @ClassName GenericReading
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-01 20:49
 **/
public class GenericReading {

    static List<Apple> apples = Arrays.asList(new Apple());
    static List<Fruit> fruit = Arrays.asList(new Fruit());

    static <T> T readExact(List<T> list) {
        return list.get(0);
    }

    // A static method adapts to each call:
    static void f1() {
        Apple a = readExact(apples);
        System.out.println("a:" + a);
        Fruit f = readExact(fruit);
        System.out.println("f:" + f);
        f = readExact(apples);
        System.out.println("f2:" + f);
    }

    // A class type is established
    // when the class is instantiated:
    static class Reader<T> {
        T readExact(List<T> list) {
            return list.get(0);
        }
    }

    static void f2() {
        Reader<Fruit> fruitReader = new Reader<>();
        Fruit f = fruitReader.readExact(fruit);
        System.out.println("f:" + f);
        //- Fruit a = fruitReader.readExact(apples);
        // error: incompatible types: List<Apple>
        // cannot be converted to List<Fruit>
    }

    static class CovariantReader<T> {
        T readCovariant(List<? extends T> list) {
            return list.get(0);
        }
    }

    static void f3() {
        CovariantReader<Fruit> fruitReader = new CovariantReader<>();
        Fruit f = fruitReader.readCovariant(fruit);
        System.out.println("f:" + f);
        Fruit a = fruitReader.readCovariant(apples);
        System.out.println("a:" + a);
    }

    public static void main(String[] args) {
        f1();
        f2();
        f3();
    }

}
