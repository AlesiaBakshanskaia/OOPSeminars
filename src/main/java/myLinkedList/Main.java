package myLinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> numbers = new MyLinkedList<>();
        numbers.addLast(5);
        numbers.addLast(6);
        numbers.addLast(3);
        numbers.addLast(7);
        System.out.println(numbers.get(3));
        System.out.println(numbers.size());
        for (Integer element : numbers) {
            System.out.println(element);
        }
    }
}
