package com.vampire.designpattern.iterator;

/**
 * @author ASUA
 */
public interface Aggregate {
    /**
     * 抽象接口
     * @return
     */
    Iterator iterator();

    interface Iterator{
        boolean hasNext();
        Object next();
    }
}
