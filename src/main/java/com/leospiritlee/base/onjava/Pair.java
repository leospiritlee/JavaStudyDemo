package com.leospiritlee.base.onjava;

/**
 * @Project: JavaStudyDemo
 * @ClassName Pair
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-04 12:22
 **/
public class Pair<K, V> {
    public final K key;
    public final V value;
    public Pair(K k, V v) {
        key = k;
        value = v;
    }
    public K key() { return key; }
    public V value() { return value; }
    public static <K,V> Pair<K, V> make(K k, V v) {
        return new Pair<K,V>(k, v);
    }
}
