package com.leospiritlee.base.enums;

import java.util.EnumMap;
import java.util.Map;

import static com.leospiritlee.base.enums.AlarmPoints.*;

/**
 * @Project: JavaStudyDemo
 * @ClassName EnumMaps
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-06 21:03
 **/
public class EnumMaps {

    public static void main(String[] args) {
        EnumMap<AlarmPoints,Command> em =   new EnumMap<>(AlarmPoints.class);
        em.put(KITCHEN,  () -> System.out.println("Kitchen fire!"));
        em.put(BATHROOM, () -> System.out.println("Bathroom alert!"));
        for(Map.Entry<AlarmPoints,Command> e:   em.entrySet()) {
            System.out.print(e.getKey() + ": ");
            e.getValue().action();
        }
        try { // If there's no value for a particular key:
            em.get(UTILITY).action();
        } catch(Exception e) {
            System.out.println("Expected: " + e);
        }
    }

}


interface Command { void action(); }