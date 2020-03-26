package com.leospiritlee.base.typeinfo;

import com.leospiritlee.base.typeinfo.pets.Pet;
import com.leospiritlee.base.typeinfo.pets.Pets;

/**
 * @Project: JavaStudyDemo
 * @ClassName PetCount4
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-26 20:50
 **/
public class PetCount4 {

    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        Pets.stream()
                .limit(20)
                .peek(counter::count)
                .forEach(p -> System.out.print(
                        p.getClass().getSimpleName() + " "));
        System.out.println("n" + counter);
    }

}
