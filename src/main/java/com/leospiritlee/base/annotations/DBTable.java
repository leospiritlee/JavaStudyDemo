package com.leospiritlee.base.annotations;


import java.lang.annotation.*;

@Target(ElementType.TYPE) // Applies to classes only
@Retention(RetentionPolicy.RUNTIME)
public @interface DBTable {

    String name() default "";
}
