
/* You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 

Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.*/
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class AddtwoLLs {
    public static void main(String[] args) {

        // First Linked List
        Node n1 = new Node(2);
        Node n2 = new Node(4);
        Node n3 = new Node(3);

        Node head1 = n1;

        n1.next = n2;
        n2.next = n3;


        // Second Linked List
        Node m1 = new Node(5);
        Node m2 = new Node(6);
        Node m3 = new Node(4);

        Node head2 = m1;

        m1.next = m2;
        m2.next = m3;
        

        Node dummy = new Node(0);
        Node tail = dummy;
        int carry = 0;
        while(head1!=null||head2!=null){
           int sum = carry;
           if(head1!=null){
            sum = sum+head1.data;
            head1 = head1.next;
           }
           if(head2!=null){
            sum = sum+head2.data;
            head2 = head2.next;
           }

           int digit = sum%10;
           carry = sum/10;

           tail.next = new Node(digit);
           tail = tail.next;
        }
        if(carry!=0){
            tail.next = new Node(carry);
        }
        Node head = dummy.next;

        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        

    }
}}