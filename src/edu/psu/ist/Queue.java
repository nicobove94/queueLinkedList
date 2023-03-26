package edu.psu.ist;

public class Queue<T extends Comparable<T>> {
    SinglyLinkedList<T> singlyLinkedList;
    private Node<T> front;
    private Node<T> rear;

    public Queue() {
        singlyLinkedList = new SinglyLinkedList<>();
        front = null;
        rear = null;
    }
}