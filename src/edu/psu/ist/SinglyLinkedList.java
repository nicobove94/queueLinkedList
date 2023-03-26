package edu.psu.ist;

public class SinglyLinkedList<T> {
    Node<T> head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public Node append(T data) {
        // create the new node
        Node<T> toAppend = new Node<>(data);

        // check if the list is empty (head is null)
        if (this.head == null) {
            // if the list is empty assign the new node to the head
            this.head = toAppend;
            // return it
            return this.head;
        }
        // find the last node
        Node lastNode = this.head;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }
        // add new node to the last node
        lastNode.next = toAppend;
        // return the new node
        return toAppend;
    }

    @Override
    public String toString() {
        // get a current pointer
        Node<T> toPrint = this.head;
        // get a string builder
        StringBuilder stringBuilder = new StringBuilder();
        // loop through all of the nodes
        while (toPrint != null) {
            // append the content to the str builder
            stringBuilder.append(toPrint.data);
            stringBuilder.append(" -> ");
            // advance the pointer
            toPrint = toPrint.next;
        }


        // print out null
        stringBuilder.append("NULL");
        // return the result
        return stringBuilder.toString();
    }
}
