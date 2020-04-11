package com.leospiritlee.base.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE, ElementType.METHOD,
        ElementType.CONSTRUCTOR,
        ElementType.ANNOTATION_TYPE,
        ElementType.PACKAGE, ElementType.FIELD,
        ElementType.LOCAL_VARIABLE})
public @interface Simple {

    String value() default "-default-";
}
