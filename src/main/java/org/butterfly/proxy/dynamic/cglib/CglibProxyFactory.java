package org.butterfly.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;

public class CglibProxyFactory {
    public static Object getLogProxy(Class<?> cls) {
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(cls.getClassLoader());
        enhancer.setSuperclass(cls);
        enhancer.setCallback(new LogInterceptor());
        return enhancer.create();
    }
}
