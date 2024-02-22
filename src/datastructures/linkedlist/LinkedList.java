package datastructures.linkedlist;

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

}

