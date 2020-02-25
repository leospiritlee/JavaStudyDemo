package com.leospiritlee.base.innerclasses;

/**
 * @Project: JavaStudyDemo
 * @ClassName DotNew
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-25 21:11
 **/
public class DotNew {

    public class Inner {
        public Inner() {
            System.out.println("DotNew Inner");
        }
    }
    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();

        DotNew.Inner inner = dn.new Inner();

    }

}
