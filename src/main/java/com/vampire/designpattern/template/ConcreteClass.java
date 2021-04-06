package com.vampire.designpattern.template;

/**
 * @author ASUA
 */
public class ConcreteClass extends AbstractClass{
    @Override
    public void method1() {
        System.out.println("实现优惠打折1的部分逻辑");
    }

    @Override
    public void method2() {
        System.out.println("实现优惠打折2的部分逻辑");
    }

    @Override
    public void method3() {
        System.out.println("实现优惠打折3的部分逻辑");
    }
}
