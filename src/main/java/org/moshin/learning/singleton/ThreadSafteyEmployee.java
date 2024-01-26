package org.moshin.learning.singleton;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ThreadSafteyEmployee {

    private static ThreadSafteyEmployee threadSafteyEmployee;

    private ThreadSafteyEmployee() {
    }

    public static ThreadSafteyEmployee getThreadSafteyEmployee() {
        if (threadSafteyEmployee == null) {
            synchronized (ThreadSafteyEmployee.class) {
                threadSafteyEmployee = new ThreadSafteyEmployee();
            }
        }
        return threadSafteyEmployee;
    }
}
