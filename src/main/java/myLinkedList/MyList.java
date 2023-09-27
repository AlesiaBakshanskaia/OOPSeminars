package myLinkedList;

public interface MyList<T> extends Iterable<T> {
    void addLast(T value);

    T get(int index);

    int size();
}
