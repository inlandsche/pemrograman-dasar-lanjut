package DoubleLinkedListJava;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList ls = new DoubleLinkedList();

        ls.addFirst(new Node2P(4));
        ls.addFirst(new Node2P(3));
        ls.addFirst(new Node2P(2));
        ls.printInfo();

        ls.remove(0);
        ls.printInfo();
    }

}
