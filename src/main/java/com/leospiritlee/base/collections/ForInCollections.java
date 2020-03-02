package com.leospiritlee.base.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * @Project: JavaStudyDemo
 * @ClassName ForInCollections
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-02 14:28
 **/
public class ForInCollections {

    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<>();
        Collections.addAll(cs,
                "Take the long way home".split(" "));
        for(String s : cs)
            System.out.println("'" + s + "' ");
    }
}
