package stack;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyList implements Listable, Iterable<Integer> {
    private Element firstElement;
    int elementsNumber=0;

    public MyList() {
    }

    @Override
    public boolean add(int value, int pos) {
        if (pos == 0 ) {
            addFirst(value);
            elementsNumber++;
            return true;
        }

        Element e = findElement(pos-1);
        if (e==null) {
            System.out.println("Position is to far, I can't reach it.");
            return false;
        }

        Element newElement = new Element(value);
        newElement.next = e.next;
        e.next = newElement;
        return true;
    }


    private boolean addFirst(int value) {
        Element e = new Element(value);
        e.next = firstElement;
        firstElement = e;
        System.out.println(e.value);
        System.out.println(e.next);
        return true;
    }


    @Override
    public boolean remove(int pos) {
        if (pos == 0) {
            return removeFirst();
        }

        Element e = findElement(pos-1);
        if (e==null || e.next == null) {
            return false;
        }
        e.next = e.next.next;
        return true;
    }

    private boolean removeFirst() {
        if (firstElement == null) {
            return false;
        }
        firstElement = firstElement.next;
        return true;
    }


    @Override
    public boolean removeElement(int value) {
        if (firstElement == null) {
            return false;
        }
        if (firstElement.value == value) {
            return removeFirst();
        }
        for (Element el = firstElement; el.next !=null; el = el.next) {
            if (el.next.value == value) {
                el.next = el.next.next;
                return true;
            }
        }
        return false;
    }

    @Override
    public int find(int e) {
        return 0;
    }


    public Element findElement(int pos) {
        Element e = firstElement;
        for (int i=0; i<pos && e!=null; i++, e=e.next) {
        }
        return e;
    }

    @Override
    public Integer first() {
        if (firstElement !=null) return firstElement.value;
        return null;
    }



    @Override
    public Integer last() {
        if (firstElement == null) return null;
        Element e = firstElement;
        while (e.next != null) {
            e = e.next;
        }

        return e.value;
    }

    @Override
    public void clear() {
        firstElement = null;

    }

    @Override
    public boolean empty() {
        if (firstElement == null ) {
            return true;
        }
        return false;
    }

    @Override
    public void print() {
        System.out.println("printing list ");
        for (Element e = firstElement; e!=null; e=e.next) {
            System.out.print(e.value + " ");
        }
        System.out.println();
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            Element e = firstElement;


            @Override
            public boolean hasNext() {
                if (e.next != null) {
                    return true;
                }
                return false;
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("sorri");
                }

                return null;
            }
        };
    }

/*    @Override
    public void forEach(Consumer<? super Integer> action) {

    }

    @Override
    public Spliterator<Integer> spliterator() {
        return null;
    }*/
}
