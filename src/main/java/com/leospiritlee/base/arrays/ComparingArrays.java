package com.leospiritlee.base.arrays;

import com.leospiritlee.base.onjava.Count;
import com.leospiritlee.base.onjava.Rand;

import java.util.Arrays;

import static com.leospiritlee.base.onjava.ArrayShow.show;

/**
 * @Project: JavaStudyDemo
 * @ClassName ComparingArrays
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-04 20:33
 **/
public class ComparingArrays {

    public static final int SZ = 15;

    static String[][] twoDArray() {
        String[][] md = new String[5][];
        Arrays.setAll(md, n -> new String[n]);
        for (int i = 0; i < md.length; i++) {
            Arrays.setAll(md[i], new Rand.String()::get);
        }
        return md;
    }

    public static void main(String[] args) {
        int[] a1 = new int[SZ], a2 = new int[SZ];
        Arrays.setAll(a1, new Count.Integer()::get);
        Arrays.setAll(a2, new Count.Integer()::get);
        //a1 a2 数组长度一致 数据一致
        System.out.println("a1 == a2: " + Arrays.equals(a1, a2));

        //修改a2 下标3 3 改为 11
        a2[3] = 11;
        show("a1", a1);
        show("a2", a2);
        System.out.println("a1 == a2: " + Arrays.equals(a1, a2));

        //封装类型 与 基本类型一致
        Integer[] a1w = new Integer[SZ], a2w = new Integer[SZ];
        Arrays.setAll(a1w, new Count.Integer()::get);
        Arrays.setAll(a2w, new Count.Integer()::get);
        System.out.println("a1w == a2w: " + Arrays.equals(a1w, a2w));

        a2w[3] = 11;
        System.out.println("a1w == a2w: " + Arrays.equals(a1w, a2w));


        /**
         *  多维数组需要用  deepEquals 比较  equals 比较无效
         */
        String[][] md1 = twoDArray(), md2 = twoDArray();
        System.out.println(Arrays.deepToString(md1));
        System.out.println("deepEquals(md1, md2): " + Arrays.deepEquals(md1, md2));
        System.out.println("md1 == md2: " + Arrays.equals(md1, md2));
        md1[4][1] = "#$#$#$#";
        System.out.println(Arrays.deepToString(md1));
        System.out.println("deepEquals(md1, md2): " + Arrays.deepEquals(md1, md2));
    }

}
