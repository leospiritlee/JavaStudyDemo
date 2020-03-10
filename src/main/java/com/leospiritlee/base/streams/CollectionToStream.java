package com.leospiritlee.base.streams;

import java.util.*;

/**
 * @Project: JavaStudyDemo
 * @ClassName CollectionToStream
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-10 21:40
 **/
public class CollectionToStream {

    public static void main(String[] args) {
        List<Bubble> bubbles = Arrays.asList(new Bubble(1), new Bubble(2), new Bubble(3));
        System.out.println(bubbles.stream()
                .mapToInt(b -> b.i)
                .sum());

        Set<String> w = new HashSet<>(Arrays.asList("It's a wonderful day for pie!".split(" ")));
        w.stream()
                .map(x -> x + " ")
                .forEach(System.out::print);
        System.out.println();

        Map<String, Double> m = new HashMap<>();
        m.put("pi", 3.14159);
        m.put("e", 2.718);
        m.put("phi", 1.618);
        m.entrySet().stream()
                .map(e -> e.getKey() + ": " + e.getValue())
                .forEach(System.out::println);
        System.out.println();

        List<Bubble> bubbleList = Arrays.asList(new Bubble(5), new Bubble(2), new Bubble(3));
        bubbleList.stream().mapToInt(
                b -> b.i
        ).sorted().forEach(System.out::println);

        System.out.println();

        Set<String> strings = new HashSet<>(Arrays.asList("It's a wonderful day for pie!".split(" ")));
        strings.stream().map(
                x -> x + ", "
        ).forEach(System.out::print);

        System.out.println();

        Map<String, Double> mMap = new HashMap<>();
        mMap.put("pi", 3.14159);
        mMap.put("e", 2.718);
        mMap.put("phi", 1.618);


        mMap.forEach((key, value) ->{
            System.out.println(key + "-----" +value);
        });

    }

}
