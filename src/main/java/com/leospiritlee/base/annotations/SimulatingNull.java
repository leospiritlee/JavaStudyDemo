package com.leospiritlee.base.annotations;


import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

public @interface SimulatingNull {

    int id() default -1;
    String description() default "";

}
