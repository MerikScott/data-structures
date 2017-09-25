package stack;

public class ArrayStack implements Stackable {

    private Integer[] myArray = new Integer[100];
    private int index = 0;

    public Integer[] getMyArray() {
        return myArray;
    }

    public void setMyArray(Integer[] myArray) {
        this.myArray = myArray;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public ArrayStack(Integer[] myArray, Integer index) {
        this.myArray = myArray;
        this.index = index;
    }

    @Override
    public boolean empty() {
        if (index>-1) {
            index--;
            return true;
        } else {
            System.out.println("Sorry, stack is empty already");
            return false;
        }
    }

    @Override
    public boolean push(int e) {
        if (index<myArray.length) {
            index++;
            myArray[index] = e;
            System.out.println("Push here, we have " + e + " at index " + index + " myArray field is " + myArray[index]);
            return true;
        } else {
            System.out.println("Sorry, stack overloaded.");
            return false;
        }
    }

    @Override
    public int pop() {
        if (index > -1) {
            int top = myArray[index];
            myArray[index] = null;
            index = index - 1;
            return top;
        } else throw new IllegalStateException ("Sorry, stack is empty.");
    }


    @Override
    public int peek() {
        if (index > -1) {
            return myArray[index];
        } else throw new IllegalStateException ("Sorry, stack is empty.");
    }
}
