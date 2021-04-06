package com.vampire.designpattern.factory;

/**
 * @author ASUA
 */
public class Factory {
    public static Product createProduct() {
        return new ProductImpl();
    }
}
