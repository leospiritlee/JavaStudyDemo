package com.leospiritlee.base.enums;

import java.util.*;
import java.text.*;

/**
 * @Project: JavaStudyDemo
 * @ClassName ConstantSpecificMethod
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-06 21:06
 **/
public enum  ConstantSpecificMethod {

    DATE_TIME {
        @Override
        String getInfo() {
            return
                    DateFormat.getDateInstance()
                            .format(new Date());
        }
    },
    CLASSPATH {
        @Override
        String getInfo() {
            return System.getenv("Path");//.keySet().toString();
        }
    },
    VERSION {
        @Override
        String getInfo() {
            return System.getProperty("java.version");
        }
    };
    abstract String getInfo();
    public static void main(String[] args) {
        for(ConstantSpecificMethod csm : values()){
            System.out.println(csm.getInfo());
        }

    }



}
