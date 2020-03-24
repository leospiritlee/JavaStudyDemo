package com.leospiritlee.base.files;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @Project: JavaStudyDemo
 * @ClassName PartsOfPaths
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-24 21:28
 **/
public class PartsOfPaths {

    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        Path p = Paths.get("PartsOfPaths.java").toAbsolutePath();

        System.out.println("p:" + p.toString());

        for(int i = 0; i < p.getNameCount(); i++){
            System.out.println("p.getName(): " +p.getName(i));
        }

        System.out.println("ends with '.java': " + p.endsWith(".java"));
        System.out.println("ends with 'PartsOfPaths.java': " + p.endsWith("PartsOfPaths.java"));

        for(Path pp : p) {
            System.out.print(pp + ": ");
            System.out.print(p.startsWith(pp) + " : ");
            System.out.println(p.endsWith(pp));
        }
        System.out.println("Starts with " + p.getRoot() + " " + p.startsWith(p.getRoot()));
    }

}
