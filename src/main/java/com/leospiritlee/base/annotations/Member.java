package com.leospiritlee.base.annotations;

/**
 * @Project: JavaStudyDemo
 * @ClassName Member
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-11 18:31
 **/
@DBTable(name = "MEMBER")
public class Member {

    @SQLString(30)
    String firstName;
    @SQLString(50)
    String lastName;
    @SQLInteger
    Integer age;
    @SQLString(value = 30, constraints = @Constraints(primaryKey = true))
    String reference;
    static int memberCount;
    public String getReference() { return reference; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    @Override
    public String toString() { return reference; }
    public Integer getAge() { return age; }

}
