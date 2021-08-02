package org.butterfly.proxy.dynamic.jdk;

import java.lang.reflect.Proxy;

public class JdkProxyFactory {
    public static Object getLogProxy(Object target) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new LogAroundHandler(target));
    }
}
