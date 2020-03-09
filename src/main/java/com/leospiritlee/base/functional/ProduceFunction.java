package com.leospiritlee.base.functional;

import java.util.function.Function;

/**
 * @Project: JavaStudyDemo
 * @ClassName ProduceFunction
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-09 15:02
 **/
public class ProduceFunction {

    /**
     * 这里，produce() 是高阶函数。
     * @return
     */
    static FuncSS produce() {
        /**
         * 使用 Lambda 表达式，可以轻松地在方法中创建和返回一个函数。
         */
        return s -> s.toLowerCase(); // [2]
    }
    public static void main(String[] args) {
        FuncSS f = produce();
        System.out.println(f.apply("YELLING"));
    }

}

/**
 * 使用继承，可以轻松地为专用接口创建别名。
 */
interface FuncSS extends Function<String, String> {} // [1]
