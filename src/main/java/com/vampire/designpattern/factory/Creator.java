package com.vampire.designpattern.factory;

/**
 * @author ASUA
 */
public abstract class Creator {
    public Product create() {
        System.out.println("生产一个产品的共有逻辑");
        return factoryMethod();
    }

    public abstract Product factoryMethod();
}
