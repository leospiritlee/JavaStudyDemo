package com.leospiritlee.base.onjava;

import com.leospiritlee.base.generics.Amphibian;
import com.leospiritlee.base.generics.Tuple4;
import com.leospiritlee.base.generics.TupleTest2;
import com.leospiritlee.base.generics.Vehicle;

import java.util.ArrayList;

/**
 * @Project: JavaStudyDemo
 * @ClassName TupleList
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-31 10:04
 **/
public class TupleList<A, B, C, D> extends ArrayList<Tuple4<A, B, C, D>> {

    public static void main(String[] args) {
        TupleList<Vehicle, Amphibian, String, Integer> tl =
                new TupleList<>();
        tl.add(TupleTest2.h());
        tl.add(TupleTest2.h());
        tl.forEach(System.out::println);
    }

}
