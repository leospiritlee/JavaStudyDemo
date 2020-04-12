package com.leospiritlee.base.concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @Project: JavaStudyDemo
 * @ClassName CompletedMachina
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-12 14:07
 **/
public class CompletedMachina {

    public static void main(String[] args) {
        CompletableFuture<Machina> cf =
                CompletableFuture.completedFuture(
                        new Machina(0));
        try {
            Machina m = cf.get();  // Doesn't block
        } catch(InterruptedException |ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

}
