class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Reverse{
    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        Node head = n1;

        n1.next = n2;
        n2.next = n3;
        n3.next = null;

        // Write your reverse logic here
        Node current = head;
        Node previous = null;
        
        while(current!=null){
          Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
     head = previous;
        current = head;
        while(current!=null){
            System.out.println(current.data);
            current = current.next;
        }


    }
}