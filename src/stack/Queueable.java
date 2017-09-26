package stack;

public interface Queueable {
    boolean isEmpty();
    boolean add(int e);
    int poll();
    int peek();
}
