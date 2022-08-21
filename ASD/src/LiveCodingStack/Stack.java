package LiveCodingStack;

public class Stack {
    private StackNode top;
    private int size;

    public Stack(){
        this.top = null;
        this.size = 0;
    }

    public Stack(int data){
        this.top = new StackNode(data);
        size++;
    }

    boolean isEmpty(){
        return size == 0;
    }

    public int getSize(){
        return this.size;
    }

    public void push(int data){
        StackNode temp = new StackNode(data);

        if (isEmpty()){
            this.top = temp;
            size++;
        } else {
            temp.next = this.top;
            this.top = temp;
            size++;
        }
    }

    public int pop(){
        int poped = this.top.data;

        if (isEmpty()){
            System.err.println("Stack is empty!");
        } else {
            this.top = this.top.next;
            size--;
        }

        return poped;
    }

    public int peek(){
        int peeked = this.top.data;

        if (isEmpty()) System.err.println("Stack is empty!");

        return peeked;
    }

    public void print(){
        StackNode temp = this.top;

        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

}

class StackNode{
    int data;
    StackNode next;

    StackNode(int data){
        this.data = data;
    }
}
