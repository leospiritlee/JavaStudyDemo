package com.leospiritlee.base.exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @Project: JavaStudyDemo
 * @ClassName LoggingExceptions2
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-14 19:18
 **/
public class LoggingExceptions2 {

    private static Logger logger = Logger.getLogger("LoggingExceptions2");
    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch(NullPointerException e) {
            logException(e);
        }
    }

}
