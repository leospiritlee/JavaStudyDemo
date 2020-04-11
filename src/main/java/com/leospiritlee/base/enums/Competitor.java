package com.leospiritlee.base.enums;

public interface Competitor<T extends Competitor<T>> {
    Outcome compete(T competitor);
}
