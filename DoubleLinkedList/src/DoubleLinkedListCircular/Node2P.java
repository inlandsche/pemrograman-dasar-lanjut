package DoubleLinkedListCircular;

public class Node2P {
    Object data;
    Node2P next;
    Node2P previous;

    Node2P(){

    }

    Node2P(Object data) {
        this.data = data;
    }

    Node2P(Object data, Node2P previous, Node2P next) {
        this.data = data;
        this.previous = previous;
        this.next = next;
    }
}
