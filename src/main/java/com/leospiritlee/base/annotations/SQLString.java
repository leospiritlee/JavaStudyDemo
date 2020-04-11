package com.leospiritlee.base.annotations;

import java.lang.annotation.*;


@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)

public @interface SQLString {

    int value() default 0;
    String name() default "";
    Constraints constraints() default @Constraints;

}
