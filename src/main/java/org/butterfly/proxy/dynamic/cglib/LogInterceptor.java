package org.butterfly.proxy.dynamic.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class LogInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        String methodName = obj.getClass().getName() + "#" + method.getName();
        System.out.println("[LogInterceptor]start execute method : " + methodName);
        Object res = methodProxy.invokeSuper(obj, args);
        System.out.println("[LogInterceptor]end execute method : " + methodName);
        return res;
    }
}
