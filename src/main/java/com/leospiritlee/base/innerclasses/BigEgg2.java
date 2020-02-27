package com.leospiritlee.base.innerclasses;

public class BigEgg2 extends Egg2{

    public class Yolk extends Egg2.Yolk {
        public Yolk() {
            System.out.println("BigEgg2.Yolk()");
        }

        @Override
        public void f() {
            System.out.println("BigEgg2.Yolk.f()");
        }
    }

    public BigEgg2() { insertYolk(new Yolk()); }

    /**
     * 1. invoke Egg2 inner class Yolk constructor
     *          Egg2.Yolk()
     * 2. invoke Egg2 constructor
     *          New Egg2()
     * 3. invoke BigEgg2 constructor
     *      3.1 invoke BigEgg2 inner class Yolk constructor
     *              Egg2.Yolk()
     *      3.2 injection BigEgg2 Yolk to Egg2
     *              BigEgg2.Yolk()
     *      3.3 update Egg2 inner class Yolk quote direction to BigEgg2 inner class Yolk
     *      3.4 invoke super g() -> Egg2.Yolk.f()
     *          actual invoke BigEgg2.Yolk.f()
     *              BigEgg2.Yolk.f()
     * @param args
     */
    public static void main(String[] args) {
        Egg2 e2 = new BigEgg2();
        e2.g();
    }
}

class Egg2 {
    protected class Yolk {
        public Yolk() {
            System.out.println("Egg2.Yolk()");
        }
        public void f() {
            System.out.println("Egg2.Yolk.f()");
        }
    }
    private Yolk y = new Yolk();
    Egg2() { System.out.println("New Egg2()"); }
    public void insertYolk(Yolk yy) { y = yy; }
    public void g() { y.f(); }
}
