package com.leospiritlee.base.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Project: JavaStudyDemo
 * @ClassName TestRegularExpression
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-25 21:39
 **/
public class TestRegularExpression {

    public static void main(String[] args) {
        if(args.length < 2) {
            System.out.println(
                    "Usage:\njava TestRegularExpression " +
                            "characterSequence regularExpression+");
            System.exit(0);
        }
        System.out.println("Input: \"" + args[0] + "\"");
        for(String arg : args) {
            System.out.println(
                    "Regular expression: \"" + arg + "\"");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(args[0]);
            while(m.find()) {
                System.out.println(
                        "Match \"" + m.group() + "\" at positions " +
                                m.start() + "-" + (m.end() - 1));
            }
        }
    }

}
