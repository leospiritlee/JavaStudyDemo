package com.leospiritlee.base.streams;

import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

/**
 * @Project: JavaStudyDemo
 * @ClassName Signal
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-12 22:20
 **/
public class Signal {

    private final String msg;
    public Signal(String msg) { this.msg = msg; }
    public String getMsg() { return msg; }
    @Override
    public String toString() {
        return "Signal(" + msg + ")";
    }
    static Random rand = new Random(47);
    public static Signal morse() {
        switch(rand.nextInt(4)) {
            case 1: return new Signal("dot");
            case 2: return new Signal("dash");
            default: return null;
        }
    }
    public static Stream<Optional<Signal>> stream() {
        return Stream.generate(Signal::morse)
                .map(signal -> Optional.ofNullable(signal));
    }

}
