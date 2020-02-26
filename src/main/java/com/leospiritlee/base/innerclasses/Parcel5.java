package com.leospiritlee.base.innerclasses;

/**
 * @Project: JavaStudyDemo
 * @ClassName Parcel5
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-26 10:39
 **/

/**
 * 一个定义在方法中的类。
 * 一个定义在作用域内的类，此作用域在方法的内部。
 * 一个实现了接口的匿名类。
 * 一个匿名类，它扩展了没有默认构造器的类。
 * 一个匿名类，它执行字段初始化。
 * 一个匿名类，它通过实例初始化实现构造（匿名内部类不可能有构造器）。
 */
public class Parcel5 {

    public Destination destination(String s) {
        final class PDestination implements Destination {
            private String label;

            private PDestination(String whereTo) {
                label = whereTo;
            }

            @Override
            public String readLabel() { return label; }
        }
        return new PDestination(s);
    }


    public Contents contents(int value){
        final class PContents implements Contents{

            private int val;

            private PContents(int val) {
                this.val = val;
            }

            @Override
            public int value() {
                return val;
            }
        }

        return new PContents(value);
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Tasmania");
        System.out.println(d.readLabel());

        Contents c = p.contents(1);
        System.out.println(c.value());

    }

}
