package LinkedListJava;

public class LinkedList {
    Node head, tail;
    int size = 0;

    void inisialisasi(){
        head = tail = null;
    }

    boolean isEmpty(){
        return (size == 0);
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
            input.pointer = head;
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
            tail.pointer = input;
            tail = input;
        }
    }

    void insertAfter(Object key, Node input){
        Node temp = head;
        do {
            if(temp.data.equals(key)){
                input.pointer = temp.pointer;
                temp.pointer = input;
                size++;
                break;
            }
            temp = temp.pointer;
        }
        while (temp != null);
    }

    void insertBefore(Object key, Node input){
        Node temp = head;

        do{
            if(temp.data.equals(key) && temp.equals(head)){
                this.addFirst(input);
                System.out.println("Insert data is succeed.");
                break;
            }
            else if(temp.pointer.data.equals(key)){
                input.pointer = temp.pointer;
                temp.pointer = input;
                System.out.println("Insert data is succeed.");
                break;
            }
            temp = temp.pointer;
        }
        while (temp != null);
    }

    void removeFirst(){
        Node temp = head;
        if(!isEmpty()) {
            if (head == tail){
                head = tail = null;
            }
            else {
                head = temp.pointer;
                temp = null;
            }
            size--;
        }
        else System.out.println("Data is empty!");
    }

    void removeLast(){
        Node temp = head;
        if(!isEmpty()){
            if (tail == head){
                head = tail = null;
            }
            else{
                while (temp.pointer != tail){
                    temp = temp.pointer;
                }
                temp.pointer = null;
                tail = temp;
                temp = null;
            }
            size--;
        }
        else System.out.println("Data is empty!");
    }

    void remove(Object key){
        Node temp = head;
        if (!isEmpty()){
            while (temp != null){
                if (temp.pointer.data.equals(key)){
                    temp.pointer = temp.pointer.pointer;
                    if(temp.pointer == null)
                        tail = temp;
                    break;
                }
                else if ((temp.data == key)&&(temp == head)){
                    this.removeFirst();
                    break;
                }
                temp = temp.pointer;
            }
        }
        else System.out.println("Data is empty!");
        size--;
    }

    public void cetakLinkedlist() {
        Node p = head;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.pointer;
        }
        System.out.println();
    }

    void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index = " + index + " size = " + size);
    }

    public Object get(int index) {
        checkIndex(index);
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.pointer;
        }
        return currentNode.data;
    }

    public int indexOf(Object theElement) {
        Node currentNode = head;
        int index = 0;
        while (currentNode != null && !currentNode.data.equals(theElement)){
            currentNode = currentNode.pointer;
            index++;
        }
        if (currentNode == null) return -1;
        else return index;
    }

    Object removeIndex(int index) {
        checkIndex(index);
        Object removedElement;
        if (index == 0) {
            removedElement = head.data;
            head = head.pointer;
        }
        else {
            Node q = head;
            for (int i = 0; i < index - 1; i++)
                q = q.pointer;
            removedElement = q.pointer.data;
            q.pointer = q.pointer.pointer;
            tail = q;
        }
        size--;
        return removedElement;
    }

    public void addIndex(int index, Object theElement) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException("index = " + index + " size = " + size);
        if (index == 0) head = new Node(theElement, head);
        else {
            Node p = head;
            for (int i = 0; i < index - 1; i++)
                p = p.pointer;
            p.pointer = new Node(theElement, p.pointer);
        }
        size++;
    }

    void replace(int index, Node inputData){
        Node temp = head;
        for (int i = 0; i < index; i++){
            temp = temp.pointer;
        }

        Node bfrTemp = head;
        for (int i = 0; i < index - 1; i++){
            bfrTemp = bfrTemp.pointer;
        }

        bfrTemp.pointer = inputData;
        inputData.pointer = temp.pointer;
        temp = null;
    }

}
