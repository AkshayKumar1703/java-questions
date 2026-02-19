package org.example.datastructure;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListExamplesTest {
    DNode head;
    DNode tail;
    DoublyLinkedListExamples doublyLinkedListExamples = new DoublyLinkedListExamples();

    private DNode createList() {
        DNode first = new DNode(1);
        DNode second = new DNode(2);
        DNode third = new DNode(3);

        first.next = second;
        second.prev = first;
        second.next = third;
        third.prev = second;

        return first;  // head
    }

    @Test
    void testPrint() {
        DNode head = createList();
        DNode tail = head.next.next;

        System.out.print("Normal list print → ");
        doublyLinkedListExamples.printDl(head, tail);

    }

    @Test
    void ShouldAddAtTheEndOfEmptyList() {
        DNode newNode = new DNode(42);

        DNode newTail = doublyLinkedListExamples.insertAtTheEnd(newNode, null);

        assertSame(newNode, newTail);
        assertNull(newTail.prev);
        assertNull(newTail.next);
        assertEquals(42, newTail.value);

    }

    @Test
    void ShouldAddAtTheEndOfList() {
        DNode tail = createList();
        DNode newNode = new DNode(50);

        DNode newTail = doublyLinkedListExamples.insertAtTheEnd(newNode, tail);

        assertSame(newNode, newTail);
        assertEquals(50, newTail.value);
        assertNull(newNode.next);
    }

    @Test
    void shouldInsertAtTheBeginning() {
        DNode newNode = new DNode(60);

        DNode newHead = doublyLinkedListExamples.insertAtTheBeginning(newNode, null);

        assertSame(newNode, newHead);
        assertNull(newHead.prev);
        assertNull(newHead.next);
        assertEquals(60, newHead.value);

    }

    @Test
    void ShouldInsertAtTheBeginningOfList() {
        DNode head = createList();        // 10→20→30
        DNode newNode = new DNode(5);

        DNode newHead = doublyLinkedListExamples.insertAtTheEnd(newNode, head);

        assertSame(newNode, newHead);
        assertEquals(5, newHead.value);
        assertNull(newNode.next);
    }

    @Test
    void testArrayToDList() {
        DNode head = null;
        DNode tail = null;
        List<Integer> numbers = List.of(1, 2, 3, 4);

        List<DNode> headTail = new ArrayList<>();
        headTail.add(head);
        headTail.add(tail);
        List<DNode> newHeadTail = doublyLinkedListExamples.arrayListToDList(numbers, headTail);
        head = newHeadTail.getFirst();
        tail = newHeadTail.getLast();
        doublyLinkedListExamples.printDl(head, tail);

    }

    @Test
    void testSumOfNodes() {
        DNode head = createList();

        int actual = doublyLinkedListExamples.sumOfAllNodes(head);
        assertEquals(6,actual);
    }

}