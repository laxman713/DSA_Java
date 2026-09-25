/* Question: Traverse a Linked List

Write a Java program to create a singly linked list containing:

10 → 20 → 30 → 40 → null

Then traverse the linked list and print every element.

Requirements
Create a Node class with:
int data
Node next
Create the nodes:
10, 20, 30, 40
Connect them:
10 → 20 → 30 → 40 → null
Set the first node as:
Node head
Traverse the list using a temporary variable, not by changing head.
Expected output:
10
20
30
40 */


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CreateNode {
    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        Node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        Node current = head;
        while(current!=null){
            System.out.println(current.data);
            current = current.next;
        }

        


    }
}

