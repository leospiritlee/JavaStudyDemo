package com.leospiritlee.base.enums;


import java.util.Random;
import java.util.function.Supplier;

/**
 * @Project: JavaStudyDemo
 * @ClassName EnumImplementation
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-06 16:45
 **/
public class EnumImplementation {

    public static <T> void printNext(Supplier<T> rg) {
        System.out.print(rg.get() + ", ");
    }
    public static void main(String[] args) {
        // Choose any instance:
        CartoonCharacter cc = CartoonCharacter.BOB;
        for(int i = 0; i < 10; i++){
            printNext(cc);
        }

    }

}


enum CartoonCharacter implements Supplier<CartoonCharacter> {
    SLAPPY, SPANKY, PUNCHY,
    SILLY, BOUNCY, NUTTY, BOB;
    private Random rand =
            new Random(47);
    @Override
    public CartoonCharacter get() {
        return values()[rand.nextInt(values().length)];
    }
}