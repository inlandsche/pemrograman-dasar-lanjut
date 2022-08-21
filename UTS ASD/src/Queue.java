
public class Queue {
    Node first, last;
    int size;

    public boolean isEmpty(){
        return size == 0;
    }

    Queue(){
        this.first = this.last = null;
    }

    Queue(Node input){
        this.first = this.last = input;
        size++;
    }

    public void enqueue(Node input){

        if (isEmpty()){
            this.first = this.last = input;
            size++;
        } else {
            input.prev = this.last;
            this.last.next = input;
            this.last = input;
            size++;
        }
    }

    public Node dequeue(){
        Node temp = first;

        if (!isEmpty()){
            first = first.next;
            size--;
        }else {
            System.err.println("Queue is empty!");
        }

        return temp;
    }

    public Node get(int index){
        Node temp = last;

        for (int i = 0; i < index; i++){
            if (temp == first) return temp;
            else temp = temp.prev;
        }

        return temp;
    }

    public void print(){
        Node temp = first;

        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

class Node{
    int data;
    String id;
    Node next, prev;

    Node(int data){
        this.data = data;
    }

    Node(int data, String id){
        this.data = data;
        this.id = id;
    }
}

