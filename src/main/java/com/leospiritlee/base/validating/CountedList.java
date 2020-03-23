package com.leospiritlee.base.validating;

import java.util.ArrayList;

/**
 * @Project: JavaStudyDemo
 * @ClassName CountedList
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-23 17:11
 **/
public class CountedList extends ArrayList<String> {

    private static int counter = 0;
    private int id = counter++;
    public CountedList() {
        System.out.println("CountedList #" + id);
    }
    public int getId() { return id; }

}
