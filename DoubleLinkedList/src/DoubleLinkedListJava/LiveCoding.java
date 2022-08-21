package DoubleLinkedListJava;

import java.util.*;

public class LiveCoding {
}


class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        doubleLL ls = new doubleLL();


        while(in.hasNextInt()){
            ls.addLast(new Node(in.nextInt()));
        }


        for(int i = 0; i < ls.size(); i++){
            int a = i - 1;
            int b = i + 1;
//            if(a < 0) ls.get(a) = 0;
//            else if (b > ls.size() - 1) ls.get(b) = 0;
            System.out.print(ls.get(i -1) + ls.get(i + 1) + " ");
        }
    }
}

class doubleLL{
    Node head, tail;

    int size = 0;

    doubleLL(){
        head = tail = null;
    }

    boolean isEmpty(){
        return (size==0);
    }

    int size(){
        return size;
    }

    void addFirst(Node input){
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

    void addLast(Node input){
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

    public int get(int index){
        if(index < 0 || index >= size())
            return 0;
        int data = 0;
        for(Node pointer = this.head; pointer!=null;pointer = pointer.next){
            if(index == 0)
                data = pointer.data;
            index--;
        }
        return data;
    }


}

class Node{
    Node next, previous;
    int data;

    Node(int data){
        this.data = data;
    }
}
