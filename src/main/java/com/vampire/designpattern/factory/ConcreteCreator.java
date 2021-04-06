package com.vampire.designpattern.factory;

/**
 * @author ASUA
 */
public class ConcreteCreator extends Creator{
    @Override
    public Product factoryMethod() {
        System.out.println("生产自己特有产品的特殊逻辑");
        return new ConcreteProduct();
    }
}
