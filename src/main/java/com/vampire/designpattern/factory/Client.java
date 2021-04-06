package com.vampire.designpattern.factory;

/**
 * @author ASUA
 */
public class Client {
    public static void main(String[] args) {
        Product product = Factory.createProduct();
        product.operation();
    }
}
