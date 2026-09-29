import java.util.*;

public class Implement{

    int[] stack = new int[5];
    int top = -1;

    public void push(int value) {
       if(top==stack.length-1){
        System.out.println("stack is full ");
       }else{
        top++;
        stack[top]=value;
       }
    }

    public int pop() {
        if(top!=-1){
         int value = stack[top];
         top--;
         return value;
        }else{
        return 0;
        }
        
    }

    public int peek() {
       if(top!=-1){
          return stack[top];
       }
       else{
        return 0;
       }
    }

    public boolean isEmpty() {
       if(top==-1){
        return true;
       }else{
        return false;
       }
    }

    public static void main(String[] args) {

        Implement s = new Implement();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.peek());

        System.out.println(s.pop());

        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}