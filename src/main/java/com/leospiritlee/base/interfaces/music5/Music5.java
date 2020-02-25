package com.leospiritlee.base.interfaces.music5;

import com.leospiritlee.base.music.Note;

/**
 * @Project: JavaStudyDemo
 * @ClassName Music5
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-25 14:47
 **/

/**
 *
 * 特性	            接口	                                            抽象类
 * 组合	        新类可以组合多个接口	                                只能继承单一抽象类
 * 状态	        不能包含属性（除了静态属性，不支持对象状态）	            可以包含属性，非抽象方法可能引用这些属性
 * 默认方法
 * 和抽象方法	不需要在子类中实现默认方法。默认方法可以引用其他接口的方法	必须在子类中实现抽象方法
 * 构造器	    没有构造器	                                        可以有构造器
* 可见性	        隐式 public	可以是 protected 或友元
 */

public class Music5 {

    // Doesn't care about type, so new types
    // added to the system still work right:
    static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i: e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}


interface Instrument {
    // Compile-time constant:
    int VALUE = 5; // static & final

    default void play(Note n){  // Automatically public
        System.out.println(this + ".play() " + n);
    }

    default void adjust() {
        System.out.println("Adjusting " + this);
    }
}

class Wind implements Instrument {
    @Override
    public String toString() {
        return "Wind";
    }
}

class Percussion implements Instrument {
    @Override
    public String toString() {
        return "Percussion";
    }
}

class Stringed implements Instrument {
    @Override
    public String toString() {
        return "Stringed";
    }
}

class Brass extends Wind {
    @Override
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    @Override
    public String toString() {
        return "Woodwind";
    }
}
