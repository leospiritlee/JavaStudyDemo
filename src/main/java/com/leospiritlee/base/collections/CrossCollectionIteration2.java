package com.leospiritlee.base.collections;

import com.leospiritlee.base.typeinfo.pets.Pet;
import com.leospiritlee.base.typeinfo.pets.Pets;

import java.util.*;

/**
 * @Project: JavaStudyDemo
 * @ClassName CrossCollectionIteration2
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-29 17:53
 **/
public class CrossCollectionIteration2 {

    public static void display(Iterable<Pet> ip) {
        Iterator<Pet> it = ip.iterator();
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
        display(pets);
        display(petsLL);
        display(petsHS);
        display(petsTS);
    }

}
