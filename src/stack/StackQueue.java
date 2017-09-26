package stack;

public class StackQueue implements Queueable{
    Integer[] stackMain;
    Integer[] stackAuxiliary;
    int indexMain = -1;
    int indexAuxiliary = -1;

    public StackQueue(Integer[] stackMain, Integer[] stackAuxiliary) {

        this.stackMain = stackMain;
        this.stackAuxiliary = stackAuxiliary;

    }

    @Override
    public boolean isEmpty() {
        if (indexMain == -1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean add(int e) {
        // if stackAuxiliary is empty
            // if there is no place in the stackMain -> return false, do nothing
            // else there is a place in the stackMain
            // so add element and update indexMain
        // else move all elements from stackAuxiliary to stackMain
        // and add element, update index
        if (indexAuxiliary != -1) {
            moveToMain();
        }
        if (indexMain+1<stackMain.length) {
            indexMain++;
            stackMain[indexMain] = e;
            return true;
        }
        System.out.println("sorry, queue is already full, wait somewhere else");
        return false;
    }

    @Override
    public int poll() {
        // if stackMain is empty
        // if stackAuxiliary is not empty
        // take element from stackAuxiliary
        // move all elements but one from mainStack to auxiliary
        // take first element

        if (indexMain == -1) {
            if (indexAuxiliary != -1) {
                int temp = stackAuxiliary[indexAuxiliary];
                stackAuxiliary[indexAuxiliary] = null;
                indexAuxiliary--;
                return temp;
            } else return -1;
        }
        // move all elements but one from mainStack to auxiliary
        moveToAuxiliary();
        int temp = stackMain[indexMain];
        stackMain[indexMain] = null;
        indexMain--;
        return temp;
    }

    @Override
    public int peek() {
        // if stackMain is empty
            // if stackAuxiliary is not empty
            // report element from stackAuxiliary
        // move all elements but one from mainStack to auxiliary
        // report first element
        if (indexMain == -1) {
            if (indexAuxiliary != -1) {
                return stackAuxiliary[indexAuxiliary];
            } else return -1;
        }
        // move all elements but one from mainStack to auxiliary
        moveToAuxiliary();
        return stackMain[indexMain];
    }

    private void moveToAuxiliary() {
        while (indexMain>0) {
            indexAuxiliary++;
            stackAuxiliary[indexAuxiliary] = stackMain[indexMain];
            stackMain[indexMain] = null;
            indexMain--;
        }
        System.out.println("Everyting moved to aux, indexMain is " + indexMain);

    }

    private void moveToMain() {
        while (indexAuxiliary>-1) {
            indexMain++;
            stackMain[indexMain] = stackAuxiliary[indexAuxiliary];
            stackAuxiliary[indexAuxiliary] = null;
            indexAuxiliary--;
        }
    }

    @Override
    public String toString() {
        String display = "Main stack: ";
        for (Integer integer : stackMain) {
            display = display + integer + " ";
        }
        display = display + " Auxiliary stack: ";
        for (Integer integer : stackAuxiliary) {
            display = display + integer + " ";
        }
        return display;
    }
}
