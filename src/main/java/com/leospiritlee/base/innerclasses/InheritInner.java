package com.leospiritlee.base.innerclasses;

public class InheritInner extends WithInner.Inner{

    //- InheritInner() {} // Won't compile
    InheritInner(WithInner wi) {
//        enclosingClassReference.super();
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }


}


class WithInner {
    class Inner {}
}