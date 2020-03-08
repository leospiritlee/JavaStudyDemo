package com.leospiritlee.base.functional;

/**
 * @Project: JavaStudyDemo
 * @ClassName RunnableMethodReference
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-08 12:20
 **/
public class RunnableMethodReference {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            public void run() {
                System.out.println("Anonymous");
            }
        }).start();

        new Thread(
                () -> System.out.println("lambda")
        ).start();

        new Thread(Go::go).start();
    }


    private void testThread(){

        new Thread(Go::go).start();

        new Thread(
                ()->System.out.println("testLambda")
        ).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("test Runnable");
            }
        }).start();
    }

}


class Go {
    static void go() {
        System.out.println("Go::go()");
    }
}
