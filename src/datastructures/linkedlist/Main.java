package datastructures.linkedlist;


public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.makeEmpty();
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();

        /*
       		EXPECTED OUTPUT:
        	----------------
        	Head: 1
        	Tail: 3
        	Length: 3

        	Linked List:
        	1
        	2
        	3

     	*/
    }

}

