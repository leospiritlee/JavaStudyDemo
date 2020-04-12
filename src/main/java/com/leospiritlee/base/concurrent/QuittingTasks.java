package com.leospiritlee.base.concurrent;

import com.leospiritlee.base.onjava.Nap;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @Project: JavaStudyDemo
 * @ClassName QuittingTasks
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-12 13:09
 **/
public class QuittingTasks {

    public static final int COUNT = 150;
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        List<QuittableTask> tasks =
                IntStream.range(1, COUNT)
                        .mapToObj(QuittableTask::new)
                        .peek(qt -> es.execute(qt))
                        .collect(Collectors.toList());
        new Nap(1);
        tasks.forEach(QuittableTask::quit);
        es.shutdown();
    }

}
