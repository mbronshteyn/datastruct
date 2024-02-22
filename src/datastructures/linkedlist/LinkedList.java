package datastructures.linkedlist;

import org.w3c.dom.Node;

public class LinkedList {


    // CREATE CLASS VARIABLES, NODE CLASS, AND CONSTRUCTOR HERE //
    //                                                          //
    //                                                          //
    //                                                          //
    //                                                          //

    Node head;
    Node tail;
    int length;

    public LinkedList(int value) {
        var node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    public void append(final int i) {
        // check if the list has only one node
        var node = new Node(i);
        if (head == tail) {
            if (head == null) {
                head = node;
                tail = node;
            } else {
                head.next = node;
                tail = node;
            }
        } else {
            tail.next = node;
            tail = node;
        }
        length++;
    }


    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    //////////////////////////////////////////////////////////////

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    // WRITE APPEND METHOD HERE //
    //                          //
    //                          //
    //                          //
    //                          //
    //////////////////////////////

}

