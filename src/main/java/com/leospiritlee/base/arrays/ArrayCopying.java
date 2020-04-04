package com.leospiritlee.base.arrays;

import com.leospiritlee.base.onjava.Count;

import java.util.Arrays;

import static com.leospiritlee.base.onjava.ArrayShow.show;

/**
 * @Project: JavaStudyDemo
 * @ClassName ArrayCopying
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-04 19:20
 **/
public class ArrayCopying {

    public static final int SZ = 15;

    public static void main(String[] args) {
        int[] a1 = new int[SZ];
        Arrays.setAll(a1, new Count.Integer()::get);
        show("a1", a1);

        //完整复制 a1 的值 到a2
        /**
         *  这是复制的基本方法;只需给出返回的复制数组的大小。
         */
        int[] a2 = Arrays.copyOf(a1, a1.length); // [1]
        // Prove they are distinct arrays:
        //替换a1中的每个值为 1
        Arrays.fill(a1, 1);
        show("a1", a1);
        show("a2", a2);

        // Create a shorter result:
        //复制一半a2的值到 a2
        /**
         * 通过更改最后一个参数，我们可以缩短或延长返回的复制数组
         */
        a2 = Arrays.copyOf(a2, a2.length / 2); // [2]
        show("a2", a2);
        // Allocate more space:
        //复制a2的值到 + 长度 5 （默认 0） a2
        a2 = Arrays.copyOf(a2, a2.length + 5);
        show("a2", a2);
        // Also copies wrapped arrays:
        /**
         * copyOf() 和 copyOfRange() 也可以使用包装类型。
         * copyOfRange() 需要一个开始和结束索引。
         */
        Integer[] a3 = new Integer[SZ]; // [3]
        Arrays.setAll(a3, new Count.Integer()::get);
        show("a3", a3);
        //复制a3的值 从 下标4 <= 值  < 12 到 a4
        Integer[] a4 = Arrays.copyOfRange(a3, 4, 12);
        show("a4", a4);

        //长度7
        Sub[] d = new Sub[SZ / 2];
        Arrays.setAll(d, Sub::new); // Produce Sup[] from Sub[]:
        /**
         *  copyOf() 和 copyOfRange() 都有一个版本，该版本通过在方法调用的末尾添加目标类型来创建不同类型的数组。
         *  我首先想到的是，这可能是一种从原生数组生成包装数组的方法，反之亦然。
         *  但这没用。它的实际用途是“向上转换”和“向下转换”数组。
         *  也就是说，如果您有一个子类型(派生类型)的数组，而
         *  您想要一个基类型的数组，那么这些方法将生成所需的数组。
         */
        Sup[] b = Arrays.copyOf(d, d.length, Sup[].class); // [4]
        show(b); // This "downcast" works fine:
        /**
         * 您甚至可以成功地“向下强制转换”，并从超类型的数组生成子类型的数组。
         * 这个版本运行良好，因为我们只是“upcast”。
         */
        Sub[] d2 = Arrays.copyOf(b, b.length, Sub[].class); // [5]
        show(d2); // Bad "downcast" compiles but throws exception:
        Sup[] b2 = new Sup[SZ / 2];
        Arrays.setAll(b2, Sup::new);
        try {
            /**
             * 这个“数组转换”将编译，但是如果类型不兼容，您将得到一个运行时异常。
             * 在这里，强制将基类型转换为派生类型是非法的，
             * 因为派生对象中可能有基对象中没有的属性和方法。
             */
            Sub[] d3 = Arrays.copyOf(b2, b2.length, Sub[].class); // [6]
        } catch (Exception e) {
            System.out.println(e);
        }

        Sup[] d4 = Arrays.copyOf(b2, b2.length, Sup[].class); // [6]
    }

}


class Sup {
    // Superclass
    private int id;

    Sup(int n) {
        id = n;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + id;
    }
}

class Sub extends Sup { // Subclass

    Sub(int n) {
        super(n);
    }
}