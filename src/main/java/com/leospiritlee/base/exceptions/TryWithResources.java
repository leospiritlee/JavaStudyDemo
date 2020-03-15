package com.leospiritlee.base.exceptions;

import java.io.*;

/**
 * @Project: JavaStudyDemo
 * @ClassName TryWithResources
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-15 19:59
 **/
public class TryWithResources {

    public static void main(String[] args) {
        try (
                InputStream in = new FileInputStream(
                        new File("src/main/java/com/leospiritlee/base/exceptions/TryWithResources.java"))
            )
        {
            int contents = in.read();
            // Process contents
        } catch (IOException e) {
            // Handle the error
        }
    }

}
