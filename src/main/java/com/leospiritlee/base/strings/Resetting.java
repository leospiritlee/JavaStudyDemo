package com.leospiritlee.base.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Project: JavaStudyDemo
 * @ClassName Resetting
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-25 22:16
 **/
public class Resetting {

    public static void main(String[] args) throws Exception {
        Matcher m = Pattern.compile("[frb][aiu][gx]")
                .matcher("fix the rug with bags");
        while(m.find())
            System.out.print(m.group() + " ");
        System.out.println();
        m.reset("fix the rig with rags");
        while(m.find())
            System.out.print(m.group() + " ");
    }

}
