package edu.psu.ist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {
    @Test
    public void testConstructor() { // Passed
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        assertNull(sll.head);
    }

    @Test
    public void testAppend() { // Passed
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        assertNull(sll.head);
        sll.append(1);
        assertEquals(1, sll.head.data);
        sll.append(2);
        sll.append(3);
        assertEquals(2, sll.head.next.data);
        assertEquals(3, sll.head.next.next.data);
    }

    @Test
    public void testToString() { // PASSED
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        assertNull(sll.head);
        assertEquals("NULL", sll.toString());
        sll.append(1);
        assertEquals("1 -> NULL", sll.toString());
        assertEquals(1, sll.head.data);

        sll.append(2);
        assertEquals("1 -> 2 -> NULL", sll.toString());
        assertEquals(2, sll.head.next.data);

        sll.append(3);
        assertEquals("1 -> 2 -> 3 -> NULL", sll.toString());
        assertEquals(3, sll.head.next.next.data);
    }
}