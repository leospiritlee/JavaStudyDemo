package com.leospiritlee.base;

public class Car {

    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door left = new Door(), right = new Door(); // 2-door

    public Car() {
        for (int i = 0; i < 4; i++) {
            wheel[i] = new Wheel();
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.left.windows.rollup();
        car.wheel[0].inflate(72);
    }
}


class Engine {
    public void start() {}
    public void rev() {}
    public void stop() {}
}

class Wheel {
    public void inflate(int psi) {}
}

class Windows {
    public void rollup() {}
    public void rolldown() {}
}

class Door {
    public Windows windows = new Windows();

    public void open() {}
    public void close() {}
}