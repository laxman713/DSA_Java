import java.util.*;

class Queue {

    int[] queue = new int[5];

    int front = 0;
    int rear = -1;

    boolean isEmpty() {
        return front > rear;
    }

    boolean isFull() {
        return rear == queue.length - 1;
    }

    void enqueue(int value) {

        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        rear++;
        queue[rear] = value;
    }

    void dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        front++;
    }

    void display() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i]);
        }
    }
}

public class Implementation{

    public static void main(String[] args) {

        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        System.out.println("Queue:");

        q.display();

        q.dequeue();

        System.out.println("After dequeue:");

        q.display();

        q.enqueue(50);

        System.out.println("After adding 50:");

        q.display();
    }
}