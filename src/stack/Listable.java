package stack;

public interface Listable {
    boolean add(int value, int pos);
    boolean remove(int pos);
    boolean removeElement(int value);
    int find(int e);
    Integer first();
    Integer last();
    void clear();
    boolean empty();
    void print();
}


