package com.leospiritlee.base.files;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @Project: JavaStudyDemo
 * @ClassName ListOfLines
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-25 17:53
 **/
public class ListOfLines {

    public static void main(String[] args) throws Exception {
        Files.readAllLines(
                Paths.get("src/main/java/com/leospiritlee/base/streams/Cheese.dat"))
                .stream()
                .filter(line -> !line.startsWith("//"))
                .map(line ->
                        line.substring(0, line.length()/2))
                .forEach(System.out::println);
    }

}
