package stack;

public interface Queueable {
    boolean empty();
    boolean add(int e);
    int poll();
    int peek();
}
