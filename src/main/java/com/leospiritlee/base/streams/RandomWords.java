package com.leospiritlee.base.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Project: JavaStudyDemo
 * @ClassName RandomWords
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-10 22:02
 **/
public class RandomWords implements Supplier<String> {

    List<String> words = new ArrayList<>();

    Random rand = new Random(47);
    RandomWords(String fname) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(fname));
        // 略过第一行
        List<String> newLines = lines.subList(1, lines.size());

        for (String line : newLines) {
            for (String word : line.split("[ .?,]+"))
                words.add(word.toLowerCase());
        }
    }

    @Override
    public String toString() {
        return words.stream().collect(Collectors.joining(" "));
    }

    @Override
    public String get() {
        return words.get(rand.nextInt(words.size()));
    }

    public static void main(String[] args) throws IOException {
        System.out.println(Stream.generate(
                new RandomWords("src\\main\\java\\com\\leospiritlee\\base\\streams\\Cheese.dat")
            ).limit(10).collect(Collectors.joining(" "))

        );
    }
}
