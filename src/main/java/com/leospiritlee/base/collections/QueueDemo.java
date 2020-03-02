package com.leospiritlee.base.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * @Project: JavaStudyDemo
 * @ClassName QueueDemo
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-02 11:13
 **/
public class QueueDemo {

    public static void printQ(Queue queue) {
        while(queue.peek() != null)
            System.out.print(queue.remove() + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Random rand = new Random(47);
        for(int i = 0; i < 10; i++)
            queue.offer(rand.nextInt(i + 10));

        printQ(queue);

        System.out.println(queue.peek());
        System.out.println(queue.poll());

//        System.out.println(queue.element());
//        System.out.println(queue.remove());

        Queue<Character> qc = new LinkedList<>();
        for(char c : "Brontosaurus".toCharArray())
            qc.offer(c);

        printQ(qc);
    }

}
