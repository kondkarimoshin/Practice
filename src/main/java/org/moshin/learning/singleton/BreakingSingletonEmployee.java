package org.moshin.learning.singleton;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BreakingSingletonEmployee {

    private static BreakingSingletonEmployee breakingSingletonEmployee;

    private BreakingSingletonEmployee() {
        if (breakingSingletonEmployee != null) {
            throw new RuntimeException("Constructor already present.");
        }
    }

    public static BreakingSingletonEmployee getBreakingSingletonEmployee() {
        if (breakingSingletonEmployee == null) {
            synchronized (BreakingSingletonEmployee.class) {
                breakingSingletonEmployee = new BreakingSingletonEmployee();
            }
        }
        return breakingSingletonEmployee;
    }
}
