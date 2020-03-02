package com.leospiritlee.base.typeinfo;

/**
 * @Project: JavaStudyDemo
 * @ClassName SweetShop
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-02 16:51
 **/
public class SweetShop {

    public static void main(String[] args) {

        System.out.println("inside main");
        new Candy();
        System.out.println("After creating Candy");

        try {
            Class.forName("Gum");
        } catch(ClassNotFoundException e) {
            System.out.println("Couldn't find Gum");
        }

        /**
         *  loading depend full package and className
         */
        try {
            Class.forName("com.leospiritlee.base.typeinfo.Gum");
        } catch(ClassNotFoundException e) {
            System.out.println("Couldn't find com.leospiritlee.base.typeinfo.Gum");
        }


        System.out.println("After Class.forName(\"Gum\")");

        new Cookie();
        System.out.println("After creating Cookie");
    }

}


class Cookie {
    static { System.out.println("Loading Cookie"); }
}

class Gum {
    static { System.out.println("Loading Gum"); }
}

class Candy {
    static { System.out.println("Loading Candy"); }
}
