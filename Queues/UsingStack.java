import java.util.*;

class QueueUsingStacks {

    Stack<Integer> st1;
    Stack<Integer> st2;

    QueueUsingStacks() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    void enqueue(int value) {

        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }

        st1.push(value);

        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }
    }

    void dequeue() {

        if (st1.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        st1.pop();
    }

    int peek() {

        if (st1.isEmpty()) {
            return -1;
        }

        return st1.peek();
    }

    boolean isEmpty() {

        return st1.isEmpty();
    }

    void display() {

        if (st1.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        Stack<Integer> temp = new Stack<>();

        while (!st1.isEmpty()) {
            int value = st1.pop();

            System.out.println(value);

            temp.push(value);
        }

        while (!temp.isEmpty()) {
            st1.push(temp.pop());
        }
    }
}

public class UsingStack {

    public static void main(String[] args) {

        QueueUsingStacks q = new QueueUsingStacks();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Queue:");

        q.display();

        q.dequeue();

        System.out.println("After dequeue:");

        q.display();

        q.enqueue(40);

        System.out.println("After adding 40:");

        q.display();

        System.out.println("Front: " + q.peek());
    }
}