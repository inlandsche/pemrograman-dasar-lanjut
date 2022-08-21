public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(new Node(34));
        queue.enqueue(new Node(38));
        queue.enqueue(new Node(45));
        queue.enqueue(new Node(50));

        queue.print();
    }
}
