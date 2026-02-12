package org.example;
import org.example.datastructure.LinkedListExamples;
import org.example.datastructure.Node;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListExamplesTest {
LinkedListExamples linkedListExamples = new LinkedListExamples();

    @Test
    void testSumOfLinkedList() {
        List<Integer> numbs = List.of(10, 20, 30);
        Node head = linkedListExamples.createLinkedList(numbs);

        int result = linkedListExamples.sumOfLinkedList(head);
        assertEquals(60, result, "Sum of 10, 20, 30 should be 60");
    }

    @Test
    void testAvgOfLinkedList() {
        List<Integer> numbs = List.of(10, 20, 30);
        Node head = linkedListExamples.createLinkedList(numbs);

        double result = linkedListExamples.avgOfLinkedList(head);
        assertEquals(20.0, result, "Avg of 10, 20, 30 should be 20.0");
    }

    @Test
    void testEmptyList() {

        List<Integer> emptyList = List.of();
        Node head = linkedListExamples.createLinkedList(emptyList);

        assertNull(head, "Head should be null for empty input");
        assertEquals(0, linkedListExamples.sumOfLinkedList(head));
        assertEquals(0.0, linkedListExamples.avgOfLinkedList(head));
    }

    @Test
    void testSingleElement() {
        List<Integer> numbs = List.of(2);
        Node head = linkedListExamples.createLinkedList(numbs);

        assertEquals(2, linkedListExamples.sumOfLinkedList(head));
        assertEquals(2.0, linkedListExamples.avgOfLinkedList(head), "Avg of 2 should be 2.0");

    }
}