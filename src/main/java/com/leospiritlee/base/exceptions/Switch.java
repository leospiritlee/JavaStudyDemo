package com.leospiritlee.base.exceptions;

/**
 * @Project: JavaStudyDemo
 * @ClassName Switch
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-15 12:01
 **/
public class Switch {


    private boolean state = false;
    public boolean read() { return state; }
    public void on() {
        state = true;
        System.out.println(this);
    }
    public void off() {
        state = false;
        System.out.println(this);
    }

    public void switchState(){
        if (state) {
            on();
        } else {
            off();
        }
    }

    @Override
    public String toString() {
        return state ? "on" : "off";
    }

}
