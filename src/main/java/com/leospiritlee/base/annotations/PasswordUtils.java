package com.leospiritlee.base.annotations;

import java.util.List;

/**
 * @Project: JavaStudyDemo
 * @ClassName PasswordUtils
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-11 17:03
 **/
public class PasswordUtils {

    @UseCase(id = 47, description ="Passwords must contain at least one numeric")
    public boolean validatePassword(String passWord) {
        return (passWord.matches("\\w*\\d\\w*"));
    }

    @UseCase(id = 48)
    public String encryptPassword(String passWord) {
        return new StringBuilder(passWord).reverse().toString();
    }

    @UseCase(id = 49, description ="New passwords can't equal previously used ones")
    public boolean checkForNewPassword(List<String> prevPasswords, String passWord) {
        return !prevPasswords.contains(passWord);
    }

}
