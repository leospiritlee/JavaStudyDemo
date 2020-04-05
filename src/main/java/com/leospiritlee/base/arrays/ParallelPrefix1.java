package com.leospiritlee.base.arrays;

import com.leospiritlee.base.onjava.Count;

import java.util.Arrays;
import java.util.stream.IntStream;

import static com.leospiritlee.base.onjava.ArrayShow.show;

/**
 * @Project: JavaStudyDemo
 * @ClassName ParallelPrefix1
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-05 11:49
 **/
public class ParallelPrefix1 {

    public static void main(String[] args) {
        int[] nums = new Count.Pint().array(10);
        show(nums);
        //求和
        System.out.println(Arrays.stream(nums).reduce(Integer::sum).getAsInt());

        Arrays.parallelPrefix(nums, Integer::sum);

        show(nums);

        System.out.println(Arrays.stream(new Count.Pint().array(6)).reduce(Integer::sum).getAsInt());
    }
}
