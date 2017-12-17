package com.cleverdevices.utility.datastructures;

public class MyLinkedList<E> {

    private Node<E> top;
    private boolean isEmpty = true;
    private long size = 0;

    void insert(E data) {
        if (isEmpty) {
            top = new Node<>(data);
        } else {
            Node<E> newTop = new Node<>(data);
            top.setNext(newTop);
            newTop.setPrevious(top);
            top = newTop;
        }
        isEmpty = false;
        size++;
    }

    E deleteTopNode() {
        Node<E> deletedNode;
        if (top != null) {
            deletedNode = top;
            Node<E> previous = top.getPrevious();
            if (previous != null) {
                previous.setNext(null);
            }
            top = previous;
            size--;
            checkAndSetEmpty();
            return deletedNode.getData();
        } else {
            throw new NullPointerException("No data to pop");
        }
    }

    public Node<E> getTop() {
        return top;
    }

    long getSize() {
        return size;
    }

    private void checkAndSetEmpty() {
        isEmpty = size == 0;
    }

    boolean isEmpty() {
        return isEmpty;
    }
}
