
class Node{
   int data;
   Node next;
   Node(int data){
    this.data = data;
    this.next = null;
   }
}
public class Palindrome{
    public static void main(String[] args) {
        Node n1= new Node(10);
        Node n2= new Node(20);
        Node n3 = new Node(20);
        Node n4 = new Node(10);
        Node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;

        Node slow = head;
        Node fast = head;
        while(slow!=null&&fast!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node prev = null;
        Node curr = slow;
        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node first = head;
        Node second = prev;
        boolean flag = true;
        while(second!=null){
            if(first.data!=second.data){
                flag = false;
                break;
            }else{
                first = first.next;
                second = second.next;
            }
        }
        System.out.println(flag);
     
}
}