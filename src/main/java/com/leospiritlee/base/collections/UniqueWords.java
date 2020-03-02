package com.leospiritlee.base.collections;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Project: JavaStudyDemo
 * @ClassName UniqueWords
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-02 10:38
 **/
public class UniqueWords {

    public static void main(String[] args) throws Exception {
        List<String> lines = Files.readAllLines(
                Paths.get("src/main/java/com/leospiritlee/base/collections/SetOperations.java"));
        Set<String> words = new TreeSet<>();
        for(String line : lines)
            for(String word : line.split("\\W+"))
                if(word.trim().length() > 0)
                    words.add(word);
        System.out.println(words);
    }

}
