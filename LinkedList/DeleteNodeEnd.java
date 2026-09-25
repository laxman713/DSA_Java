/* Next: Delete the Last Node

Given:

10 → 20 → 30 → 40 → null

Delete 40.

Expected:

10 → 20 → 30 → null
Your task

Traverse the list until you reach the second-last node.

Then change its next to null.

Hint:

if (current.next.next == null)

At that point:

current
  ↓
30 → 40 → null

You need to make:

30 → null */

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteNodeEnd {
    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        Node head = n1;

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        n3.next = null;

        // Print the linked list
        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}