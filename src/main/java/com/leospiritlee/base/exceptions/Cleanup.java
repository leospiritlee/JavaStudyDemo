package com.leospiritlee.base.exceptions;

/**
 * @Project: JavaStudyDemo
 * @ClassName Cleanup
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-15 17:53
 **/
public class Cleanup {

    public static void main(String[] args) {
        try {
            InputFile in = new InputFile("src\\main\\java\\com\\leospiritlee\\base\\exceptions\\Cleanup.java");
            try {
                String s;
                int i = 1;
                while((s = in.getLine()) != null)
                    ; // Perform line-by-line processing here...
            } catch(Exception e) {
                System.out.println("Caught Exception in main");
                e.printStackTrace(System.out);
            } finally {
                in.dispose();
            }
        } catch(Exception e) {
            System.out.println(
                    "InputFile construction failed");
        }
    }

}
