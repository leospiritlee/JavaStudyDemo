package com.leospiritlee.base.onjava;

import java.util.HashSet;
import java.util.Set;

/**
 * @Project: JavaStudyDemo
 * @ClassName Sets
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-30 21:46
 **/
public class Sets {

    /**
     * 返回一个包含两个参数并集的 Set
     * @param a
     * @param b
     * @param <T>
     * @return
     */
    public static <T> Set<T> union(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }

    /**
     * 返回一个包含两个参数集合交集的 Set
     * @param a
     * @param b
     * @param <T>
     * @return
     */
    public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<>(a);
        result.retainAll(b);
        return result;
    }

    // Subtract subset from superset:

    /**
     * difference() 从 superset 中减去 subset 的元素
     * @param superset
     * @param subset
     * @param <T>
     * @return
     */
    public static <T> Set<T> difference(Set<T> superset, Set<T> subset) {
        Set<T> result = new HashSet<>(superset);
        result.removeAll(subset);
        return result;
    }

    /**
     * 返回所有不在交集中的元素的 Set
     * @param a
     * @param b
     * @param <T>
     * @return
     */
    // Reflexive--everything not in the intersection:
    public static <T> Set<T> complement(Set<T> a, Set<T> b) {
        return difference(union(a, b), intersection(a, b));
    }

}
