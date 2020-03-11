package com.leospiritlee.base.streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @Project: JavaStudyDemo
 * @ClassName FileToWordsBuilder
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-11 18:57
 **/
public class FileToWordsBuilder {

    Stream.Builder<String> builder = Stream.builder();

    public FileToWordsBuilder(String filePath) throws Exception {
        Files.lines(Paths.get(filePath))
                .skip(1) // 略过开头的注释行
                .forEach(line -> {
                    for (String w : line.split("[ .?,]+"))
                        builder.add(w);
                });
    }

    Stream<String> stream() {
        return builder.build();
    }

    public static void main(String[] args) throws Exception {
        new FileToWordsBuilder("src\\main\\java\\com\\leospiritlee\\base\\streams\\Cheese.dat")
                .stream()
                .limit(14)
                .map(w -> w + " ")
                .forEach(System.out::print);
    }


}
