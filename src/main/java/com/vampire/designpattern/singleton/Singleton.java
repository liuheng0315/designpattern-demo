package com.vampire.designpattern.singleton;

/**
 * @author ASUA
 */
public class Singleton {
    // 饿汉模式
    private static final Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }
}
