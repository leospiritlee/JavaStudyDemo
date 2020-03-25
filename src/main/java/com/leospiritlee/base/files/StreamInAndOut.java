package com.leospiritlee.base.files;

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @Project: JavaStudyDemo
 * @ClassName StreamInAndOut
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-25 18:29
 **/
public class StreamInAndOut {

    public static void main(String[] args) {
        try(
                Stream<String> input =
                        Files.lines(Paths.get("src/main/java/com/leospiritlee/base/files/StreamInAndOut.java"));
                PrintWriter output =
                        new PrintWriter("StreamInAndOut.txt")
        ) {
            input.map(String::toUpperCase)
                    .forEachOrdered(output::println);
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

}
