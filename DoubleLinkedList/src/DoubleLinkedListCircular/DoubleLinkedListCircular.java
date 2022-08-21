package DoubleLinkedListCircular;

public class DoubleLinkedListCircular {
    Node2P head;
    Node2P tail;
    int size = 0;

    DoubleLinkedListCircular(){
        head = tail = null;
    }

    boolean isEmpty(){
        return size == 0;
    }

    int size(){
        return this.size;
    }

    void addFirst(Node2P input){
        if (isEmpty()){
            head = input;
            tail = input;

            head.previous = input;
            tail.next = input;
        }
        else {
            input.next = head;
            head.previous = input;
            head = input;
            input.previous = tail;
            tail.next = input;
        }
        size++;
    }

    void addLast(Node2P input){
        Node2P temp = tail;

        if (isEmpty()){
            head = tail = input;

            head.previous = input;
            tail.next = input;
        }
        else{
            input.previous = tail;
            tail.next = input;
            input.next = head;
            tail = input;
            head.previous = input;
        }

        size++;
    }

    void insertBefore(Object key, Node2P input){
        Node2P temp = head;

        while (temp != null){
            if (temp.data.equals(key) && temp.equals(head)){
                this.addFirst(input);
                break;
            } else if (temp.next.data.equals(key)){
                input.previous = temp;
                input.next = temp.next;
                temp.next = input;
                input.next.previous = input;
                size++;
                break;
            }
            temp = temp.next;
        }
    }

    void insertAfter(Object key, Node2P input){
        Node2P temp = head;

        while (temp != null){
            if (temp.data.equals(key) && temp.equals(tail)){
                this.addLast(input);
                break;
            }
            else if (temp.data.equals(key)){
                input.previous = temp;
                input.next = temp.next;
                temp.next = input;
                temp.next.previous = input;
                size++;
                break;
            }
            temp = temp.next;
        }
    }

    void removeFirst(){
        Node2P temp = head;

        tail.next = temp.next;
        head = temp.next;
        head.previous = tail;
        size--;
    }

    void removeLast(){
        Node2P temp = tail;

        head.previous = temp.previous;
        tail = temp.previous;
        tail.next = head;
        size--;
    }

    void remove(int index){
        Node2P temp = head;

        if (index == 0) this.removeFirst();
        else {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.previous.next = temp.next;
            temp = null;
            size--;
        }
    }

    void get(int index){
        Node2P cursor = head;

        if (index > 0) {
            for (int i = 0; i < index; i++) {
                cursor = cursor.next;
            }
            System.out.println(cursor.data);
        }
    }

    void printInfo(){
        Node2P cursor = head;

        for (int i = 0; i < size; i++){
            System.out.print(cursor.data + " ");
            cursor = cursor.next;
        }

        System.out.println();
    }
}
