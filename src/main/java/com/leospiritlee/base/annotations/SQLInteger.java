package com.leospiritlee.base.annotations;


import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)

public @interface SQLInteger {

    String name() default "";
    Constraints constraints() default @Constraints;

}