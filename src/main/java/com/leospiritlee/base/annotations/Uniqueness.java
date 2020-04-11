package com.leospiritlee.base.annotations;

public @interface Uniqueness {

    Constraints constraints()
            default @Constraints(unique = true);

}
