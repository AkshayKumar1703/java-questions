package org.example;

import java.util.List;

public class LinkedListExamples {

    public   Node createLinkedList(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return null;
        }
        Node head = new Node();
        head.value = numbers.get(0);
        Node current = head;
        for (int i = 1; i < numbers.size(); i++) {
            Node newNode = new Node();
            newNode.value = numbers.get(i);

            current.next = newNode;
            current = newNode;

        }
        return head;
    }

    public  void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + "->");
            current = current.next;

        }
        System.out.println("null");
    }

    public  int sumOfLinkedList(Node head) {
        int sum = 0;
        while (head != null) {
            sum = sum + head.value;
            head = head.next;
        }
        return sum;
    }

    public  double avgOfLinkedList(Node head) {
        if (head == null) {
            return 0.0;
        }
        int sum = 0;
        int count = 0;
        while (head != null) {
            sum = sum + head.value;
            count++;
            head = head.next;
        }
        return (double) sum / count;

    }
}
