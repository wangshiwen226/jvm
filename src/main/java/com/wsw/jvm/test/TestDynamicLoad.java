package com.wsw.jvm.test;

import sun.misc.Launcher;

/**
 * Created by Wsw on 2021/4/1 15:29
 * JVM 动态加载
 *
 * @author Wsw
 * @version 1.0
 */
public class TestDynamicLoad {
    private static B b = new B();
    static {
        System.out.println("********************** load testDynamicLoad **********************");
    }

    public static void main(String[] args) {
        new A();
        System.out.println("********************** load test **********************");

        Launcher.getLauncher();
        // 这里不new B()，B对象不会加载。
        B b = null;
    }
}
class A {
    static {
        System.out.println("********************** load A **********************");
    }

    public A(){
        System.out.println("********************** initial A **********************");
    }
}

class B {
    static {
        System.out.println("********************** load B **********************");
    }

    public B(){
        System.out.println("********************** initial B **********************");
    }
}