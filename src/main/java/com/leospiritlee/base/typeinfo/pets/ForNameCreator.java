package com.leospiritlee.base.typeinfo.pets;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: JavaStudyDemo
 * @ClassName ForNameCreator
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-03 21:49
 **/
public class ForNameCreator extends PetCreator  {

    private static List<Class<? extends Pet>> types = new ArrayList<>();

    // 需要随机生成的类型名:
    private static String[] typeNames = {
            "com.leospiritlee.base.typeinfo.pets.Mutt",
            "com.leospiritlee.base.typeinfo.pets.Pug",
            "com.leospiritlee.base.typeinfo.pets.EgyptianMau",
            "com.leospiritlee.base.typeinfo.pets.Manx",
            "com.leospiritlee.base.typeinfo.pets.Cymric",
            "com.leospiritlee.base.typeinfo.pets.Rat",
            "com.leospiritlee.base.typeinfo.pets.Mouse",
            "com.leospiritlee.base.typeinfo.pets.Hamster"
    };


    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for (String name : typeNames)
                types.add(
                        (Class<? extends Pet>) Class.forName(name));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static {
        loader();
    }

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
}
