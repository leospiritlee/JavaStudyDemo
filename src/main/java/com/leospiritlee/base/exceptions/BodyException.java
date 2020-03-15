package com.leospiritlee.base.exceptions;

/**
 * @Project: JavaStudyDemo
 * @ClassName BodyException
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-15 20:29
 **/
public class BodyException {

    public static void main(String[] args) {
        try(
                First f = new First();

        ) {
            System.out.println("In body");
            Second s2 = new Second();
            Third t = new Third();
            new SecondExcept();
            System.out.println("End of body");
        } catch(CE e) {
            System.out.println("Caught: " + e);
        }
    }

}


class Third extends Reporter {}