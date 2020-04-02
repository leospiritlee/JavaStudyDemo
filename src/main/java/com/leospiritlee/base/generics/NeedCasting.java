package com.leospiritlee.base.generics;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * @Project: JavaStudyDemo
 * @ClassName NeedCasting
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-02 09:58
 **/
public class NeedCasting {
    @SuppressWarnings("unchecked")
    public void f(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(args[0]));
        List<Widget> shapes = (List<Widget>)in.readObject();
    }

}
