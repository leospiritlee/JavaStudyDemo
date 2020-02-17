package com.leospiritlee.base;

import static com.leospiritlee.base.Range.range;

/**
 * @Project: JavaStudyDemo
 * @ClassName BreakAndContinue
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-16 15:07
 **/
public class BreakAndContinue {

    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) { // [1]
            if(i == 74) {
                break; // 跳出循环git push --set-upstream origin master
            }
            if(i % 9 != 0) {
                continue; // 下一次循环
            }
            System.out.print(i + " ");
        }
        System.out.println();
        // 使用 for-in 循环:
        for(int i : range(100)) { // [2]
            if(i == 74){
                break; // 跳出循环
            }
            if(i % 9 != 0){
                continue; // 下一次循环
            }
            System.out.print(i + " ");
        }
        System.out.println();
        int i = 0;
        //  "无限循环":
        while(true) { // [3]
            i++;
            int j = i * 27;
            if(j == 1269) {
                break; // 跳出循环
            }
            if(i % 10 != 0){
                continue; // 循环顶部
            }
            System.out.print(i + " ");
        }

    }
}
