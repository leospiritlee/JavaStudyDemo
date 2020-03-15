package com.leospiritlee.base.exceptions;

/**
 * @Project: JavaStudyDemo
 * @ClassName ConstructorException
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-15 20:27
 **/
public class ConstructorException {

    public static void main(String[] args) {
        try(
                First f = new First();
                SecondExcept s = new SecondExcept();
                Second s2 = new Second()
        ) {
            System.out.println("In body");
        } catch(CE e) {
            System.out.println("Caught: " + e);
        }
    }

}


class CE extends Exception {}
class SecondExcept extends Reporter {
    SecondExcept() throws CE {
        super();
        throw new CE();
    }
}