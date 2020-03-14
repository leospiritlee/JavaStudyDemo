package com.leospiritlee.base.exceptions;

/**
 * @Project: JavaStudyDemo
 * @ClassName PreciseRethrow
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-14 21:07
 **/
public class PreciseRethrow {
    void catcher() throws DerivedException {
        try {
            throw new DerivedException();
        } catch(BaseException e) {
            throw e;
        }
    }

}

class BaseException extends Exception {}
class DerivedException extends BaseException {}
