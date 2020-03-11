package com.leospiritlee.base.streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * @Project: JavaStudyDemo
 * @ClassName FileToWords
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-11 21:20
 **/
public class FileToWords {

    public static Stream<String> stream(String filePath) throws Exception {
        return Files.lines(Paths.get(filePath))
                .skip(1) // First (comment) line
                .flatMap(line ->
                        Pattern.compile("\\W+").splitAsStream(line));
    }

}
