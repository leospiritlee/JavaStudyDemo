package com.leospiritlee.base.validating;

/**
 * @Project: JavaStudyDemo
 * @ClassName LoaderAssertions
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-23 21:43
 **/
public class LoaderAssertions {


//    static {
//        boolean assertionsEnabled = false;
//        // Note intentional side effect of assignment:
//        assert assertionsEnabled = true;
//        if(!assertionsEnabled)
//            throw new RuntimeException("Assertions disabled");
//    }

    public static void main(String[] args) {
        ClassLoader.getSystemClassLoader().setDefaultAssertionStatus(true);
        new Loaded().go();
    }

}

class Loaded {
    public void go() {
        assert true: "Loaded.go()";
        assert false: "Loaded.go()";
    }
}
