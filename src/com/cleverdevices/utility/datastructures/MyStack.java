package com.cleverdevices.utility.datastructures;

public interface MyStack<K> {

    void push(K element);
    K pop();
    long size();
    boolean isEmpty();
}
