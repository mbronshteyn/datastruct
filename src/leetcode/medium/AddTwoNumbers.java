package leetcode.medium;

/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */

public class AddTwoNumbers {

  public static void main(String[] args) {
    AddTwoNumbersSolution solution = new AddTwoNumbersSolution();

    ListNode l10 = new ListNode(2);
    ListNode l11 = new ListNode(4);
    l10.next = l11;
    ListNode l12 = new ListNode(3);
    l11.next = l12;

    ListNode l20 = new ListNode(5);
    ListNode l21 = new ListNode(6);
    l20.next = l21;
    ListNode l22 = new ListNode(4);
    l21.next = l22;

    ListNode listNode = solution.addTwoNumbers(l10, l20);

    System.out.print("[ ");
    while (listNode != null) {
      System.out.print(" " + listNode.val);

      if (listNode.next != null) {
        System.out.print(",");
      }

      listNode = listNode.next;
    }
    System.out.print(" ]");

  }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class AddTwoNumbersSolution {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    // return result of operation
    ListNode result = null;
    // keep a reference ( pointer ) into active node
    ListNode pointer = null;

    // decide if we have number above 10
    boolean overFlow = false;

    do {

      // we need to make sure we even out lists
      if (l1.next == null) {
        if (l2.next != null) {
          l1.next = new ListNode(0);
        }
      }

      if (l2.next == null) {
        if (l1.next != null) {
          l2.next = new ListNode(0);
        }
      }

      int k = l1.val + l2.val;

      // check if the previous number was above 10
      if (overFlow) {
        overFlow = false;
        k++;
      }

      // check if result in this iteration is more than 10
      if (k >= 10) {
        overFlow = true;
        k = k - 10;
      }

      if (result == null) {
        // first run. need to init both result and pointer
        result = new ListNode(k);
        pointer = result;
      } else {
        // add value
        pointer.next = new ListNode(k);
        // move the pointer
        pointer = pointer.next;
      }

      if (l1.next == null && overFlow == true) {
        pointer.next = new ListNode(1);
      }

      l1 = l1.next;
      l2 = l2.next;

    } while (l1 != null);

    return result;
  }
}

class ListNode {
  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}

