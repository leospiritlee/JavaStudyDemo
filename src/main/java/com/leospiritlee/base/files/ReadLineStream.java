package com.leospiritlee.base.files;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @Project: JavaStudyDemo
 * @ClassName ReadLineStream
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-25 18:28
 **/
public class ReadLineStream {

    public static void main(String[] args) throws Exception {
        Files.lines(Paths.get("src/main/java/com/leospiritlee/base/files/PathInfo.java"))
                .skip(13)
                .findFirst()
                .ifPresent(System.out::println);
    }

}
