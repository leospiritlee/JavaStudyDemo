package com.leospiritlee.base.arrays;

import com.leospiritlee.base.onjava.Rand;

import java.util.Arrays;

import static com.leospiritlee.base.onjava.ArrayShow.show;

/**
 * @Project: JavaStudyDemo
 * @ClassName ModifyExisting
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-04 18:51
 **/
public class ModifyExisting {

    public static void main(String[] args) {
        double[] da = new double[7];
        Arrays.setAll(da, new Rand.Double()::get);
        show(da);
        Arrays.setAll(da, n -> da[n] / 100); // [1]
        show(da);

    }

}
