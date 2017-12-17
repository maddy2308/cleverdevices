package com.cleverdevices.utility.datastructures;

public class MyStackImpl<E> implements MyStack<E> {

    private MyLinkedList<E> myLinkedList = new MyLinkedList<>();

    @Override
    public void push(E element) {
        myLinkedList.insert(element);
    }

    @Override
    public E pop() {
        return myLinkedList.deleteTopNode();
    }

    @Override
    public long size() {
        return myLinkedList.getSize();
    }

    @Override
    public boolean isEmpty() {
        return myLinkedList.isEmpty();
    }
}
