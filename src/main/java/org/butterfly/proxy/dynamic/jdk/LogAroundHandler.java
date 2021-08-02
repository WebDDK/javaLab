package org.butterfly.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogAroundHandler implements InvocationHandler {
    private Object target;

    LogAroundHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = target.getClass().getName() + "#" + method.getName();
        System.out.println("[LogAroundHandler]start execute method : " + methodName);
        Object res = method.invoke(target, args);
        System.out.println("[LogAroundHandler]end execute method : " + methodName);
        return res;
    }
}
