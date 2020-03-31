package com.leospiritlee.base.generics;

/**
 * @Project: JavaStudyDemo
 * @ClassName GenericWithCreate
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-31 11:30
 **/
public abstract class GenericWithCreate<T> {
    final T element;

    GenericWithCreate() {
        element = create();
    }

    abstract T create();
}

class X {
}

/**
 *  泛型 T 指向了 class X
 */
class XCreator extends GenericWithCreate<X> {
    @Override
    X create() {
        return new X();
    }

    void f() {
        System.out.println(element.getClass().getSimpleName());
    }
}
