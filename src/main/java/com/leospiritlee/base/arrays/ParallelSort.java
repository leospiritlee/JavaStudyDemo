package com.leospiritlee.base.arrays;

import com.leospiritlee.base.onjava.Rand;
import org.openjdk.jmh.annotations.*;

import java.util.Arrays;

/**
 * @Project: JavaStudyDemo
 * @ClassName ParallelSort
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-05 11:39
 **/

@State(Scope.Thread)
public class ParallelSort {

    private long[] la;

    @Setup
    public void setup() {
        la = new Rand.Plong().array(100_000);
    }

    @Benchmark
    public void sort() {
        Arrays.sort(la);
    }

    @Benchmark
    public void parallelSort() {
        Arrays.parallelSort(la);
    }

}
