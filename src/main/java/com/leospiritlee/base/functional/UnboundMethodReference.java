package com.leospiritlee.base.functional;

/**
 * @Project: JavaStudyDemo
 * @ClassName UnboundMethodReference
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-08 12:57
 **/
public class UnboundMethodReference {

    public static void main(String[] args) {


        /**
         * 我们尝试把 X 的 f() 方法引用赋值给 MakeString。
         * 结果：即使 make() 与 f() 具有相同的签名，编译也会报“invalid method reference”（无效方法引用）错误。
         * 这是因为实际上还有另一个隐藏的参数：我们的老朋友 this。
         * 你不能在没有 X 对象的前提下调用 f()。
         * 因此，X :: f 表示未绑定的方法引用，因为它尚未“绑定”到对象。
         */
        // MakeString ms = X::f; // [1]
        TransformX sp = X::f;
        X x = new X();

        /**
         * output:
         *  X::f()
         *  X::f()
         */
        System.out.println(sp.transform(x)); // [2]
        System.out.println(x.f()); // 同等效果
    }

}


class X {
    String f() { return "X::f()"; }
}

interface MakeString {
    String make();
}

interface TransformX {
    String transform(X x);
}