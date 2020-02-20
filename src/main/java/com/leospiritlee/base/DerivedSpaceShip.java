package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName DerivedSpaceShip
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-20 13:37
 **/
public class DerivedSpaceShip extends SpaceShipControls {

    private String name;
    public DerivedSpaceShip(String name) {
        this.name = name;
    }
    @Override
    public String toString() { return name; }
    public static void main(String[] args) {
        DerivedSpaceShip protector =
                new DerivedSpaceShip("NSEA Protector");
        protector.forward(100);
    }

}
