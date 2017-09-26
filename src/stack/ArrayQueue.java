package stack;

import java.util.Arrays;

public class ArrayQueue implements Queueable {

    private int CAPACITY = 8;

    private Integer[] myArray = new Integer[CAPACITY];
    private int front = 0;
    private int rear = 0;

    public ArrayQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
    }

    @Override
    public boolean isEmpty() {
        // if front == rear queue is empty
        return (front == rear);
    }

    @Override
    public boolean add(int element) {
        if (size() == CAPACITY - 1) {
            return false;
        }
        myArray[rear] = element;
        rear = (rear + 1) % CAPACITY;
        return true;
    }

    @Override
    public int poll() {
        if (isEmpty()) {
            return -1;
        }
        Integer temp = myArray[front];
        front = (front + 1) % CAPACITY;
        return temp;
    }

    @Override
    public int peek() {
        return myArray[front];
    }

    @Override
    public String toString() {
        String display = "";
        for (Integer integer : myArray) {
            display  = display + integer + " ";
        }
        return display;
    }

    public int size() {
        return (CAPACITY - front +rear) % CAPACITY;
    }
}
