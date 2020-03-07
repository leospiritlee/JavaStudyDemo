package com.leospiritlee.base.collections;

import com.leospiritlee.base.typeinfo.pets.Pet;
import com.leospiritlee.base.typeinfo.pets.Pets;

import java.util.*;

/**
 * @Project: JavaStudyDemo
 * @ClassName CrossCollectionIteration
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-29 17:52
 **/
public class CrossCollectionIteration {

    public static void display(Iterator<Pet> it) {
        while(it.hasNext()) {
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Pet> pets = Pets.list(8);
        LinkedList<Pet> petsLL = new LinkedList<>(pets);
        HashSet<Pet> petsHS = new HashSet<>(pets);
        TreeSet<Pet> petsTS = new TreeSet<>(pets);
        display(pets.iterator());
        display(petsLL.iterator());
        display(petsHS.iterator());
        display(petsTS.iterator());
    }

}
