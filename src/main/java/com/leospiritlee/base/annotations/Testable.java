package com.leospiritlee.base.annotations;


/**
 * @Project: JavaStudyDemo
 * @ClassName Testable
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-11 16:59
 **/
public class Testable {


    public void execute() {
        System.out.println("Executing..");
    }
    @Test
    void testExecute() { execute(); }
}
