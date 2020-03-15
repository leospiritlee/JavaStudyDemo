package com.leospiritlee.base.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @Project: JavaStudyDemo
 * @ClassName InputFile2
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-15 19:54
 **/
public class InputFile2 {

    private String fname;

    public InputFile2(String fname) {
        this.fname = fname;
    }

    public Stream<String> getLines() throws IOException {
        return Files.lines(Paths.get(fname));
    }

    public static void main(String[] args) throws IOException {
        new InputFile2("src/main/java/com/leospiritlee/base/exceptions/InputFile2.java").getLines()
                .skip(20)
//                .limit(1)
                .forEach(System.out::println);
    }
}
