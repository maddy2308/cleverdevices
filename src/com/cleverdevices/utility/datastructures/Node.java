package com.cleverdevices.utility.datastructures;

class Node<E> {

    private E data;
    private Node<E> next;
    private Node<E> previous;

    Node(E data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    E getData() {
        return data;
    }

    void setData(E data) {
        this.data = data;
    }

    Node<E> getNext() {
        return next;
    }

    void setNext(Node<E> next) {
        this.next = next;
    }

    Node<E> getPrevious() {
        return previous;
    }

    void setPrevious(Node<E> previous) {
        this.previous = previous;
    }
}
