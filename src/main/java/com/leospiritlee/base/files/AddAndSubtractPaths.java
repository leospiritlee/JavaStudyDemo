package com.leospiritlee.base.files;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @Project: JavaStudyDemo
 * @ClassName AddAndSubtractPaths
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-24 21:45
 **/
public class AddAndSubtractPaths {

    static Path base = Paths.get("..", "..", "..").toAbsolutePath().normalize();

    static void show(int id, Path result) {
        if(result.isAbsolute())
            System.out.println("(" + id + ")r " + base.relativize(result));
        else
            System.out.println("(" + id + ") " + result);
        try {
            System.out.println("RealPath: " + result.toRealPath());
        } catch(IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        System.out.println(base);
        Path p = Paths.get("src/main/java/com/leospiritlee/base/files/AddAndSubtractPaths.java").toAbsolutePath();
        show(1, p);
        Path convoluted = p.getParent().getParent()
                .resolve("strings").resolve("..")
                .resolve(p.getParent().getFileName());


        System.out.println("p.getParent():" +p.getParent());
        System.out.println("p.getParent().getParent():" +p.getParent().getParent());
        System.out.println("p.getParent().getParent().resolve(\"strings\"):" +p.getParent().getParent().resolve("strings"));
        System.out.println("p.getParent().getParent().resolve(\"strings\").resolve(\"..\"):" + p.getParent().getParent().resolve("strings").resolve(".."));
        System.out.println("convoluted:" +convoluted);

        show(2, convoluted);
        show(3, convoluted.normalize());
        Path p2 = Paths.get("..", "..");

        System.out.println("p2:" + p2.toString());

        show(4, p2);

        System.out.println("p2.normalize():" + p2.normalize());

        show(5, p2.normalize());
        show(6, p2.toAbsolutePath().normalize());
        Path p3 = Paths.get(".").toAbsolutePath();

        System.out.println("p3:" + p3.toString());

        Path p4 = p3.resolve(p2);

        System.out.println("p4:" + p4.toString());

        show(7, p4);
        show(8, p4.normalize());
        Path p5 = Paths.get("").toAbsolutePath();
        show(9, p5);
        show(10, p5.resolveSibling("strings"));
        show(11, Paths.get("nonexistent"));
    }

}
