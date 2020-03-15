package com.leospiritlee.base.exceptions;

/**
 * @Project: JavaStudyDemo
 * @ClassName ExceptionSilencer
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-15 16:25
 **/
public class ExceptionSilencer {

    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } finally {
            // Using 'return' inside the finally block
            // will silence any thrown exception.
            return;
        }
    }
}
