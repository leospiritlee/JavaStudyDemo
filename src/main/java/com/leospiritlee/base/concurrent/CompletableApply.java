package com.leospiritlee.base.concurrent;

import java.util.concurrent.CompletableFuture;

/**
 * @Project: JavaStudyDemo
 * @ClassName CompletableApply
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-12 14:51
 **/
public class CompletableApply {

    public static void main(String[] args) {
        CompletableFuture<Machina> cf =  CompletableFuture.completedFuture(new Machina(0));
        CompletableFuture<Machina> cf2 =
                cf.thenApply(Machina::work);
        CompletableFuture<Machina> cf3 =
                cf2.thenApply(Machina::work);
        CompletableFuture<Machina> cf4 =
                cf3.thenApply(Machina::work);
        CompletableFuture<Machina> cf5 =
                cf4.thenApply(Machina::work);
    }

}
