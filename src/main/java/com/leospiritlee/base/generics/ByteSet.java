package com.leospiritlee.base.generics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Project: JavaStudyDemo
 * @ClassName ByteSet
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-01 21:26
 **/
public class ByteSet {

    Byte[] possibles = { 1,2,3,4,5,6,7,8,9 };
    Set<Byte> mySet = new HashSet<>(Arrays.asList(possibles));
    // But you can't do this:
    // Set<Byte> mySet2 = new HashSet<>(
    // Arrays.<Byte>asList(1,2,3,4,5,6,7,8,9));
}
