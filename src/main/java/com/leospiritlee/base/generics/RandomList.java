package com.leospiritlee.base.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @Project: JavaStudyDemo
 * @ClassName RandomList
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-29 13:56
 **/
public class RandomList<T> extends ArrayList<T> {

    private Random rand = new Random(47);

    public T select() {
        int random = rand.nextInt(size());
        System.out.print(random);
        return get(random);
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();
        Arrays.stream("The quick brown fox jumped over the lazy brown dog".split(" ")).forEach(rs::add);


        System.out.println(rs);

        System.out.println("-----------");

        for(int i = 0; i< 11; i++){
            System.out.print(rs.select() + " ");
        }

        System.out.println("-----------");

        IntStream.range(0, 11).forEach(i ->
                System.out.print(rs.select() + " "));
    }

}
