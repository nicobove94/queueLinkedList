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
    public void testToString() { // Passed
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

    @Test
    public void testContains() { // Passed
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.append(1);
        sll.append(2);
        sll.append(3);
        assertFalse(sll.contains(4));
        assertTrue(sll.contains(1));
        assertTrue(sll.contains(2));
        assertTrue(sll.contains(3));
    }

    @Test
    public void testDelete() { // Passed
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.append(1);
        sll.append(2);
        sll.append(3);
        assertNull(sll.delete(4));
        assertEquals(1, sll.delete(1).data);
    }

    @Test
    public void testEnqueue() { // Passed
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        assertNull(sll.head);
        assertNull(sll.tail);

        assertEquals(1, sll.enqueue(1).data);
        assertEquals(1, sll.head.data);
        assertEquals(1, sll.tail.data);

        sll.enqueue(2);
        sll.enqueue(3);
        assertEquals(1, sll.head.data);
        assertEquals(3, sll.tail.data);
    }

    @Test
    public void testDequeue() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        assertNull(sll.head);
        assertNull(sll.tail);
    }
}