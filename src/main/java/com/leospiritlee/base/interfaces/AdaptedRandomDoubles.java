package com.leospiritlee.base.interfaces;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * @Project: JavaStudyDemo
 * @ClassName AdaptedRandomDoubles
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-25 18:47
 **/
public class AdaptedRandomDoubles implements RandomDoubles, Readable {

    private int count;

    public AdaptedRandomDoubles(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }
        String result = Double.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandomDoubles(7));
        while (s.hasNextDouble()) {
            System.out.print(s.nextDouble() + " ");
        }
    }
}
