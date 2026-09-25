/* uestion: Insert a Node at the Nth Position

Write a Java program to insert a new node into an existing singly linked list at a given position.

Input

Create this linked list:

10 → 20 → 30 → 40 → null

Insert a new node with value 25 at position 3.

Positions are 1-based:

Position:  1    2    3    4
           ↓    ↓    ↓    ↓
           10 → 20 → 30 → 40
Expected result
10 → 20 → 25 → 30 → 40 → null */


class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class InsertNthnode{
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
    

    int position = 3;
    int count = 1;
    Node newNode = new Node(25);
        Node head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        Node current = head;
        while(current!=null){
            current = current.next;
            count++;
            if(count==position-1){
                newNode.next = current.next;
                current.next = newNode;
                break;
            }
        }
  current = head;
        while(current!=null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}