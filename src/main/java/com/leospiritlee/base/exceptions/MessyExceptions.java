package com.leospiritlee.base.exceptions;

import java.io.*;

/**
 * @Project: JavaStudyDemo
 * @ClassName MessyExceptions
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-15 19:57
 **/
public class MessyExceptions {

    public static void main(String[] args) {
        InputStream in = null;
        try {
            in = new FileInputStream(
                    new File("src/main/java/com/leospiritlee/base/exceptions/MessyExceptions.java"));
            int contents = in.read();
            // Process contents
        } catch(IOException e) {
            // Handle the error
        } finally {
            if(in != null) {
                try {
                    in.close();
                } catch(IOException e) {
                    // Handle the close() error
                }
            }
        }
    }

}
