package heap;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //ArrayList<Integer> myList = new ArrayList<>();
        Heap heap = new Heap();

        heap.push(10);
        heap.push(20);
        heap.push(30);
        heap.push(15);
        heap.push(25);
        heap.push(35);
        heap.push(40);
        heap.push(30);

        System.out.println(heap.toString());

        heap.pop();

        System.out.println(heap.toString());
    }
}
