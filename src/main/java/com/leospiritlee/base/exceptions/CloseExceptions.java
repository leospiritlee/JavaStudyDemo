package com.leospiritlee.base.exceptions;

/**
 * @Project: JavaStudyDemo
 * @ClassName CloseExceptions
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-15 20:31
 **/
public class CloseExceptions {

    public static void main(String[] args) {
        try(
                First f = new First();
                Closer c = new Closer();
                Second s = new Second()
        ) {
            System.out.println("In body");
        } catch(CloseException e) {
            System.out.println("Caught: " + e);
        }
    }

}

class CloseException extends Exception {}
class Reporter2 implements AutoCloseable {
    String name = getClass().getSimpleName();
    Reporter2() {
        System.out.println("Creating " + name);
    }
    public void close() throws CloseException {
        System.out.println("Closing " + name);
    }
}
class Closer extends Reporter2 {
    @Override
    public void close() throws CloseException {
        super.close();
        throw new CloseException();
    }
}