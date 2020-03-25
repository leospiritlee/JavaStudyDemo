package com.leospiritlee.base.strings;

/**
 * @Project: JavaStudyDemo
 * @ClassName WhitherStringBuilder
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-25 20:01
 **/
public class WhitherStringBuilder {

    public String implicit(String[] fields) {
        String result = "";
        for(String field : fields) {
            result += field;
        }
        return result;
    }
    public String explicit(String[] fields) {
        StringBuilder result = new StringBuilder();
        for(String field : fields) {
            result.append(field);
        }
        return result.toString();
    }

}
