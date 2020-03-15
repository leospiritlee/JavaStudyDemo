package com.leospiritlee.base.exceptions;

/**
 * @Project: JavaStudyDemo
 * @ClassName LostMessage
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-15 16:20
 **/
public class LostMessage {

    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }
    void dispose() throws HoHumException {
        throw new HoHumException();
    }
    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            } finally {
                lm.dispose();
            }
        } catch(VeryImportantException | HoHumException e) {
            System.out.println(e);
        }
    }

}

class VeryImportantException extends Exception {
    @Override
    public String toString() {
        return "A very important exception!";
    }
}
class HoHumException extends Exception {
    @Override
    public String toString() {
        return "A trivial exception";
    }
}
