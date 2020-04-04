package com.leospiritlee.base.arrays;

import java.util.Arrays;

import static com.leospiritlee.base.onjava.ArrayShow.show;

/**
 * @Project: JavaStudyDemo
 * @ClassName SimpleSetAll
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-04 12:55
 **/
public class SimpleSetAll {

    public static final int SZ = 8;
    static int val = 1;
    static char[] chars = "abcdefghijklmnopqrstuvwxyz"
            .toCharArray();

    static char getChar(int n) { return chars[n]; }

    public static void main(String[] args) {
        int[] ia = new int[SZ];
        long[] la = new long[SZ];
        double[] da = new double[SZ];
        /**
         * 这里，我们只是将数组索引作为值插入数组。
         * 这将自动转化为 long 和 double 版本。
         */
        Arrays.setAll(ia, n -> n); // [1]
        Arrays.setAll(la, n -> n);
        Arrays.setAll(da, n -> n);
        show(ia);
        show(la);
        show(da);

        /**
         * 这个函数只需要接受索引就能产生正确结果。
         * 这个，我们忽略索引值并且使用 val 生成结果。
         */
        Arrays.setAll(ia, n -> val++); // [2]
        Arrays.setAll(la, n -> val++);
        Arrays.setAll(da, n -> val++);
        show(ia);
        show(la);
        show(da);

        Bob[] ba = new Bob[SZ];
        /**
         * 方法引用有效，因为 Bob 的构造器接收一个 int 参数。只要我们传递的函数接收一个 int 参数且能产生正确的结果，就认为它完成了工作。
         */
        Arrays.setAll(ba, Bob::new); // [3]
        show(ba);

        Character[] ca = new Character[26];
        /**
         * 为了处理除了 int ，long ，double 之外的基元类型，请为基元创建包装类的数组。
         * 然后使用 setAll() 的泛型版本。请注意，getChar（） 生成基元类型，因此这是自动装箱到 Character 。
         */
        Arrays.setAll(ca, SimpleSetAll::getChar); // [4]
        show(ca);
    }

}


class Bob {
    final int id;
    Bob(int n) { id = n; }
    @Override
    public String toString() { return "Bob" + id; }
}
