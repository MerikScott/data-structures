package stack;

import java.util.Arrays;

public class ArrayQueue implements Queueable {

    int max_elements_number;

    private Integer[] myArray = new Integer[max_elements_number];
    private int first = 0;
    private int last = 0;

    public ArrayQueue(int max_elements_number, Integer[] myArray) {
        this.max_elements_number = max_elements_number;
        this.myArray = myArray;
    }


    @Override
    public boolean empty() {
        return false;
    }

    @Override
    public boolean add(int e) {
        if ((last+1) % max_elements_number == first) { // if there is free space to add element
            if ((last+1) % (max_elements_number) == 0) {
                last = 0;
            } else {
                last = last + 1;
            }
            myArray[last] = e;
            return true;
            } else {
            return false;
        }

    }

    @Override
    public int poll() {
        if (first==0) {

        }
        return 0;
    }

    @Override
    public int peek() {
        return 0;
    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
                "myArray=" + Arrays.toString(myArray) +
                ", first=" + first +
                ", last=" + last +
                '}';
    }
}
