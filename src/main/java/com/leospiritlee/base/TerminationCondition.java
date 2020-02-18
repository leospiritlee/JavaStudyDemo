package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName TerminationCondition
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-18 16:00
 **/
public class TerminationCondition {

    public static void main(String[] args) {
        Book novel = new Book(true);
        // Proper cleanup:
        novel.checkIn();
        // Drop the reference, forget to clean up:
        new Book(true);
        // Force garbage collection & finalization:
        System.gc();
        new Nap(1); // One second delay
    }
}
