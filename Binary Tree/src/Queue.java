public class Queue {
    Node first,last;
    int size;

    public Queue(){}
    public Queue(Object data){
        first = last = new Node(data);
        size++;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(Object data){
        Node input = new Node(data);
        if(isEmpty()){
            first = last = input;
        } else {
            input.prev = last;
            last.next = input;
            last = input;
        }
        size++;
    }

    public Object dequeue(){
        if(isEmpty()){
            return null;
        } else {
            Object result = first.data;
            first = first.next;
            size--;
            return result;
        }

    }

    public Object peek(){
        if(isEmpty()){
            return null;
        } else {
            return first;
        }
    }

    public void print(){
        Node pointer = first;
        while(pointer != null){
            System.out.print(pointer.data + " ");
            pointer = pointer.next;
        }
    }
}