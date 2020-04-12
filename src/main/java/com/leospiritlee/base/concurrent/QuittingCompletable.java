package com.leospiritlee.base.concurrent;

import com.leospiritlee.base.onjava.Nap;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @Project: JavaStudyDemo
 * @ClassName QuittingCompletable
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-12 13:26
 **/
public class QuittingCompletable {

    public static void main(String[] args) {
        List<QuittableTask> tasks =
                IntStream.range(1, QuittingTasks.COUNT)
                        .mapToObj(QuittableTask::new)
                        .collect(Collectors.toList());
        List<CompletableFuture<Void>> cfutures =
                tasks.stream()
                        .map(CompletableFuture::runAsync)
                        .collect(Collectors.toList());
        new Nap(1);
        tasks.forEach(QuittableTask::quit);
        cfutures.forEach(CompletableFuture::join);
    }

}
