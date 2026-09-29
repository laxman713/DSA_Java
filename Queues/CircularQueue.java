import java.util.*;

class Queue {

    int[] queue = new int[5];

    int front = -1;
    int rear = -1;

    boolean isEmpty() {
        return front == -1;
    }

    boolean isFull() {
        return (rear + 1) % queue.length == front;
    }

    void enqueue(int value) {

        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (isEmpty()) {
            front = 0;
            rear = 0;
        }
        else {
            rear = (rear + 1) % queue.length;
        }

        queue[rear] = value;
    }

    void dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        if (front == rear) {
            front = -1;
            rear = -1;
        }
        else {
            front = (front + 1) % queue.length;
        }
    }

    void display() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        int i = front;

        while (true) {

            System.out.println(queue[i]);

            if (i == rear) {
                break;
            }

            i = (i + 1) % queue.length;
        }
    }
}

public class CircularQueue{

    public static void main(String[] args) {

        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        System.out.println("Queue:");

        q.display();

        q.dequeue();
        q.dequeue();

        System.out.println("After dequeue:");

        q.display();

        q.enqueue(60);
        q.enqueue(70);

        System.out.println("After adding:");

        q.display();
    }
}