package tugasASD;

public class Main {
    public static void main(String[] args) {
        SingleLinkedListCircular list = new SingleLinkedListCircular();
        list.addFirst(new Node(4));
        list.addFirst(new Node(3));
        list.addFirst(new Node(2));
        list.addFirst(new Node(1));

        list.printInfo();
        list.insertAfter(3,new Node(5));
        list.printInfo();
        list.removeFirst();
        list.printInfo();
        list.removeLast();
        list.printInfo();
        list.get(2);
    }
}
