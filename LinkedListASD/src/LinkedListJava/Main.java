package LinkedListJava;

public class Main {
    public static void main(String[] args) {
        // membuat object
        LinkedList linkedList = new LinkedList();

        // menambahkan data node
        System.out.println("Menambahkan data node");
        linkedList.addFirst(new Node(400));
        linkedList.addFirst(new Node(300));
        linkedList.addFirst(new Node(200));
        linkedList.addFirst(new Node(100));
        linkedList.cetakLinkedlist();

        // menambahkan data 500 dari belakang
        System.out.println("Menambahkan data 500 dari belakang");
        linkedList.addLast(new Node(500));
        linkedList.cetakLinkedlist();

        // menambahkan data 50 dari depan
        System.out.println("Menambahkan data 50 dari depan");
        linkedList.addFirst(new Node(50));
        linkedList.cetakLinkedlist();

        // menambahkan node dengan data 250 setelah node 200
        System.out.println("Menambahkan node dengan data 250 setelah node 200");
        linkedList.insertAfter(200,new Node(250));
        linkedList.cetakLinkedlist();

        // menghapus node depan
        System.out.println("Menghapus node depan");
        linkedList.removeFirst();
        linkedList.cetakLinkedlist();

        //menghapus node belakang
        System.out.println("Menghapus node belakang");
        linkedList.removeLast();
        linkedList.cetakLinkedlist();

        // mengakses data dari node
        System.out.println("Mengakses data dari node");
        linkedList.cetakLinkedlist();

        // replace data
        System.out.println("Replace Data index ke-2 menjadi 100");
        linkedList.replace(2,new Node(100));
        linkedList.cetakLinkedlist();
    }
}
