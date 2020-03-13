package com.leospiritlee.base.streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @Project: JavaStudyDemo
 * @ClassName SpecialCollector
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-13 14:33
 **/
public class SpecialCollector {

    public static void main(String[] args) throws Exception {
//        ArrayList<String> words =
//                FileToWords.stream("src\\main\\java\\com\\leospiritlee\\base\\streams\\Cheese.dat")
//                        .collect(ArrayList::new,
//                                ArrayList::add,
//                                ArrayList::addAll);
        ArrayList<String> words =
        Files.lines(Paths.get("src\\main\\java\\com\\leospiritlee\\base\\streams\\Cheese.dat"))
                .flatMap(line -> Pattern.compile("\\W+").splitAsStream(line))
                .collect(ArrayList::new,
                        ArrayList::add,
                        ArrayList::addAll);


        words.stream()
                .filter(s -> s.equals("cheese"))
                .forEach(System.out::println);
    }

}
