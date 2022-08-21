package tugasASD;

public class SingleLinkedListCircular {
    Node head;
    Node tail;
    int size = 0;

    SingleLinkedListCircular(){
        head = tail = null;
    }

    int size(){
        return this.size;
    }

    boolean isEmpty(){
        return size == 0;
    }

    void addFirst(Node input){
        if (isEmpty()){
            head = tail = input;
        }
        else {
            input.pointer = head;
            tail.pointer = input;
            head = input;
        }
        size++;
    }

    void addLast(Node input){
        if (isEmpty()){
            head = tail = input;
        }
        else {
            tail.pointer = input;
            input.pointer = head;
            tail = input;
        }
        size++;
    }

    void insertAfter(Object key, Node input){
        Node temp = head;
        while (temp != null){
            if(temp.data.equals(key)){
                input.pointer = temp.pointer;
                temp.pointer = input;
                size++;
                break;
            }
            temp = temp.pointer;
        }
    }

    void insertBefore(Object key, Node input){
        Node temp = head;
        while (temp != null){
            if (temp.data.equals(key) && temp.equals(head)){
                this.addFirst(input);
                size++;
                break;
            }
            else if (temp.pointer.data.equals(key)){
                input.pointer = temp.pointer;
                temp.pointer = input;
                size++;
                break;
            }
            temp = temp.pointer;
        }
    }

    void removeFirst(){
        Node temp = head;

        if (!isEmpty()) {
            tail.pointer = temp.pointer;
            head = temp.pointer;
            temp = null;
            size--;
        }
        else System.err.println("Data is empty!");
    }

    void removeLast(){
        Node temp = head;

        if (!isEmpty()) {
            while (temp != null){
                if (temp.pointer.equals(tail)){
                    temp.pointer = head;
                    tail = temp;
                    size--;
                    break;
                }
                temp = temp.pointer;
            }
        }
        else System.err.println("Data is empty!");
    }

    void remove(Object key){
        Node temp = head;

        if (!isEmpty()){
            while (temp != null){
                if (temp.pointer.data.equals(key)){
                    temp.pointer = temp.pointer.pointer;
                    size--;
                    if (temp.pointer.equals(head)) tail = temp;
                    break;
                }
                else if (temp.data.equals(key) && temp.equals(head)){
                    this.removeFirst();
                    size--;
                    break;
                }
                temp = temp.pointer;
            }
        }
    }

    void get(int index){
        Node cursor = head;

        if (!isEmpty()) {
            for (int i = 0; i < index; i++) {
                cursor = cursor.pointer;
            }
            System.out.print(cursor.data);
        }
        else System.err.println("Data is empty!");
    }

    void printInfo(){
        Node cursor = head;
        while (cursor != null){
            if (cursor.equals(tail)) {
                System.out.print(cursor.data + " ");
                break;
            }
            else {
                System.out.print(cursor.data + " ");
                cursor = cursor.pointer;
            }
        }
        System.out.println();
    }


}
