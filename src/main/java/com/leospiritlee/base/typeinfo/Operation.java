package com.leospiritlee.base.typeinfo;

import java.util.function.Supplier;

/**
 * @Project: JavaStudyDemo
 * @ClassName Operation
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-27 16:14
 **/
public class Operation {

    public final Supplier<String> description;
    public final Runnable command;

    public Operation(Supplier<String> descr, Runnable cmd) {
        description = descr;
        command = cmd;
    }

}
