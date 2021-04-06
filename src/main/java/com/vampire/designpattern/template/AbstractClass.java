package com.vampire.designpattern.template;

/**
 * @author ASUA
 */
public abstract class AbstractClass {
    public void templateMethod(){
        System.out.println("这是通用逻辑");
        method1();
        method2();
        method3();
    }

    public abstract void method1();
    public abstract void method2();
    public abstract void method3();
}
