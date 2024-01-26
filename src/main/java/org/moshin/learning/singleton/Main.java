package org.moshin.learning.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
//        LazyEmployee e1 = LazyEmployee.getLazyEmployee();
//        System.out.println(e1.hashCode());


//        LazyEmployee e2 = LazyEmployee.getLazyEmployee();
//        System.out.println(e2.hashCode());
//
        //System.out.println("Deserialization Started!!!");
        EagerEmployee e3 = EagerEmployee.getEagerEmployee();
        System.out.println(e3.hashCode());

//        EagerEmployee e4 = EagerEmployee.getEagerEmployee();
//        System.out.println(e4.hashCode());
//
//
//        ThreadSafteyEmployee e5 = ThreadSafteyEmployee.getThreadSafteyEmployee();
//        System.out.println(e5.hashCode());
//
//        ThreadSafteyEmployee e6 = ThreadSafteyEmployee.getThreadSafteyEmployee();
//        System.out.println(e6.hashCode());
//
//
//        Constructor<ThreadSafteyEmployee> threadSafteyEmployeeConstructor = ThreadSafteyEmployee.class.getDeclaredConstructor();
//        threadSafteyEmployeeConstructor.setAccessible(true);
//        ThreadSafteyEmployee e7 = threadSafteyEmployeeConstructor.newInstance();
//        System.out.println(e7.hashCode());

//        BreakingSingletonEmployee e8 = BreakingSingletonEmployee.getBreakingSingletonEmployee();
//        System.out.println(e8.hashCode());

//        Constructor<BreakingSingletonEmployee> breakingSingletonEmployeeConstructor = BreakingSingletonEmployee.class.getDeclaredConstructor();
//        breakingSingletonEmployeeConstructor.setAccessible(true);
//        BreakingSingletonEmployee e9 = breakingSingletonEmployeeConstructor.newInstance();
//        System.out.println(e9.hashCode());

//        EnumEmployee e10 = EnumEmployee.INSTANCE;
//        System.out.println(e10.hashCode());
//
//        Constructor<EnumEmployee> enumEmployeeConstructor = EnumEmployee.class.getDeclaredConstructor();
//        enumEmployeeConstructor.setAccessible(true);
//        EnumEmployee e11 = enumEmployeeConstructor.newInstance();
//        System.out.println(e11.hashCode());

//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
//        oos.writeObject(e3);
//        System.out.println("Deserialization Ends!!!");
//
//        System.out.println("Serialization Started!!!");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
//        EagerEmployee e12 = (EagerEmployee) ois.readObject();
//        System.out.println(e12.hashCode());
//        System.out.println("Serialization Ends!!!");

        EagerEmployee e13 = e3.clone();
        System.out.println(e13.hashCode());
    }
}