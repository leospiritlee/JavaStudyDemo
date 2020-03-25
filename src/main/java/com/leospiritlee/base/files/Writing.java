package com.leospiritlee.base.files;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

/**
 * @Project: JavaStudyDemo
 * @ClassName Writing
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-25 17:55
 **/
public class Writing {


    static Random rand = new Random(47);
    static final int SIZE = 1000;

    public static void main(String[] args) throws Exception {
        // Write bytes to a file:
        byte[] bytes = new byte[SIZE];
        rand.nextBytes(bytes);
        Files.write(Paths.get("bytes.dat"), bytes);
        System.out.println("bytes.dat: " + Files.size(Paths.get("bytes.dat")));

        // Write an iterable to a file:
        List<String> lines = Files.readAllLines(
                Paths.get("src/main/java/com/leospiritlee/base/streams/Cheese.dat"));
        Files.write(Paths.get("Cheese.txt"), lines);
        System.out.println("Cheese.txt: " + Files.size(Paths.get("Cheese.txt")));
    }

}
