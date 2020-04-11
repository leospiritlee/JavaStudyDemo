package com.leospiritlee.base.annotations;

import java.lang.annotation.*;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)

public @interface ExtractInterface {

    String interfaceName() default "-!!-";
}
