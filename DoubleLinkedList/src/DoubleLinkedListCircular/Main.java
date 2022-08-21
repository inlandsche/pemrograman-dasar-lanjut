package DoubleLinkedListCircular;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedListCircular ls = new DoubleLinkedListCircular();

        ls.addFirst(new Node2P(30));
        ls.addFirst(new Node2P(20));
        ls.addFirst(new Node2P(10));
        ls.addLast(new Node2P(40));
        ls.addLast(new Node2P(50));

        System.out.println(ls.tail.next.data);


//        ls.printInfo();
//        ls.insertBefore(30, new Node2P(15));
//        ls.printInfo();
//        ls.insertAfter(50, new Node2P(25));
//        ls.printInfo();
//        ls.removeFirst();
//        ls.printInfo();
//        ls.removeLast();
//        ls.printInfo();
//        ls.remove(1);
//        ls.printInfo();
//        ls.get(1);

    }
}
