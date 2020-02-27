package com.leospiritlee.base.innerclasses;

/**
 * @Project: JavaStudyDemo
 * @ClassName Callbacks
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-27 09:51
 **/
public class Callbacks {

    /**
     * output:
     *
     * MyIncrement.f(c2);
     *  Other operation
     *  1
     *
     * caller1.go()
     *  1
     *
     * caller1.go()
     *  2
     *
     * caller2.go();
     *  Other operation
     *  2
     *
     * caller2.go();
     *  Other operation
     *  3
     *
     * @param args
     */
    public static void main(String[] args) {
        Callee1 c1 = new Callee1();
        Callee2 c2 = new Callee2();

        //invoke Callee2 increment
            // super.increment  Other operation
            // 0++ = 1
        MyIncrement.f(c2);

        //injection Callee1 to Caller
        Caller caller1 = new Caller(c1);

        //invoke Callee1 increment
        //0++ = 1
        caller1.go();
        //invoke Callee1 increment
        //1++ = 2
        caller1.go();

        //injection Callee2 to Caller inner class Closure
        Caller caller2 =
                new Caller(c2.getCallbackReference());

        //invoke Callee2.Closure increment
        //super.increment  Other operation
        //1++ = 2
        caller2.go();
        //invoke Callee2.Closure increment
        //super.increment  Other operation
        //2++ = 3
        caller2.go();
    }

}

interface Incrementable {
    void increment();
}

// Very simple to just implement the interface:
class Callee1 implements Incrementable {
    private int i = 0;
    @Override
    public void increment() {
        i++;
        System.out.println(i);
    }
}

/**
 * how to use invoke derived class
 */
class MyIncrement {

    public void increment() {
        System.out.println("Other operation");
    }

    static void f(MyIncrement mi) {
        mi.increment();
    }
}

// If your class must implement increment() in
// some other way, you must use an inner class:
class Callee2 extends MyIncrement {

    private int i = 0;

    @Override
    public void increment() {
        super.increment();
        i++;
        System.out.println(i);
    }

    //private inner class
    private class Closure implements Incrementable {

        @Override
        public void increment() {
            // Specify outer-class method, otherwise
            // you'll get an infinite recursion:
            Callee2.this.increment();
        }
    }

    /**
     * create a method how to use the inner class
     * @return interface  base class
     */
    Incrementable getCallbackReference() {
        return new Closure();
    }
}

/**
 *  how to use invoke implement impl
 */
class Caller {

    private Incrementable callbackReference;

    /**
     * injection interface derived class
     * @param cbh
     */
    Caller(Incrementable cbh) {
        callbackReference = cbh;
    }

    void go() {
        callbackReference.increment();
    }
}