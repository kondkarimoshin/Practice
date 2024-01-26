package org.moshin.learning.singleton;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class EagerEmployee implements Serializable, Cloneable {

    private static EagerEmployee eagerEmployee = new EagerEmployee();

    public static EagerEmployee getEagerEmployee() {
        return eagerEmployee;
    }

    public Object readResolve() {
        return eagerEmployee;
    }

    @Override
    public EagerEmployee clone(){
        return eagerEmployee;
    }
}