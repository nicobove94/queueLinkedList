package edu.psu.ist;

public class Node<T extends Comparable<T>> {
    T data;
    Node next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}