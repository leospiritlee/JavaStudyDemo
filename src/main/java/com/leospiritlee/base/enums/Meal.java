package com.leospiritlee.base.enums;

/**
 * @Project: JavaStudyDemo
 * @ClassName Meal
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-06 18:36
 **/
public class Meal {

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            for(Course course : Course.values()) {
                Food food = course.randomSelection();
                System.out.println(food);
            }
            System.out.println("***");
        }
    }

}
