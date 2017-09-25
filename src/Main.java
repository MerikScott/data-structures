import stack.ArrayQueue;
import stack.ArrayStack;
import stack.Element;
import stack.MyList;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

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