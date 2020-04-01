package com.leospiritlee.base.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: JavaStudyDemo
 * @ClassName GenericsAndCovariance
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-01 20:17
 **/
public class GenericsAndCovariance {

    public static void main(String[] args) {
        // Wildcards allow covariance:
        List<? extends Fruit> flist = new ArrayList<>();
        // Compile Error: can't add any type of object:
        // flist.add(new Apple());
        // flist.add(new Fruit());
        // flist.add(new Object());
        flist.add(null); // Legal but uninteresting
        // We know it returns at least Fruit:
        Fruit f = flist.get(0);
    }
}
