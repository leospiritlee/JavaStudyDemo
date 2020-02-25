package com.leospiritlee.base.interfaces.interfaceprocessor;


import java.util.Arrays;

/**
 * @Project: JavaStudyDemo
 * @ClassName StringProcessor
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-25 15:50
 *
 * [1] 该声明不是必要的，即使移除它，编译器也不会报错。但是注意这里的协变返回类型从 Object 变成了 String。
 *
 * [2] S 自动就是 final 和 static 的，因为它是在接口中定义的。
 *
 * [3] 可以在接口中定义 main() 方法。
 *
 **/
public interface StringProcessor extends Processor {

    @Override
    String process(Object input); // [1]
    String S = "If she weighs the same as a duck, she's made of wood"; // [2]

    static void main(String[] args) { // [3]
        Applicator.apply(new Upcase(), S);
        Applicator.apply(new Downcase(), S);
        Applicator.apply(new Splitter(), S);
    }
}

class Upcase implements StringProcessor {
    // 返回协变类型
    @Override
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class Downcase implements StringProcessor {
    @Override
    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter implements StringProcessor {
    @Override
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}
