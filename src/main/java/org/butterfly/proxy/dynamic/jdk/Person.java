package org.butterfly.proxy.dynamic.jdk;

public class Person implements Sleep{
    @Override
    public void sleep() {
        System.out.println("close your eyes.");
    }
}
