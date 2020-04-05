package com.leospiritlee.base.enums;

/**
 * @Project: JavaStudyDemo
 * @ClassName TrafficLight
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-05 18:33
 **/
public class TrafficLight {

    Signal color = Signal.RED;
    public void change() {
        switch(color) {
            // Note you don't have to say Signal.RED
            // in the case statement:
            case RED: color = Signal.GREEN;
                break;
            case GREEN: color = Signal.YELLOW;
                break;
            case YELLOW: color = Signal.RED;
                break;
        }
    }
    @Override
    public String toString() {
        return "The traffic light is " + color;
    }
    public static void main(String[] args) {
        TrafficLight t = new TrafficLight();
        for(int i = 0; i < 7; i++) {
            System.out.println(t);
            t.change();
        }
    }

}

enum Signal { GREEN, YELLOW, RED, }
