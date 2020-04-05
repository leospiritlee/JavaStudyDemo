package com.leospiritlee.base.enums;

/**
 * @Project: JavaStudyDemo
 * @ClassName EnumClass
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-05 13:41
 **/
public class EnumClass {

    public static void main(String[] args) {
        for(Shrubbery s : Shrubbery.values()) {
            System.out.println( s + " ordinal: " + s.ordinal());
            System.out.print(s.compareTo(Shrubbery.CRAWLING) + " ");
            System.out.print(s.equals(Shrubbery.CRAWLING) + " ");
            System.out.println(s == Shrubbery.CRAWLING);
            System.out.println(s.getDeclaringClass());
            System.out.println(s.name());
            System.out.println("********************");
        }
// Produce an enum value from a String name:
        for(String s :"HANGING CRAWLING GROUND".split(" ")) {
            Shrubbery shrub = Enum.valueOf(Shrubbery.class, s);
            System.out.println(shrub);
        }
    }

}


enum Shrubbery { GROUND, CRAWLING, HANGING }