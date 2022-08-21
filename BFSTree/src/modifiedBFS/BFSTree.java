package modifiedBFS;

// pembuatan class Node
class Node{
    // deklarasi variabel data
    // dapat menggunakan beberapa tipe data turunan Object
    Object data;

    // deklarasi Node kiri dan kanan
    Node left, right;

    public Node(Object data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// pembuatan class BinaryTree
class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }

    // perhitungan tinggi dari tree
    int height(Node root){
        // jika root atau bagian teratas null
        // tinggi dari tree otomatis akan 0
        if (root == null) return 0;
        else {

            // menghitung tinggi anak root bagian kiri
            int leftHeight = height(root.left);
            // menghitung tinggi anak root bagian kanan
            // dilakukan secara rekursif
            int rightHeight = height(root.right);

            // mengembalikan nilai terbesar dari
            // tinggi bagian kiri dan kanan kemudian ditambah dengan 1
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    // fungsi untuk mencetak data atau node
    void currentNode(Node root, int level){
        if (root == null) return;

        // jika level pada node sama dengan satu
        // program akan mencetak data pada node tersebut
        if (level == 1)
            System.out.print(root.data + " ");

        // jika level pada node lebih dari satu
        else if (level > 1) {
            // digunakan fungsi rekursif untuk mencetak keseluruhan
            // node, baik bagian kiri maupun kanan
            // level akan di decrement untuk setiap pengerjaan fungsi
            currentNode(root.left, level-1);
            currentNode(root.right, level-1);
        }
    }

    // fungsi pencarian BFS
    void BFSTree(){
        // memasukkan tinggi dari tree ke dalam variabel height
        int height = height(root);

        // melakukan looping untuk mencetak data berdasarkan
        // BFS pada tree (level order transversal)
        for (int i = 1; i <= height ; i++) {
            currentNode(root, i);
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        // deklarasi data rumah yang akan dikunjungi tukang pos
        bt.root = new Node("ADI");
        bt.root.left = new Node("BOBON");
        bt.root.right = new Node("CINTA");
        bt.root.right.left = new Node("FAFA");
        bt.root.left.left = new Node("DANU");
        bt.root.left.left.right = new Node("GILANG");

        System.out.println("Urutan rumah yang akan dikunjungi tukang pos berdasarkan BFS: ");
        bt.BFSTree();
    }
}




