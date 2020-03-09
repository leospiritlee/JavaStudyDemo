package com.leospiritlee.base.functional;

import javax.swing.text.html.StyleSheet;
import java.util.function.IntSupplier;

/**
 * @Project: JavaStudyDemo
 * @ClassName AnonymousClosure
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-09 22:31
 **/
public class AnonymousClosure {

    IntSupplier makeFun(int x) {
        int i = 0;
        // 同样规则的应用:
        // i++; // 非等同 final 效果
        // x++; // 同上
        return new IntSupplier() {
            public int getAsInt() { return x + i; }
        };
    }

    IntSupplier makeFun2(int x){
        int i = 0;
        return ()-> x + i;
    }


    public static void main(String[] args) {
        AnonymousClosure anonymousClosure = new AnonymousClosure();
        int result = anonymousClosure.makeFun(1).getAsInt();
        System.out.println(result);
        int result2 = anonymousClosure.makeFun2(1).getAsInt();
        System.out.println(result2);
    }

}
