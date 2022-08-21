package modifiedDFS;

// pembuatan class Node
class Node{
    // deklarasi variabel data dengan
    // berbagai tipe data turunan Object
    Object data;

    // deklarasi Node kiri dan kanan
    Node left, right;

    public Node(Object data) {
        this.data = data;
        this.left = null;
        this.right= null;
    }
}

// pembuatan class BinaryTree
class BinaryTree{
    // deklarasi variabel root sebagai atribut
    Node root;

    public BinaryTree() {
        this.root = null;
    }

    // fungsi pencarian DFS atau preOrder
    void preOrder(Node node){
        // fungsi akan berjalan jika node tidak null
        if (node != null){
            // mencetak data pada setiap node
            System.out.print(node.data + " ");

            // melakukan fungsi rekursif pada node sebelah
            // kiri dan kanan
            preOrder(node.left);
            preOrder(node.right);
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

        System.out.println("Urutan rumah yang akan dikunjungi tukang pos berdasarkan DFS: ");
        bt.preOrder(bt.root);
    }
}
