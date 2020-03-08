package com.leospiritlee.base.collections;

import com.leospiritlee.base.typeinfo.pets.*;

import java.util.*;

/**
 * @Project: JavaStudyDemo
 * @ClassName PetMap
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-02 11:04
 **/
public class PetMap {

    public static void main(String[] args) {
        Map<String, Pet> petMap = new HashMap<>();
        petMap.put("My Cat", new Cat("Molly"));
        petMap.put("My Dog", new Dog("Ginger"));
        petMap.put("My Hamster", new Hamster("Bosco"));
        System.out.println(petMap);
        Pet dog = petMap.get("My Dog");
        System.out.println(dog);
        System.out.println(petMap.containsKey("My Dog"));
        System.out.println(petMap.containsValue(dog));
    }

}
