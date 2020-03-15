package com.leospiritlee.base.exceptions;

/**
 * @Project: JavaStudyDemo
 * @ClassName AutoCloseableDetails
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-15 20:07
 **/
public class AutoCloseableDetails {

    public static void main(String[] args) {
        try(
                Second s = new Second();
                First f = new First();

        ) {
        }
    }

}


class Reporter implements AutoCloseable {
    String name = getClass().getSimpleName();
    Reporter() {
        System.out.println("Creating " + name);
    }
    @Override
    public void close() {
        System.out.println("Closing " + name);
    }
}
class First extends Reporter {}
class Second extends Reporter {}
