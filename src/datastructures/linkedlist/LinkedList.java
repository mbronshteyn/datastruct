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

    public Node removeLast() {
        if (length == 0) {
            return null;
        }
        var node = new Node(tail.value);
        Node temp = head;
        if (length == 1) {
            makeEmpty();
        } else {
            // need to iterate until the node before last node
            while (temp.next != tail) {
                temp = temp.next;
            }
            // now temp points to the node before last
            tail = temp;
            length--;
        }
        return node;
    }

    public void prepend(final int i) {
        var node = new Node(i);
        node.next = head;
        head = node;
    }

    public Node removeFirst() {
        Node temp = null;
        if (length == 0) {
            return temp;
        }

        if (length == 1) {
            temp = new Node(head.value);
            makeEmpty();
        } else {
            temp = new Node(head.value);
            head = head.next;
            length--;
        }
        return temp;
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

