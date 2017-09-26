import stack.*;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Integer[] stackMain = new Integer[8];
        Integer[] stackAuxiliary = new Integer[8];
        StackQueue stackQueue = new StackQueue(stackMain, stackAuxiliary);
        stackQueue.add(10);

        System.out.println(stackQueue.toString());
        stackQueue.add(20);
        System.out.println(stackQueue.toString());

        stackQueue.add(30);
        System.out.println(stackQueue.toString());

        stackQueue.add(40);
        System.out.println(stackQueue.toString());

        stackQueue.add(50);
        System.out.println(stackQueue.toString());

        stackQueue.add(60);
        System.out.println(stackQueue.toString());

        stackQueue.add(70);
        System.out.println(stackQueue.toString());

        stackQueue.add(80);
        System.out.println(stackQueue.toString());

        stackQueue.add(90);
        System.out.println(stackQueue.toString());

        System.out.println("Queue front is: " + stackQueue.peek());
        System.out.println("I took front element: " + stackQueue.poll());
        System.out.println(stackQueue.toString());

        System.out.println("I took front element: " + stackQueue.poll());
        System.out.println(stackQueue.toString());

        stackQueue.add(90);
        System.out.println(stackQueue.toString());

        stackQueue.add(100);
        System.out.println(stackQueue.toString());

        stackQueue.add(110);
        System.out.println(stackQueue.toString());
    }
}



        /* - - - - - - - - - - - - - - - -
        // array queue starts here

        ArrayQueue arrayQueue = new ArrayQueue(8);

        System.out.println("Array is empty: " + arrayQueue.isEmpty());
        System.out.println("Adding element");
        arrayQueue.add(10);
        System.out.println("Array is empty: " + arrayQueue.isEmpty());
        System.out.println("Adding element");
        arrayQueue.add(20);
        System.out.println("At the front of the queue is " + arrayQueue.peek());
        System.out.println("I just took element " + arrayQueue.poll() + " from the queue ");
        System.out.println("At the front of the queue is " + arrayQueue.peek());
        System.out.println("Adding element");
        arrayQueue.add(20);
        System.out.println(arrayQueue.toString());
        System.out.println("Adding element");
        arrayQueue.add(30);
        System.out.println(arrayQueue.toString());

        System.out.println("Adding element");
        arrayQueue.add(40);
        System.out.println(arrayQueue.toString());

        System.out.println("Adding element");
        arrayQueue.add(50);
        System.out.println(arrayQueue.toString());

        System.out.println("Adding element");
        arrayQueue.add(60);
        System.out.println(arrayQueue.toString());

        System.out.println("Adding element");
        arrayQueue.add(70);
        System.out.println(arrayQueue.toString());

        System.out.println("Adding element");
        arrayQueue.add(80);
        System.out.println(arrayQueue.toString());

        System.out.println("Adding element");
        arrayQueue.add(90);
        System.out.println(arrayQueue.toString());

    }
}
// arrayQueue ends here
*/

/*
        MyList myList = new MyList();

        System.out.println("List is empty = " + myList.empty());

        System.out.println("Adding first element");
        myList.add(5, 0);

        //myList.clear();

        myList.print();

        myList.add(7, 1);
        myList.print();


        myList.add(6, 1);
        myList.print();

        System.out.println("element 2 is = "+ myList.findElement(2));

        System.out.println("value of last is " + myList.last());
        System.out.println("value of first is " + myList.first());

       Iterator iterator = myList.iterator();
        while (iterator.hasNext()) {
            Integer i = (Integer)iterator.next();
            System.out.println(i);
        }

        myList.remove(2);
        myList.print();

        myList.removeElement(6);
        myList.print();


        System.out.println("List is empty = " + myList.empty());

    }
}

*/


/*
        int MAX_ELEMENTS_NUMBER = 10;
        Integer myArray[] = new Integer[MAX_ELEMENTS_NUMBER];

        ArrayQueue arrayQueue = new ArrayQueue(MAX_ELEMENTS_NUMBER, myArray);

        System.out.println("queue created");

*//*        Integer myArray[] = new Integer[100];
        for (Integer integer : myArray) {
            integer = null;
        }*//*


        System.out.println(arrayQueue.toString());
        arrayQueue.add(2);
        System.out.println(arrayQueue.toString());


    }
}*/

/*      Stack test

 */

/*
        int index = -1;
        //myArray[index] = null;
        int element = 10;
        int element1 = 20;
        int element2 = 30;
        int element3 = 40;

        //        myArray[0] = -1;

        ArrayStack myStack = new ArrayStack(myArray, index);

        //System.out.println("Stack has " + myStack.peek() + " at the top");

        System.out.println(element + " pushed to the top of the stack. Operation status is " + myStack.push(element) + " index is " + myStack.getIndex());
        System.out.println(element1 + " pushed to the top of the stack. Operation status is " + myStack.push(element1) + " index is " + myStack.getIndex());
        System.out.println(element1 + " pushed to the top of the stack. Operation status is " + myStack.push(element1) + " index is " + myStack.getIndex());

        System.out.println("Stack has " + myStack.peek() + " at the top, index is " + myStack.getIndex() );

        System.out.println("I have taken element " + myStack.pop() + " from stack, index lowered to " + myStack.getIndex());

        System.out.println("Cleaning top of the stack. Operation status is: " + myStack.empty() + " actual index is " + myStack.getIndex());

        System.out.println("Stack has " + myStack.peek() + " at the top");

        System.out.println(element1 + " pushed to the top of the stack. Operation status is " + myStack.push(element1) + "index is " + myStack.getIndex());
        System.out.println("Stack has " + myStack.peek() + " at the top");
        System.out.println(element2 + " pushed to the top of the stack. Operation status is " + myStack.push(element2) + "index is " + myStack.getIndex());
        System.out.println("Stack has " + myStack.peek() + " at the top");
        System.out.println("Cleaning top of the stack. Operation status is: " + myStack.empty() + " actual index is " + myStack.getIndex());
        System.out.println("Stack has " + myStack.peek() + " at the top");

        System.out.println("Cleaning top of the stack. Operation status is: " + myStack.empty() + " actual index is " + myStack.getIndex());
        System.out.println("Stack has " + myStack.peek() + " at the top");

        System.out.println("Cleaning top of the stack. Operation status is: " + myStack.empty() + " actual index is " + myStack.getIndex());
        System.out.println("Stack has " + myStack.peek() + " at the top");


    }
}
*/