package org.butterfly.proxy.dynamic;

import org.butterfly.proxy.dynamic.cglib.Butterfly;
import org.butterfly.proxy.dynamic.cglib.CglibProxyFactory;
import org.butterfly.proxy.dynamic.jdk.JdkProxyFactory;
import org.butterfly.proxy.dynamic.jdk.Person;
import org.butterfly.proxy.dynamic.jdk.Sleep;

public class Main {
    public static void main(String[] args) {
        Sleep person = (Sleep) JdkProxyFactory.getLogProxy(new Person());
        person.sleep();

        Butterfly butterfly = (Butterfly) CglibProxyFactory.getLogProxy(Butterfly.class);
        butterfly.fly();
    }
}
