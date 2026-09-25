class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }

}

public class InsertNode{
    public static void main(String[] args) {
        
    
    Node n1 = new Node(10);
    Node n2 = new Node(20);
    Node n3 = new Node(30);
   Node head = n1;

    n1.next = n2;
    n2.next = n3;
    n3.next = null;
    Node newNode = new Node(1);

   newNode.next = head;
   head = newNode;

   System.out.println(head.data);

}
}