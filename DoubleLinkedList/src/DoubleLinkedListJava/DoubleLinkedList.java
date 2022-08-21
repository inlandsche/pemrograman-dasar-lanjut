package DoubleLinkedListJava;

public class DoubleLinkedList {
    Node2P head;
    Node2P tail;

    int size = 0;

    DoubleLinkedList(){
        head = tail = null;
    }

    boolean isEmpty(){
        return (size==0);
    }

    int size(){
        return size;
    }

    void addFirst(Node2P input){
        if (isEmpty()){
            head = input;
            tail = input;
        }
        else {
            input.next = head;
            head.previous = input;
            head = input;
        }

        size++;
    }

    void addLast(Node2P input){
        if (isEmpty()){
            head = input;
            tail = input;
        }
        else {
            tail.next = input;
            input.previous = tail;
            tail = input;
        }

        size++;
    }

    void insertAfter(int key, Node2P input){
        Node2P temp = head;
        do{
            if (temp.data == (key)){
                input.previous = temp;
                input.next = temp.next;
                temp.next = input;
                input.next.previous = input;
                size++;
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    void insertBefore(int key, Node2P input){
        Node2P temp = head;

        while (temp != null){
            if (temp.data == key){
                input.previous = temp.previous;
                input.next = temp;
                temp.previous.next = input;
                temp.previous = input;
                size++;
                break;
            }
            temp = temp.next;
        }
    }

    void removeFirst(){
        Node2P temp = head;

        if (!isEmpty()){
            temp.next.previous = null;
            head = temp.next;
            size--;
        } else System.err.println("Data is empty!");
    }

    void removeLast(){
        Node2P temp = tail;

        if (!isEmpty()){
            temp.previous.next = null;
            tail = temp.previous;
            size--;
        } else System.err.println("Data is empty!");
    }

    void remove(int index){
        Node2P temp = head;

        if (index == 0) this.removeFirst();
        else {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.previous.next = temp.next;
            temp.previous = null;
        }
        size--;
    }

    void printInfo(){
        Node2P cursor = head;

        while (cursor != null){
            System.out.print(cursor.data + " ");
            cursor = cursor.next;
        }
        System.out.println();
    }


}
