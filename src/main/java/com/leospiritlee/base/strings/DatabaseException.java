package com.leospiritlee.base.strings;

/**
 * @Project: JavaStudyDemo
 * @ClassName DatabaseException
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-25 21:14
 **/
public class DatabaseException extends Exception {

    public DatabaseException(int transactionID,
                             int queryID, String message) {
        super(String.format("(t%d, q%d) %s", transactionID, queryID, message));
    }
    public static void main(String[] args) {
        try {
            throw new DatabaseException(3, 7, "Write failed");
        } catch(Exception e) {
            System.out.println(e);
        }
    }

}
