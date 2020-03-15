package com.leospiritlee.base.exceptions;

/**
 * @Project: JavaStudyDemo
 * @ClassName Human
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-15 20:33
 **/
public class Human {

    public static void main(String[] args) {
        // Catch the exact type:
        try {
            throw new Sneeze();
        } catch(Sneeze s) {
            System.out.println("Caught Sneeze");
        } catch(Annoyance a) {
            System.out.println("Caught Annoyance");
        }
        // Catch the base type:
        try {
            throw new Sneeze();
        } catch(Annoyance a) {
            System.out.println("Caught Annoyance2");
        }
    }

}


class Annoyance extends Exception {}
class Sneeze extends Annoyance {}