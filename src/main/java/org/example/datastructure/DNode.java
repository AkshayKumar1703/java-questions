package org.example.datastructure;

public class DNode {
    Integer value;
    DNode prev;
    DNode next;
    public DNode(int value) {
        this.value = value;
        prev = null;
        next = null;
    }
}
