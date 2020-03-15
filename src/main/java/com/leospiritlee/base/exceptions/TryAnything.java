package com.leospiritlee.base.exceptions;

/**
 * @Project: JavaStudyDemo
 * @ClassName TryAnything
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-15 20:08
 **/
public class TryAnything {

    public static void main(String[] args) {
        try(
                Anything a = new Anything()
        ) {
        }catch (Exception e){
            e.printStackTrace(System.err);
        }
    }

}

class Anything implements AutoCloseable{

    @Override
    public void close() throws Exception {

    }
}
