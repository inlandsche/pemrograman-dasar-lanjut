package DoubleLinkedListJava;

public class Node2P {
    int data;
    Node2P next;
    Node2P previous;

    Node2P(){

    }

    Node2P(int theData) {
        data = theData;
    }

    Node2P(int theData, Node2P thePrevious, Node2P theNext) {
        data= theData;
        previous = thePrevious;
        next = theNext;
    }
}
