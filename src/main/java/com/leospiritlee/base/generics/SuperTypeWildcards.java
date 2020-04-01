package com.leospiritlee.base.generics;

import java.util.List;

/**
 * @Project: JavaStudyDemo
 * @ClassName SuperTypeWildcards
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-01 20:46
 **/
public class SuperTypeWildcards {

    static void writeTo(List<? super Apple> apples) {
        apples.add(new Apple());
        apples.add(new Jonathan());
        // apples.add(new Fruit()); // Error
    }

}
