package org.example.datastructure;

import java.util.List;

public class DoublyLinkedListExamples {

    public void printDl(DNode head, DNode tail) {
        DNode current = head;
        while (current != tail) {
            // Print current node data
            System.out.print(current.value + " <-> ");
            // Move to next node
            current = current.next;
        }
        System.out.println(tail.value);
    }

    public DNode insertAtTheEnd(DNode node, DNode tail) {
        if (tail == null) {
            return node;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;

        return tail;
    }

    public DNode insertAtTheBeginning(DNode newNode, DNode head) {
        if (head == null) {
            return newNode;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        return head;
    }

    public List<DNode> arrayListToDList(List<Integer> numbers, List<DNode> headTail) {
        for (Integer number : numbers) {

            DNode current = new DNode(number);

            if (headTail.getFirst() == null) {
                headTail.set(0, current);
            }
            DNode newTail = insertAtTheEnd(current, headTail.getLast());
            headTail.set(1, newTail);
        }
        return headTail;
    }

    public int sumOfAllNodes(DNode head) {
        DNode current = head;
        int sum = 0;
        while (current != null) {
        sum = sum+ current.value;
            current = current.next;
        }
        return sum;
    }
}
