package org.moshin.learning.singleton;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LazyEmployee {

    private static LazyEmployee lazyEmployee;

    private LazyEmployee() {
    }

    public static LazyEmployee getLazyEmployee() {
        if (lazyEmployee == null) {
            lazyEmployee = new LazyEmployee();
        }
        return lazyEmployee;
    }
}
