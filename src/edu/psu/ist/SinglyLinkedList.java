package edu.psu.ist;

public class SinglyLinkedList<T extends Comparable<T>> {
    Node head;

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

    /**
     * Return whether the list contains this thing or not
     * @param data
     * @return
     */
    public boolean contains(T data) {
        // get a pointer to the head
        Node<T> toTest = this.head;
        // loop through the list until we find it
        while (toTest != null) {
            // if find it return true
            if (toTest.data.compareTo(data) == 0) {
                return true;
            }
            // advance the pointer
            toTest = toTest.next;
        }

        // return false if we don't find it
        return false;
    }

    public Node<T> delete(T data) {
        Node<T> toDelete = null;

        // check if we are deleting the head
        if (this.head.data.compareTo(data) == 0) {
            toDelete = this.head;
            this.head = this.head.next;
            return toDelete;
        }
        // if it is we need to set the head to null
        Node<T> current = this.head;
        while (current.next != null) {
            if (current.next.data.compareTo(data) == 0) {
                toDelete = current.next;
                current.next = toDelete.next;
                toDelete.next = null;
            }

            current = current.next;

        }



        // loop through the list


        // return deleted node
        return toDelete;
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
