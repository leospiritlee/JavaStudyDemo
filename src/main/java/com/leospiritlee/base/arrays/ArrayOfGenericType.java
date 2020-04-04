package com.leospiritlee.base.arrays;

/**
 * @Project: JavaStudyDemo
 * @ClassName ArrayOfGenericType
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-04 11:30
 **/
public class ArrayOfGenericType<T> {
    T[] array; // OK
    @SuppressWarnings("unchecked")
    public ArrayOfGenericType(int size) {
        // error: generic array creation:
        //- array = new T[size];
        array = (T[])new Object[size]; // unchecked cast
    }
    // error: generic array creation:
    //- public <U> U[] makeArray() { return new U[10]; }
}