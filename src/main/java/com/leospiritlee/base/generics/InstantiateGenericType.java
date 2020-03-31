package com.leospiritlee.base.generics;

import java.util.ArrayList;
import java.util.function.Supplier;

/**
 * @Project: JavaStudyDemo
 * @ClassName InstantiateGenericType
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-31 11:16
 **/
public class InstantiateGenericType {

    public static void main(String[] args) {
        ClassAsFactory<Employee> fe = new ClassAsFactory<>(Employee.class);
        System.out.println(fe.get());

        ClassAsFactory<Integer> fi = new ClassAsFactory<>(Integer.class);
        try {
            System.out.println(fi.get());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        ClassAsFactory<ArrayList> fl = new ClassAsFactory<>(ArrayList.class);
        try {
            System.out.println(fl.get());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}



class ClassAsFactory<T> implements Supplier<T> {
    Class<T> kind;

    ClassAsFactory(Class<T> kind) {
        this.kind = kind;
    }

    @Override
    public T get() {
        try {
            return kind.newInstance();
        } catch (InstantiationException |IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}

class Employee {
    @Override
    public String toString() {
        return "Employee";
    }
}