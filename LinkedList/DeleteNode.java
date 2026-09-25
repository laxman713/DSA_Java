/* Question: Delete the First Node

Given:

10 → 20 → 30 → 40 → null

Delete the first node (10).

Expected:

20 → 30 → 40 → null
Requirements
Create the Node class.
Create nodes 10, 20, 30, 40.
Connect them.
Set:
Node head = n1;
Delete the first node.
Print the complete linked list. */


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteNode {
    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        Node head = n1;

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        head = n2;


        // Print the linked list
        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}