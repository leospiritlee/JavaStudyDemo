package com.leospiritlee.base.strings;

import java.util.Scanner;

/**
 * @Project: JavaStudyDemo
 * @ClassName ScannerDelimiter
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-25 22:28
 **/
public class ScannerDelimiter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner("12, 42, 78, 99, 42");
        scanner.useDelimiter("\\s*,\\s*");
        while(scanner.hasNextInt())
            System.out.println(scanner.nextInt());
    }

}
