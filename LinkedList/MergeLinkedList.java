/* 21. Merge Two Sorted Lists
Easy
Topics
premium lock icon
Companies
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

 

Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 

Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order. */

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeLinkedList {
    public static void main(String[] args) {

        // First Linked List
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        Node head1 = n1;

        n1.next = n2;
        n2.next = n3;


        // Second Linked List
        Node m1 = new Node(15);
        Node m2 = new Node(25);
        Node m3 = new Node(35);

        Node head2 = m1;

        m1.next = m2;
        m2.next = m3;


        // Merge
        Node dummy = new Node(0);
        Node current = dummy;

        while (head1 != null && head2 != null) {

            if (head1.data < head2.data) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }

            current = current.next;
        }

        if (head1 != null) {
            current.next = head1;
        }

        if (head2 != null) {
            current.next = head2;
        }

        Node head = dummy.next;

        while (head != null) {
            System.out.print(head.data );
            head = head.next;
        }

        System.out.println("null");
    }
}