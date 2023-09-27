package myLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList<T> implements MyList<T>{
    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size;

    public MyLinkedList() {
        firstNode = new Node<>(null, null, null);
        lastNode = new Node<>(null, firstNode, null);
        firstNode.setNext(lastNode);
        size = 0;
    }

    @Override
    public void addLast(T value) {
        Node<T> prevNode = lastNode.getPrev();
        Node<T> addNode = new Node<>(value, prevNode, lastNode);
        lastNode.setPrev(addNode);
        prevNode.setNext(addNode);
        size++;
    }
    @Override
    public T get(int index) {
        Node<T> result = firstNode.getNext();
        for (int i = 0; i < index; i++) {
//            result = getNextNode(result);
            result = result.getNext();
        }
        return result.getElement();
    }

//    private Node<T> getNextNode(Node<T> item) {
//        return item.getNext();
//    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public T next() {
                return get(index++);
            }
        };
    }
}
