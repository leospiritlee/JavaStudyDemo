package com.leospiritlee.base.collections;

import java.util.Map;

/**
 * @Project: JavaStudyDemo
 * @ClassName EnvironmentVariables
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-02 14:34
 **/
public class EnvironmentVariables {

    public static void main(String[] args) {

        Map<String, String> systemMap = System.getenv();

        for(Map.Entry entry: systemMap.entrySet()) {
            System.out.println(entry.getKey() + ": " +
                    entry.getValue());
        }

        System.out.println("----------------------------");

        for(String key: systemMap.keySet()){
            System.out.println(key + ": " +
                    systemMap.get(key));
        }
    }

}
