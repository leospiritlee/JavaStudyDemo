package com.leospiritlee.base.exceptions;

/**
 * @Project: JavaStudyDemo
 * @ClassName CleanupIdiom
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-15 19:46
 **/
public class CleanupIdiom {

    public static void main(String[] args) {
        // [1]:
        NeedsCleanup nc1 = new NeedsCleanup();
        try {
            // ...
        } finally {
            nc1.dispose();
        }
        // [2]:
        // If construction cannot fail,
        // you can group objects:
        NeedsCleanup nc2 = new NeedsCleanup();
        NeedsCleanup nc3 = new NeedsCleanup();
        try {
            // ...
        } finally {
            nc3.dispose(); // Reverse order of construction
            nc2.dispose();
        }
        // [3]:
        // If construction can fail you must guard each one:
        try {
            NeedsCleanup2 nc4 = new NeedsCleanup2();
            try {
                NeedsCleanup2 nc5 = new NeedsCleanup2();
                try {
                    // ...
                } finally {
                    nc5.dispose();
                }
            } catch(ConstructionException e) { // nc5 const.
                System.out.println(e);
            } finally {
                nc4.dispose();
            }
        } catch(ConstructionException e) { // nc4 const.
            System.out.println(e);
        }
    }

}


class NeedsCleanup { // Construction can't fail
    private static long counter = 1;
    private final long id = counter++;
    public void dispose() {
        System.out.println(
                "NeedsCleanup " + id + " disposed");
    }
}
class ConstructionException extends Exception {}
class NeedsCleanup2 extends NeedsCleanup {
    // Construction can fail:
    NeedsCleanup2() throws ConstructionException {}
}