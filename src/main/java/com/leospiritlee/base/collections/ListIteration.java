package com.leospiritlee.base.collections;

import com.leospiritlee.base.typeinfo.pets.Pet;
import com.leospiritlee.base.typeinfo.pets.Pets;

import java.util.*;

/**
 * @Project: JavaStudyDemo
 * @ClassName ListIteration
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-29 18:56
 **/
public class ListIteration {

    public static void main(String[] args) {
        List<Pet> pets = Pets.list(8);
        ListIterator<Pet> it = pets.listIterator();
        while(it.hasNext())
            System.out.print(it.next() +
                    ", " + it.nextIndex() +
                    ", " + it.previousIndex() + "; ");
        System.out.println();
        // Backwards:
        while(it.hasPrevious())
            System.out.print(it.previous().id() + " ");
        System.out.println();
        System.out.println(pets);
        it = pets.listIterator(3);
        while(it.hasNext()) {
            it.next();
            it.set(Pets.get());
        }
        System.out.println(pets);
    }

}
