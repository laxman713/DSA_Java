/* Next Question: Insert a Node at the End

Write a Java program to insert a new node at the end of an existing singly linked list.

Input

Create this linked list:

10 → 20 → 30 → null

Insert a new node with value 40 at the end.

Expected result
10 → 20 → 30 → 40 → null
Requirements
Create the Node class with:
int data
Node next
Create nodes:
10, 20, 30
Connect them:
10 → 20 → 30 → null
Set:
Node head = n1;
Create:
Node newNode = new Node(40);
Traverse the list until you reach the last node.
Connect the last node to newNode.
Print the complete linked list.
Expected output
10
20
30
40 */

class Node{
   int data;
   Node next;
   Node(int data){
    this.data = data;
    this.next = null;
   }
}
public class InsertNodeEnd{
    public static void main(String[] args) {
        Node n1= new Node(10);
        Node n2= new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        Node newNode = new Node(50);
      Node current = head;
        while(current!=null){
            if(current.next == null){
             newNode.next = current.next;
             current.next = newNode;
             break;
            }
            current = current.next;
    }
    current = head;
    while(current!=null){
        System.out.println(current.data);
        current = current.next;
    }


    }
}