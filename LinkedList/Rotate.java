/* iven the head of a linked list, rotate the list to the right by k places.

 

Example 1:


Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]
Example 2:


Input: head = [0,1,2], k = 4
Output: [2,0,1]
 

Constraints:

The number of nodes in the list is in the range [0, 500].
-100 <= Node.val <= 100
0 <= k <= 2 * 109 */

class Node{
        int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Rotate{
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
     
        int n =0;
        int k =2;


        Node curr = head;
        while(curr!=null){

            n++;
            curr = curr.next;
        }

       k = k%n;

       // Reverse entre Linked list
     Node prev = null;
     curr = head;
       while(curr!=null){
        Node next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
       }

       head = prev;

       prev = null;
       curr = head;

       for(int i=0;i<k;i++){
        Node next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
       }
       head = prev;
       prev = null;

       while(curr!=null){
        Node next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
       }

       Node tail = head;
       while(tail.next!=null){
        tail = tail.next;
       }
       tail.next = prev;

       System.out.println(head.data);

    }
}