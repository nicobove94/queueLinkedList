package edu.psu.ist;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
    @org.junit.jupiter.api.Test
    public void testConstructor() { // Passed
        Node<String> stringNode = new Node<>("data");
        assertEquals("data", stringNode.data);

        Node<Integer> intNode = new Node<>(1);
        assertEquals(1, intNode.data);
    }
}