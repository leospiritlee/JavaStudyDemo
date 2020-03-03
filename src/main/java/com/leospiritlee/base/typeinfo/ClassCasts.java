package com.leospiritlee.base.typeinfo;

/**
 * @Project: JavaStudyDemo
 * @ClassName ClassCasts
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-03 17:20
 **/
public class ClassCasts {

    public static void main(String[] args) {
        Building b = new House();
        Class<House> houseType = House.class;
        House h = houseType.cast(b);

        h = (House)b; // ... 或者这样做.


        Building b1 = new House();

        House h1 = (House) b1;

        Class<House> houseType1 = House.class;
        h1 = houseType1.cast(b1);


    }

}


class Building {}
class House extends Building {}