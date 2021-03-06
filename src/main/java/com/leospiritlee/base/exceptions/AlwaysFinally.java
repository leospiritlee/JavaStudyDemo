package com.leospiritlee.base.exceptions;

/**
 * @Project: JavaStudyDemo
 * @ClassName AlwaysFinally
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-15 16:12
 **/
public class AlwaysFinally {

    public static void main(String[] args) {
        System.out.println("Entering first try block");
        try {
            System.out.println("Entering second try block");
            try {
                throw new FourException();
            } finally {
                System.out.println("finally in 2nd try block");
            }
        } catch(FourException e) {
            System.out.println(
                    "Caught FourException in 1st try block");
        } finally {
            System.out.println("finally in 1st try block");
        }
    }
}
class FourException extends Exception {}