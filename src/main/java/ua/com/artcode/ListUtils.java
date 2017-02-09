package ua.com.artcode;

public class ListUtils {

    public static A<String> createStringList() {
        A<String> head = new Node<>("A");
        A<String> second = new Node<>("B");
        A<String> third = new Node<>("C");
        A<String> fourth = new Node<>("D");
        A<String> fifth = new Node<>("E");
        A<String> sixth = new Node<>("F");
        A<String> seventh = new Node<>("G");
        head.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(sixth);
        sixth.setNext(seventh);
        return head;
    }

    public static <T> A<T> reversion(A<T> head) {
        Node<T> iterator = (Node<T>) head;
        Node<T> previous = null;
        while (iterator != null) {
            Node<T> next = (Node<T>) iterator.getNext();
            iterator.setNext(previous);
            previous = iterator;
            iterator = next;
        }
        head = previous;
        return head;
    }
}
