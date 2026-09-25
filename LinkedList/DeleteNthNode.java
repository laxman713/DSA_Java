// Next: Delete a Node at a Given Position

// Given:

// 10 → 20 → 30 → 40 → null

// Delete the node at position 3.

// Positions are 1-based:

// 10 → 20 → 30 → 40
//  1     2     3     4

// Expected:

// 10 → 20 → 40 → null
// Your task

// Traverse until you reach the node before the node you want to delete.

// For position 3, you need to stop at:

// current
//    ↓
// 20 → 30 → 40 → null

// Then change the links so 20 points directly to 40.


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteNthNode {
    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        Node head = n1;

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        int position = 3;
         int count = 1;
         Node current = head;

while (current != null) {
    if (count == position - 1) {
        current.next = current.next.next;
        break;
    }

    current = current.next;
    count++;
}



        
         current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}