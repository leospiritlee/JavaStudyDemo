package com.leospiritlee.base.streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @Project: JavaStudyDemo
 * @ClassName TreeSetOfWords
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-13 14:19
 **/
public class TreeSetOfWords {

    public static void main(String[] args) throws Exception {
        Set<String> words2 =
                Files.lines(Paths.get("src\\main\\java\\com\\leospiritlee\\base\\streams\\TreeSetOfWords.java"))
                        .flatMap(s -> Arrays.stream(s.split("\\W+")))
                        .filter(s -> !s.matches("\\d+")) // No numbers
                        .map(String::trim)
                        .filter(s -> s.length() > 2)
                        .limit(100)
                        .collect(Collectors.toCollection(TreeSet::new));
        System.out.print(words2);
    }

}
