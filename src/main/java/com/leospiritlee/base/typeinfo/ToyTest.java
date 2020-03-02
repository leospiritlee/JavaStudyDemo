package com.leospiritlee.base.typeinfo;

/**
 * @Project: JavaStudyDemo
 * @ClassName ToyTest
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-02 17:20
 **/
public class ToyTest {

    static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() +
                " is interface? [" + cc.isInterface() + "]");
        System.out.println(
                "Simple name: " + cc.getSimpleName());
        System.out.println(
                "Canonical name : " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("com.leospiritlee.base.typeinfo.FancyToy");
        } catch(ClassNotFoundException e) {
            System.out.println("Can't find FancyToy");
            System.exit(1);
        }

        printInfo(c);

        /**
         *  HasBatteries
         *  Waterproof
         *  Shoots
         */
        for(Class face : c.getInterfaces())
            printInfo(face);

        /**
         *  Toy
         */
        Class up = c.getSuperclass();
        Object obj = null;

        try {
            // Requires no-arg constructor:
            obj = up.newInstance();
        } catch(InstantiationException e) {
            System.out.println("Cannot instantiate");
            System.exit(1);
        } catch(IllegalAccessException e) {
            System.out.println("Cannot access");
            System.exit(1);
        }

        printInfo(obj.getClass());
    }

}



interface HasBatteries {}
interface Waterproof {}
interface Shoots {}

class Toy {
    // 注释下面的无参数构造器会引起 NoSuchMethodError 错误
    Toy() {}
    Toy(int i) {}
}

class FancyToy extends Toy
        implements HasBatteries, Waterproof, Shoots {
    FancyToy() { super(1); }
}
