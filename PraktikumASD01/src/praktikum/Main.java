package praktikum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        SinglyLinkedList list = new SinglyLinkedList();

        for(int i = 0; i < N; i++){
            int input = in.nextInt();

            if(i == 0){
                list.addFirst(new Node(input));
            }
            else{

                if(input < list.head.data){
                    list.addFirst(new Node(input));
                    list.head.data = input;
                }
                else if(input > list.tail.data){
                    list.addLast(new Node(input));
                    list.tail.data = input;
                }
            }
        }

        list.cetakLinkedList();

    }
}

class SinglyLinkedList{

    public Node head;
    public Node tail;
    int size;

    SinglyLinkedList(){
        this.head = tail = null;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return this.size;
    }

    public void addFirst(Node add){
        if(isEmpty()){
            head = tail = add;
        }
        else {
            add.next = head;
            head = add;
        }
        size++;
    }

    public void addLast(Node add){
        if(isEmpty()){
            head = tail = add;
        }
        else {
            tail.next = add;
            tail = add;
        }
        size++;
    }

    public int get(int index){
        Node cursor = head;

        for(int i = 0; i < index; i++){
            cursor = cursor.next;
        }

        return cursor.data;

    }

    public void cetakLinkedList(){
        Node cursor = head;

        while(cursor != null){
            System.out.print(cursor.data + " ");
            cursor = cursor.next;
        }

    }
}

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}


